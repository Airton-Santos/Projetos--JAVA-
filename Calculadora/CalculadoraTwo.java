import java.util.Scanner; //Importa a classe Scanner para ler a entrada que o usuário colocar


public class CalculadoraTwo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário


        System.out.println("Bem vindo a Calculadora 2.0!");

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int escolha = scanner.nextInt(); // Lê a escolha do usuário

        double resultado = 0; // Variavél para armazenar o resultado da operação
        
        //usando Switch Case para diferentes tipos de escolhas

        switch (escolha) {
            case 1:
                    resultado = somar(num1, num2); //Chama o método Somar Se a escolha for 1
                    System.out.println("O resultado da Soma é: " + resultado);
                break;

            case 2:
                    resultado = subtrair (num1, num2); //Chama o método Subtrair Se a escolha for 1
                    System.out.println("O resultado da Subtração é: " + resultado);
                break;

            case 3:
                resultado = multiplicacao(num1, num2); //Chama o método Multiplicar Se a escolha for 1
                System.out.println("O resultado da Multiplicação é: " + resultado);
            break;

            case 4:
                    if(num2 != 0) { //Verificar se o divisor não é 0 para não dar erro
                        resultado = dividir(num1, num2); //Chama o método Dividir Se a escolha for 1
                        System.out.println("O resultado da Divisão é: " + resultado);
                    }
                    else {
                        System.out.println("Erro: Divisão por zero não é permitida!");
                    }
                break;

            default:
                    System.out.println("Escolha Inválida!");
                    break;

        }
        
        scanner.close(); //Fechar o scanner para não vazar dados!
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
