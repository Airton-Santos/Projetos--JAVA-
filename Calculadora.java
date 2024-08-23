import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuario

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Criar um objeto para ler a entrada do usuario

        System.out.println("Bem vindo a calculadora");

        System.out.println("Digite o primeiro número");
        double num1 = scanner.nextDouble();
    }
    
}