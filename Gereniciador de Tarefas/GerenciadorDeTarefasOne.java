//importação de classes

import java.util.Scanner;
import java.util.ArrayList;

//Processo

public class GerenciadorDeTarefasOne {

    //Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //faz um scanner para ler dados
        ArrayList<String> tarefas = new ArrayList<>(); //faz uma lista dentro do nosso progama

        System.out.print("Bem-vindo ao Gerenciador de Tarefas!\n");

        //Chamar outros métodos para adicionar 
        adicionarTarefa(tarefas, scanner);

        //mostra as tarefas
        mostrarTarefas(tarefas);

        scanner.close();


    }


    //método para adicionar uma tarefa
    public static void adicionarTarefa(ArrayList<String> tarefas, Scanner scanner) {
        System.out.print("Digite a tarefa: ");
        String tarefa = scanner.nextLine(); //vai pegar a tarefa que o usuario escreveu para adicionar
        tarefas.add(tarefa); //adicionar tudo que estiver em tarefa vai ser colocado detro de tarefas
        System.out.println("Tarefa Adicionada: " + tarefa);

    }

    //métodos para mostrar as tarefas
    public static void mostrarTarefas(ArrayList<String> tarefas) {
        System.out.println("Suas Tarefas:");
        for (int i = 0; i <  tarefas.size(); i++) { // se a variável i for menor que a quantidade de tarefas ele irá mostra uma por uma das tarefas

            System.out.println((i + 1) + " - " + tarefas.get(i)); //Exibe as tarefas na lista
        }
    }
    
}