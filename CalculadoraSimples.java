import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("CALCULADOR SIMPLES");
            System.out.println("------------------");
            System.out.println("Escolh qual operação você deseja:");
            System.out.println("1 - Soma");
            System.out.println("2 - Susbtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potenciação");
            System.out.println("0 - Sair");
            int esc = scanner.nextInt();

            if (esc == 1 || esc == 2 || esc == 3 || esc == 4){
                System.out.println("Digite o primeiro número: "); double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número: "); double num2 = scanner.nextDouble();
                if(esc == 1){
                    System.out.printf("O resultado da soma é %.2f %n ",(num1 + num2));
                }else if (esc == 2){
                    System.out.printf("O resultado da Subtração é %.2f %n ",(num1 - num2));
                }else if (esc == 3){
                    System.out.printf("O resultado da multiplicação é %.2f %n ", (num1 * num2));
                }else if (esc == 4){
                    System.out.printf("O resultado da divisão é %.2f %n",(num1/num2));
                }
            }else if (esc == 5){
                System.out.println("Digite a base: "); int base = scanner.nextInt();
                System.out.println("Digite o expoente: "); int exp = scanner.nextInt();
                System.out.println("O resultado da potenciação é: "+(Math.pow(base,exp)));
            }else if (esc == 0){
                System.out.println("OBRIGADO POR TESTAR ;)");
                break;
            }else{
                System.out.print("ERRO!! DIGITE UM VALOR VALIDO!!");
            }
        }

            scanner.close();
    } 
}
