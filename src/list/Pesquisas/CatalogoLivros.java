package list.Pesquisas;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros = new ArrayList<>();

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int anoLancamento) {
        Livro livro = new Livro(nome, autor, anoLancamento);
        this.listaLivros.add(livro);
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        if (!this.listaLivros.isEmpty()) {
            for (Livro livro : this.listaLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosDoAutor.add(livro);
                }
            }
        }
        return livrosDoAutor;
    }

    public List<Livro> pesquisaPorIntervaloLancamento(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!this.listaLivros.isEmpty()) {
            for (Livro livro : this.listaLivros) {
                if (livro.getAnoLancamento() >= anoInicial && livro.getAnoLancamento() <= anoFinal) {
                    livrosPorAno.add(livro);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!this.listaLivros.isEmpty()) {
            for (Livro livro : this.listaLivros) {
                if (livro.getTitulo().equals(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }

        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros listaLivros = new CatalogoLivros();

        listaLivros.adicionarLivro("Livro 1", "Amora", 2003);
        listaLivros.adicionarLivro("Livro 99", "Amora", 2023);
        listaLivros.adicionarLivro("Livro 2", "Jade", 2017);
        listaLivros.adicionarLivro("Livro 3", "Rafael", 1990);
        listaLivros.adicionarLivro("Livro 32", "Rafael", 1999);
        listaLivros.adicionarLivro("Livro 4", "Jessica", 1994);
        listaLivros.adicionarLivro("Livro 43", "Jessica", 1998);
        listaLivros.adicionarLivro("Livro 45", "Jessica", 2021);

        System.out.println(listaLivros.pesquisaPorTitulo("Livro 4"));
        System.out.println(listaLivros.pesquisarPorAutor("Amora"));
        System.out.println(listaLivros.pesquisaPorIntervaloLancamento(2000, 2024));
    }
}
