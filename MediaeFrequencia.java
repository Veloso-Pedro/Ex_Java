import java.util.Scanner;

public class MediaeFrequencia {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Infome a média necessária para aprovação:  ");
        double  mediaN = scn.nextDouble();
        System.out.println("Digite a a freuencia mínima necessário:  ");
        double freqN = scn.nextDouble();
        System.out.println("============================================");
        System.out.println("Digite sua média: ");
        double media = scn.nextDouble();
        System.out.println("Digite sua frequencia: ");
        double freq = scn.nextDouble();

        if (mediaN == media && freqN == freq){
            System.out.println("Aluno Aprovado!!!");
        }else{
            System.out.println("Reprovado!!");
        }
        scn.close();
    }
}
