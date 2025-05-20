import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] Matriz = new int[3][3];
        int num = 1;

        for(int i = 0; i < Matriz.length; i ++){
            for(int y = 0; y < Matriz[i].length; y++){
                System.out.println("Posição ["+ i +"]["+y+"]: " );
                Matriz[i][y] = s.nextInt();
            }
        }

        System.out.println("Matriz 3x3: ");
        for(int i = 0;  i < Matriz.length; i++){
            System.out.println("");
            for(int y = 0; y < Matriz[i].length; y++){
                System.out.print(Matriz[i][y]+" ");
            }
        }
        System.out.println();
        s.close();
    }
}
