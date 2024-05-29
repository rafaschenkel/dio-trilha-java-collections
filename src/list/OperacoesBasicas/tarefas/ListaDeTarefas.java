package list.OperacoesBasicas.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    private List<Tarefa> listaDeTarefas;

    public ListaDeTarefas() {
        this.listaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        this.listaDeTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefas(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa tarefa : listaDeTarefas) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        listaDeTarefas.removeAll(tarefasParaRemover);
    }

    public void obterTotalTarefas() {
        System.out.println(this.listaDeTarefas.size());
    }

    public void obterDescricaoTarefas() {
        // for (Tarefa tarefa : listaDeTarefas) {
        // System.out.println(tarefa.getDescricao());
        // }
        System.out.println(listaDeTarefas);
    }

    public static void main(String[] args) {
        ListaDeTarefas tarefaList = new ListaDeTarefas();
        tarefaList.obterTotalTarefas();
        tarefaList.adicionarTarefa("Tomar cafe");
        tarefaList.obterTotalTarefas();
        tarefaList.adicionarTarefa("Tomar remedio");
        tarefaList.obterTotalTarefas();
        tarefaList.adicionarTarefa("Tomar remedio");
        tarefaList.obterTotalTarefas();
        tarefaList.adicionarTarefa("Tomar chimarrao");
        tarefaList.obterTotalTarefas();
        tarefaList.removerTarefas("Tomar remedio");
        tarefaList.obterTotalTarefas();
        tarefaList.obterDescricaoTarefas();
    }
}
