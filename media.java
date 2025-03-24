import java.util.Scanner;

public class media {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: "); double nota1 = scanner.nextDouble();
        System.out.print("Digite sua segunda nota: "); double nota2 = scanner.nextDouble();
        System.out.print("Digite sua terceira nota: ");double nota3 = scanner.nextDouble();
        
        System.out.printf("Sua Média é %.2f %n ", ((nota1+nota2+nota3)/3));
    scanner.close();
    }
}

