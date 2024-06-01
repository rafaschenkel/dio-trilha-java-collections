package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList = new ArrayList<>();

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(this.pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(this.pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas listPessoas = new OrdenacaoPessoas();

        listPessoas.adicionarPessoa("Pessoa 1", 33, 1.82);
        listPessoas.adicionarPessoa("Pessoa 2", 21, 1.75);
        listPessoas.adicionarPessoa("Pessoa 3", 12, 1.68);
        listPessoas.adicionarPessoa("Pessoa 4", 54, 1.90);
        listPessoas.adicionarPessoa("Pessoa 5", 7, 1.86);
        listPessoas.adicionarPessoa("Pessoa 6", 28, 1.72);
        listPessoas.adicionarPessoa("Pessoa 7", 15, 1.79);

        System.out.println(listPessoas.ordenarPorAltura());
        System.out.println(listPessoas.ordenarPorIdade());
    }

}
