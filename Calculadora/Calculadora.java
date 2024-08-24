import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        System.out.println("Bem-vindo à Calculadora!");

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble(); // Lê o primeiro número digitado pelo usuário

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble(); // Lê o segundo número digitado pelo usuário

        double soma = somar(num1, num2); // Chama o método somar e armazena o resultado na variável soma
        double subtracao = subtrair(num1, num2); // Chama o método subtrair e armazena o resultado na variável subtracao
        double multiplicacao = multiplicacao(num1, num2); // Chama o método multiplicacao e armazena o resultado na variável multiplicacao
        double divisao = dividir(num1, num2); // Chama o método dividir e armazena o resultado na variável divisao

        System.out.println("O Resultado da Soma é: " + soma);
        System.out.println("O Resultado da Subtração é: " + subtracao);
        System.out.println("O Resultado da Multiplicação é: " + multiplicacao);
        System.out.println("O Resultado da Divisão é: " + divisao);

        scanner.close();
    }

    public static double somar(double a, double b) {
        return a + b; // Retorna a soma de dois números
    }

    public static double subtrair(double a, double b) {
        return a - b; // Retorna a subtração de dois números
    }

    public static double multiplicacao(double a, double b) {
        return a * b; // Retorna a multiplicação de dois números
    }

    public static double dividir(double a, double b) {
        return a / b; // Retorna a divisão de dois números
    }
}
