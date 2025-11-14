package br.com.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    // Princípio GRASP "Creator":
    // ---------------------------
    // A classe Main é quem guarda a lista de tarefas.
    // Como ela já é responsável por armazenar esses objetos,
    // faz sentido que também seja responsável por criá-los.
    // Por isso, Main é quem cria cada nova Task.
    private static List<Task> tasks = new ArrayList<>();


    // Princípio GRASP "Controller":
    // ------------------------------
    // A classe Main funciona como o "centro de comando" do programa.
    // Ela recebe as escolhas do usuário, decide o que deve acontecer
    // e chama os métodos necessários.
    // Ou seja, Main controla o fluxo da aplicação.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // remove o "enter" sobrando

            if (opcao == 1) {
                System.out.print("Descrição da tarefa: ");
                String desc = sc.nextLine();

                // GRASP Creator:
                // Main cria a tarefa porque ela já cuida da lista.
                Task t = new Task(desc);
                tasks.add(t);

                System.out.println("Tarefa adicionada.");
            }

            if (opcao == 2) {
                // GRASP Controller:
                // Main coordena a ação de listar as tarefas.
                if (tasks.isEmpty()) {
                    System.out.println("Nenhuma tarefa cadastrada.");
                } else {
                    System.out.println("\nTarefas:");
                    for (Task t : tasks) {
                        System.out.println("- " + t.getDescription());
                    }
                }
            }

        } while (opcao != 0);

        System.out.println("Encerrado.");
    }
}
1