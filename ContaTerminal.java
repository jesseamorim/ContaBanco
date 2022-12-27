import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in );

        System.out.print("Digite o numero da conta: ");
        Integer numeroDaConta = input.nextInt();
        input.nextLine();

        System.out.print("Digite sua agencia: ");
        String agencia = input.nextLine();

        System.out.print("Digite seu nome aqui: ");
        String nomeCliente = input.nextLine();

        System.out.println("Digite o saldo");
        Double saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,\nsua agência é "+ agencia + ", conta "+ numeroDaConta +" e seu saldo R$ "+ saldo +" já está disponível para saque." );
    }
}
