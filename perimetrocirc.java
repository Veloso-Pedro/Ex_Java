import java.util.Scanner;

public class perimetrocirc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.print("Calculadora de Perímetro da Circunferencia\n");
            System.out.print("-------------------------------------------\n");
            System.out.print("Você deseja calcular o perímetro atraves do raio ou do diametro?\n");
            System.out.print("1 - Raio\n");
            System.out.print("2 - Diametro\n");
            System.out.println("3 - Sair");
            System.out.println("=========================================");
            int esc = scanner.nextInt();

            if (esc == 1){
                System.out.println("=========================================");
                System.out.print("Digite o raio: "); double raio = scanner.nextDouble();
                System.out.printf("O perímetro da circunferencia é %.2f %n", (2*Math.PI*raio));
                System.out.println("=========================================");
            } else if(esc == 2){
                System.out.println("=========================================");
                System.out.print("Digite seu diametro: "); double diametro = scanner.nextDouble();
                System.out.printf("O perímetro da circunferencia é %.2f %n",(diametro*Math.PI));
                System.out.println("=========================================");
            }else if(esc == 3){
                System.out.println("=========================================");
                System.out.println("OBRIGADO POR TESTAR!!");
                System.out.println("Saindo...");
                System.out.println("=========================================");
                break;
            }else{
                System.out.println("=========================================");
                System.out.println("ERRO!!");
                System.out.println("DIGITE UM VALOR VALIDO");
                System.out.println("=========================================");
            }
        }
        scanner.close();
    }
}

