import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int esc = 0;
        String menu;
        double saldo;
        int acessconta;
        String User;
        int[] conta = new int[5];
        String[] nome = new String[5];
        double[] saldoConta = new double[5];
        boolean contido = false;
        int num = 0;
        double deposito;
        double saque;


        for (int i = 0; i < nome.length; i++){
            System.out.println("Digite Seu nome: ");
            nome[i] = s.next().toLowerCase();
            conta[i] += 1;
            System.out.println("Digite o valor do seu saldo (Maior que 10): ");
            saldo = s.nextDouble();
            saldoConta[i] = saldo;

        }

        /*
        for (int i = 0; i < nome.length; i++){
            System.out.println("nome: "+nome[i]+" | conta: "+conta[i]+" | saldo: "+saldoConta[i]);
        }
        */

        System.out.println("Qual conta você deseja acessar: ");
        for(int i = 0; i < nome.length; i++){
            num += 1;
            System.out.println(+num+" - "+ nome[i]);
        }
        acessconta = s.nextInt() - 1;

        do{
            System.out.println("*Bank Star*");
            System.out.println("a) Depósito bancário");
            System.out.println("b) Saque");
            System.out.println("c) Saldo");
            System.out.println("d) Sair");
            System.out.println("\n");
            System.out.println("================================");
            menu = s.next().toLowerCase();
            System.out.println("================================");

            switch (menu){
                case "a":
                    System.out.println("Depósito bancário");
                    System.out.println("=================");
                    System.out.println("Digite o valor do Deposito: ");
                    deposito = s.nextDouble();
                    saldoConta[acessconta] += deposito;
                    System.out.println("Deposito feito!");
                    System.out.println("================================");
                    break;
                case "b":
                    do{
                        System.out.println("Saque");
                        System.out.println("=================");
                        System.out.println("Saldo Disponível: "+saldoConta[acessconta]);
                        System.out.println("Digite o valor que vc deseja sacar: ");
                        saque = s.nextDouble();
                        if (saque > saldoConta[acessconta]){
                            System.out.println("Erro! Valor acima do possível.");
                        }else{
                            saldoConta[acessconta] -= saque;
                            System.out.println("Saque Feito!");
                        }
                    }while(saque > saldoConta[acessconta]);
                    System.out.println("================================");
                    break;
                case "c":
                    System.out.println("Saldo");
                    System.out.println("Saldo Atual: "+saldoConta[acessconta]);
                    System.out.println("================================");
                    break;
                case "d":
                    System.out.println("Saíndo...");
                    System.out.println("Saldo Final: "+saldoConta[acessconta]);
                    esc = 2;
                    break;
            }


        }while(esc != 2);

        s.close();
    }
        
}
