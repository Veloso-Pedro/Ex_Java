import java.util.Scanner;

public class EntradadeBalada {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scn.nextInt();
        System.out.println("Está acompanhada dos pais (S/N): ");
        String acom = scn.next().toUpperCase();

        if (idade >= 18 || acom.equals("S")){
            System.out.println("Entrada Autorizada! Aproveite");
        }else{
            System.out.println("Entrada Negada!");
        }
        scn.close();
    }
    
}
