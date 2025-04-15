import java.util.Scanner;

public class MediaeRecu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite sua média: ");
        double media = scn.nextDouble();
        System.out.println("Fez recuperação (S/N): ");
        String recu = scn.next().toUpperCase();

        if (media >= 6 || recu.equals("S")){
            System.out.println("Aprovado!!");
        }else{
            System.out.println("Reprovado!!");
        }
        scn.close();
    }
}
