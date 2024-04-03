package src;

import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        int numero = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem-vindo à Lista de Tarefas!\n"
                    + "1. Adicionar Tarefa\n"
                    + "2. Remover Tarefa\n"
                    + "3. Marcar Tarefa como Concluída\n"
                    + "4. Listar Tarefas\n"
                    + "5. Limpar Tarefas Concluídas\n"
                    + "6. Sair\n"
                    + "Escolha uma opção:");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite a tarefa a ser adicionada:");
                    String tarefa = scanner.nextLine();
                    adicionarTarefa(tarefa);
                    break;
                case 2:
                    System.out.println("Digite o número da tarefa a ser removida:");
                    numero = scanner.nextInt();
                    removerTarefa(numero);
                    break;
                case 3:
                    System.out.println("Digite o número da tarefa a ser marcada como concluída:");
                    numero = scanner.nextInt();
                    marcarTarefaComoConcluida(numero);
                    break;
                case 4:
                    listarTarefas();
                    break;
                case 5:
                    limparTarefasConcluidas();
                    break;
                case 6:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void adicionarTarefa(String tarefa) {
        // Adiciona a tarefa à lista
    }

    private static void removerTarefa(int numero) {
        // Remove a tarefa da lista
    }

    private static void marcarTarefaComoConcluida(int numero) {
        // Marca a tarefa como concluída
    }

    private static void listarTarefas() {
        // Lista todas as tarefas
    }

    private static void limparTarefasConcluidas() {
        // Remove todas as tarefas concluídas
    }
}
