import java.util.Scanner;

public class Potencia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de potencia");
        System.out.println("------------------------");
        System.out.print("Escreva a base: "); int num1 = scanner.nextInt();
        System.out.print("Escreva o expoente: "); int num2 = scanner.nextInt();
        System.out.print("O resltado da potencia de base "+num1+" elevado a "+num2+" é igual a "+(Math.pow(num1,num2)));
        scanner.close();
    } 
} 
