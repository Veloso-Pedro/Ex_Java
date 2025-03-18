import java.util.Random;
import java.util.Scanner;

public class Roleta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            Random random = new Random();

            int sorte = random.nextInt(11);

            System.out.println(sorte);

            System.out.println("Bem-Vindo a Roleta!!!");
            System.out.println("======================");
            System.out.println("Selecione um número de 0 á 10"); int esc = scanner.nextInt();

            if (sorte == esc){
                System.out.println("Você Ganhouu!!!");
            }else{
                System.out.println("Você perdeu!!!");
            }
        }
    }
}