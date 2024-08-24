import java.util.Scanner; //importa o scanner para leitura de dados

public class CalculadoraThree {

    public static void main(String[] args) {  //tudo que estiver aqui dentro do main será executado

        Scanner scanner = new Scanner(System.in); // Cria uma variavel onde vai obter o scanner na entrada de dados
        
        System.out.println("Bem vindo a Calculadora 3.0"); //Mensagem de bem vindo

        System.out.println("Digite o primeiro número (Se for potência esse é a Base)");
        double num1 = scanner.nextDouble();  //Usa o scanner para pegar o primeiro número

        System.out.println("Digite o segundo número (Se for potência esse é o expoente)");
        double num2 = scanner.nextDouble(); //Usa o scanner para pegar o segundo número


        //Manda você escolher uma das alternativas
        System.out.println("Escolha uma das opções");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Módulo (Resto da divisão)");
        System.out.println("6 - Potência");
        int escolha = scanner.nextInt(); // Usa o scanner para pegar a entrada do dados do usuario para escolher uma das alternativas a cima.

        double resultado = 0;

        switch (escolha) {
            case 1:
                resultado = somar(num1, num2); //vai chamar o método que irá fazer a soma dos dois números
                System.out.println("O resultado da Soma é: " + resultado);
                break;

            case 2:
                resultado = subtrair(num1, num2); //vai chamar o método que irá fazer a subtração dos dois números
                System.out.println("O resultado da Subtração é: " + resultado);
                break;

            case 3:
                resultado = multiplicacao(num1, num2); //vai chamar o método que irá fazer a multiplicão dos dois números
                System.out.println("O resultado da Multiplicação é: " + resultado);
                break;

            case 4:

                if(num2 != 0) { //Impede que alguém tente usar 0 na divisão
                    resultado = divisao(num1, num2); //vai chamar o método que irá fazer a divisão dos dois números
                    System.out.println("O resultado da Divisão é: " + resultado);
                }
                else   {
                    System.out.println("Erro: Divisão por zero não é permitida!"); // mostra a mensagem de erro
                }
                break;

            case 5:
                resultado = modulo(num1, num2); //vai chamar o método que irá fazer a divisão e mostrar o resto da divisão dos dois números
                System.out.println("O resultado do resto da divisão é: " + resultado);
                break;

            case 6:
                resultado = potencia(num1, num2);  //vai chamar o método que irá fazer a potencia dos dois números
                System.out.println("O resultado da Potenciação é: " + resultado);
                break;
        
            default:

                System.out.println("Por favor digite uma operação valída"); //se escolher qualquer outra alternativa que não esteja dentro as opções, essa mensagem irá aparecer!
    
                break;
        }

        scanner.close();

    }
    
    public static double somar(double a, double b) {  //vai somar os dois números
        return a + b;
    }

    public static double subtrair(double a, double b) { //vai subtrair os dois números
        return a - b;
    }

    public static double multiplicacao(double a, double b) { //vai multiplicar os dois números
        return a * b;
    }

    public static double divisao(double a, double b) { //vai dividir os dois números
        return a / b;
    }

    public static double modulo(double a, double b) {  //vai achar o resto da divisão
        return a % b;
    }

    public static double potencia(double a, double b) { //vai fazer a potenciação dos dois números
        return Math.pow(a, b);
    }

}