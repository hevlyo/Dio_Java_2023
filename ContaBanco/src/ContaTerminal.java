import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite o número da conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite a Agência da conta: ");
        String agenciaConta = scanner.nextLine();

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite seu saldo: ");
        double saldoCliente = Double.parseDouble(scanner.nextLine());

        String output = MessageFormat.format(
                "Olá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, conta {2}" +
                        " e seu saldo {3} já está disponível para saque", nomeCliente, agenciaConta, numeroConta, saldoCliente);
        System.out.println(output);
    }
}
