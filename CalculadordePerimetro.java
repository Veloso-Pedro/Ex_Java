import java.util.Scanner;

public class CalculadordePerimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Calculadora de Perímetros");
            System.out.println("===========================");
            System.out.println("Escolha qual forma geometrica você deseja: ");
            System.out.print("1 - Quadrado\n2 - retangulo\n3 - triangulo\n4 - circunferencia\n5 -  Sair ");
            int esc = scanner.nextInt();

            if (esc == 1){
                System.out.println("Digite o lado: ");
                double num1 = scanner.nextDouble();

                System.out.println("O perímetro do seu quadrado é "+(num1 * 4));
            }else if (esc == 2){
                System.out.println("Digite o valor do maior lado: ");
                double ladoM = scanner.nextDouble();
                System.out.println("Digite o valor do menor lado: ");
                double ladom = scanner.nextDouble();

                System.out.println("O perímetro do seu retangulo é "+(2* (ladoM + ladom)));
            }else if (esc == 3){
                System.out.println("Digite o primeiro lado do triângulo: ");
                double a = scanner.nextDouble();
                System.out.println("Digite o segundo lado do triângulo: ");
                double b = scanner.nextDouble();
                System.out.println("Digite o terceiro número: ");
                double c = scanner.nextDouble();

                System.out.println("O perímetro do seu triangulo é "+(a+b+c));
            }else if (esc == 4){
                System.out.print("Você deseja calcular o perímetro atraves do raio ou do diametro?\n");
                System.out.print("1 - Raio\n");
                System.out.print("2 - Diametro\n");
                int esc1 = scanner.nextInt();
        
                if (esc1 == 1){
                    System.out.print("Digite o raio: "); double raio = scanner.nextDouble();
                    System.out.printf("O perímetro da circunferencia é %.2f %n", (2*Math.PI*raio));
                } else if(esc1 == 2){
                    System.out.print("Digite seu diametro: "); double diametro = scanner.nextDouble();
                    System.out.printf("O perímetro da circunferencia é %.2f %n",(diametro*Math.PI));
                }  
            }else if (esc == 5);
                System.out.println("Obrigado por testar!!");
                break;
            
        }

        scanner.close();
    }
}
