import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha um número: "); int esc = scanner.nextInt();

        int ant = esc - 1;
        int sus = esc + 1;

        System.out.print("O número escolhido foi "+esc);
        System.out.print("o Antecessor é "+ant+" e o sucessor é "+sus);
    scanner.close();
    }
}