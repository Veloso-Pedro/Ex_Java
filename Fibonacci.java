import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o termo da tabela de Fibonacci você deseja ver: "); int esc = scn.nextInt();

        for (int i = 0; i <= esc; i++){

            int F = (i - 1) + (i - 2);

            if (i == 0){
                F = 0;
                System.out.println(F);
            }else if(i == 1){
                F = 1;
                System.out.println(F);
            }else{
                System.out.println(F);
            }
        }
    }
}
