import java.util.Scanner;
import java.util.Locale;

/*
Desafio DIO
Criação de uma conta de banco
*/

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner (System.in);

        String separacao = "==================";

        System.out.println(separacao + " Banco BCS " + separacao);

        System.out.print("Digite o número da Conta: ");
        int numeroConta = Integer.parseInt(scanner.next());

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.next();
        scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        double saldo = 387.89; 

        System.out.println(separacao+"\n");
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " ja está disponível para saque.\n" );
    }
}
