import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);

        //entrada de dados
        System.out.print("Número de Usuário: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Agência: ");
        String agencia = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        //saida de dados
        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
