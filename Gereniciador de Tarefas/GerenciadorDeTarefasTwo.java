//importações de classes

import java.util.Scanner;
import java.util.ArrayList;

public class GerenciadorDeTarefasTwo {
    public static void main(String[] args){
        ArrayList<String> tarefas = new ArrayList<>(); //Faz uma lista dentro do progama
        Scanner scanner = new Scanner(System.in);   //Faz um scanner para ler a entrada do usuário
        boolean continuar = true;


        //Sistema de repetição 
        while (continuar) {

            //Opções
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Exibir tarefas");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt(); //Escolher uma das opção a cima
            scanner.nextLine();  //Consumir nova linha

            //Sistema de opções

            switch (opcao) {
                case 1:
                        adicionarTarefa(tarefas, scanner);
                    break;
                
                case 2:
                        removerTarefas(tarefas, scanner);
                    break;
                
                case 3:
                        exibirTarefas(tarefas);
                    break;

                case 4: 
                        continuar = false;
                    break;

                default:
                        System.out.println("Essa opção é inválida. Tente novamente.");
                    break;
            }

        }

        scanner.close();

    }

    public static void adicionarTarefa(ArrayList<String> tarefas, Scanner scanner) {
        System.out.println("Digite a tarefa:");
        String tarefa = scanner.nextLine();
        tarefas.add(tarefa);
        System.out.println("Tarefa Adicionada com sucesso");
    }

    public static void exibirTarefas(ArrayList<String> tarefas) {
        System.out.println("Tarefas:");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + " - " + tarefas.get(i));
        }
    }

    public static void removerTarefas(ArrayList<String> tarefas, Scanner scanner) {
        exibirTarefas(tarefas);
        System.out.println("Digite o número da tarefa que deseja remover:");
        int indice = scanner.nextInt();

        if (indice > 0 && indice <= tarefas.size()) {
            tarefas.remove(indice - 1);
            System.out.println("Tarefa removida com sucesso");
        }
        else {
            System.out.println("Tarefa não encontrada");
        }
    }
}
