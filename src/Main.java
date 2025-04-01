import com.entities.Client;
import com.service.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        Client client = new Client();
        BankAccount bankAccount = new BankAccount();

        System.out.println("Informe o numero para a conta:");
        bankAccount.setAccount(scn.nextInt());
        System.out.println("Informe o numero da agencia:");
        bankAccount.setAgency(scn.next());

        scn.nextLine();
        System.out.println("Informe o nome do cliente:");
        client.setNameClient(scn.nextLine());
        System.out.println("Informe o valor que será depitada:");
        bankAccount.setBalance(scn.nextDouble());

        Report(bankAccount, client);
    }

    public static void Report(BankAccount bankAccount, Client client) {

        System.out.println();
        System.out.println("Dados Bancario:");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponievel para saque",
                client.getNameClient(), bankAccount.getAgency(), bankAccount.getAccount(), bankAccount.getBalance());
    }
}