import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite o nome de Usuário: ");
        String User = scn.next();
        System.out.println("Digite a senha: ");
        String Password = scn.next();

        if (User.equals("Adimin") && Password.equals("12345")){
            System.out.println("Acesso Permitido");
        }else{
            System.out.println("Acesso negado");
        }
        scn.close();
    }
}
