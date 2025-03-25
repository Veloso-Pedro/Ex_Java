import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Tabuada");
            System.out.println("==============");
            System.out.println("Digite a tabela que você deseja ver: ");
            int tab = scanner.nextInt();

            System.out.println("Escolha o tamanho da tabela(apenas INTEIROS): ");
            int tam = scanner.nextInt();

            for (int i = 0; i <= tam; i++){
                System.out.println((tab + "X"+ (i)+ "="+ (tab * i)));

            }

            System.out.println("1- para sair\n2- calcular nova tabela");
            int esc = scanner.nextInt();

            if (esc == 1){
                System.out.println("ORIGADO POR TESTAR!");
                break;
            }
        }
        scanner.close();
    }
}
