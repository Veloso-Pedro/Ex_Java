import java.util.Scanner;

public class Calculadora_SomaeSub{
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Calculadora de soma e subtração ");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Sair");
            System.out.println("Escolha umas das opções: ");

            int Escolha = scanner.nextInt();

            if (Escolha == 3){
                System.out.println("Saindo...");
                System.out.println("OBRIGADO POR TESTAR!!!");
                break;
            }
            if (Escolha == 1 || Escolha == 2){
                System.out.println("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.println("DIgite o segundo númeor: ");
                double num2 = scanner.nextDouble();
                
                if (Escolha == 1){
                    System.out.printf("O resultado da soma é: %.2f %n ", (num1 + num2));    
                } else{
                    System.out.printf("O resultado da subtração é: %.2f %n ", (num1 - num2));
                }
            } else{
                System.out.println("ERRO!! escolha um operador valido!");
            } 
        }
        scanner.close();
    }
}