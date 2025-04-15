import java.util.Scanner;

public class L3_Calculadora{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        while (true){

            System.out.println("Calculadora Simplificada");
            System.out.println("========================");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Sair");
            System.out.print("Digite o número da operação: ");
            int esc = scn.nextInt();

            if ( esc == 1){
                System.out.println("===========================");
                System.out.println("Digite a primeira parcela: ");
                int num1 = scn.nextInt();
                System.out.println("Digite a segunda parcela: ");
                int num2 = scn.nextInt();
                System.out.println(num1 +"+"+ num2+ "=" + (num1+num2));
            }else if (esc == 2){
                System.out.println("===========================");
                System.out.println("Digite o Minuendo: ");
                int num1 = scn.nextInt();
                System.out.println("Digite o subtraendo: ");
                int num2 = scn.nextInt();
                System.out.println(num1 +"-"+ num2+ "=" + (num1-num2));
            }else if (esc == 3){
                System.out.println("===========================");
                System.out.println("Digite o fator 1: ");
                int num1 = scn.nextInt();
                System.out.println("Digite o fator 2: ");
                int num2 = scn.nextInt();
                System.out.println(num1 +"X"+ num2+ "=" + (num1*num2));
            }else if (esc == 4) {
                System.out.println("===========================");
                System.out.println("Digite o dividendo: ");
                int num1 = scn.nextInt();
                System.out.println("Digite o divisor: ");
                int num2 = scn.nextInt();
                try {
                    if (num1 % num2 == 0) {
                        System.out.println(num1 + "÷" + num2 + "=" + (num1 / num2));
                    } else {
                        System.out.println(num1 + "÷" + num2 + "=" + (num1 / num2) + ", resto = " + (num1 % num2));
                    }
                } catch(ArithmeticException e){
                    System.out.println("Erro: Divisão por zero não é permitida.");
                } catch(Exception e){

                }
            }else if (esc == 5){
                System.out.println("===========================");
                System.out.println("Obrigado por testar!!!");
                break;
            }
            scn.close();
        }
    }
}
