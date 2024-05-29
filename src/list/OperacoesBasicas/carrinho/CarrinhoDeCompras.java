package list.OperacoesBasicas.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItemCarrinho(String nome, double preco, int quantidade) {
        Item newItem = new Item(nome, preco, quantidade);
        this.carrinhoCompras.add(newItem);
    }

    public void removerItemCarrinho(String nome) {
        if (!this.carrinhoCompras.isEmpty()) {
            List<Item> itensParaRemover = new ArrayList<>();
            for (Item item : this.carrinhoCompras) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(item);
                }
            }
            this.carrinhoCompras.removeAll(itensParaRemover);

        } else {
            System.out.println("Seu carrinho está vazio");
        }
    }

    public void calcularValorTotal() {
        if (!this.carrinhoCompras.isEmpty()) {
            double valorTotal = 0;
            for (Item item : this.carrinhoCompras) {
                valorTotal += item.getPreco() * item.getQuantidade();
            }
            System.out.println("Valor total do carrinho é: R$ " + valorTotal);
        } else {
            System.out.println("Seu carrinho está vazio");
        }
    }

    public void exibirCarrinho() {
        System.out.println(this.carrinhoCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras meuCarrinho = new CarrinhoDeCompras();

        meuCarrinho.removerItemCarrinho("Placa de video");
        meuCarrinho.calcularValorTotal();

        meuCarrinho.adicionarItemCarrinho("Placa de video", 600.59, 1);
        meuCarrinho.adicionarItemCarrinho("Fan Aigo RGB", 29.99, 2);
        meuCarrinho.adicionarItemCarrinho("Monitor AOC 22", 1499.79, 1);
        meuCarrinho.adicionarItemCarrinho("Monitor Samsung 22", 1899.79, 1);
        meuCarrinho.adicionarItemCarrinho("Fan Aigo RGB", 29.99, 1);

        meuCarrinho.calcularValorTotal();
        meuCarrinho.removerItemCarrinho("Monitor Samsung 22");

        meuCarrinho.exibirCarrinho();
        meuCarrinho.calcularValorTotal();
    }
}
