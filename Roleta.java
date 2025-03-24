import java.util.Random;
import java.util.Scanner;

public class Roleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        while (true){
            Random random = new Random();

            int sorte = random.nextInt(11);


            System.out.println("Bem-Vindo a Roleta!!!");
            System.out.println("======================");
            System.out.println("1 - Jogar!");
            System.out.println("2 - Sair!");
            System.out.println("======================");
            int num1 = scanner.nextInt();

            if (num1 == 1){
                System.out.println("================================");
                System.out.println("Selecione um número de 0 á 10"); int esc = scanner.nextInt();
                System.out.println("================================");
                if (sorte == esc){
                    System.out.println("Você Ganhouu!!!");
                }else if (sorte != esc){
                    System.out.println("Você perdeu!!!");
                }
            }else if (num1 == 2){
                System.out.println("Obrigado por testar!! ");
                break;
            }else{
                System.out.println("Erro! Digite um valor valido!!");
            }
        }
        scanner.close();
    }
}