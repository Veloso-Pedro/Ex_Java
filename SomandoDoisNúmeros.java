import java.util.Scanner;

public class SomandoDoisNúmeros {

    public static void main(String[] args) {
        // INSTACIANDO E CRIANDO UM OBJETO DO TIPO SCANNER
        Scanner ler = new Scanner (System.in);

        // DECLARANDO AS VARIÁVEIS
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;

        // ENTRADA DE DADOS
        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextInt();
        System.out.println("Digite o Segundo número ");
        num2 = ler.nextInt();

        //PROCESSAMENTO DE DADOS
        resultado = num1 + num2;

        //SAÍDA DE DADOS
        System.out.println("O resultado é " + resultado);
        


    }
}