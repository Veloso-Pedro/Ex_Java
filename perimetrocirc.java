import java.util.Scanner;

public class perimetrocirc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Calculadora de Perímetro da Circunferencia\n");
        System.out.print("-------------------------------------------\n");
        System.out.print("Você deseja calcular o perímetro atraves do raio ou do diametro?\n");
        System.out.print("1 - Raio\n");
        System.out.print("2 - Diametro\n");
        int esc = scanner.nextInt();

        if (esc == 1){
            System.out.print("Digite o raio: "); double raio = scanner.nextDouble();
            System.out.printf("O perímetro da circunferencia é %.2f %n", (2*Math.PI*raio));
        } else if(esc == 2){
            System.out.print("Digite seu diametro: "); double diametro = scanner.nextDouble();
            System.out.printf("O perímetro da circunferencia é %.2f %n",(diametro*Math.PI));
        }
    scanner.close();
    }
}
