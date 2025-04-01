import com.service.Client;
import com.utility.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);

        System.out.println("Informe o numero para a conta:");
        int numberAccount = scn.nextInt();
        System.out.println("Informe o numero da agencia:");
        String numberAgency = scn.next();
        System.out.println("Informe o nome do cliente:");
        String name = scn.nextLine();
        scn.nextLine();
        System.out.println("Informe o valor que será depitada:");
        double money = scn.nextDouble();

        BankAccount bankAccount = new BankAccount(numberAccount, numberAgency, money);
        Client client = new Client(name);

        Report(bankAccount, client);
    }

    public static void Report(BankAccount bankAccount, Client client) {

        System.out.println();
        System.out.println("Dados Bancario:");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponievel para saque",
                client.getName(), bankAccount.getAgency(), bankAccount.getAccount(), bankAccount.getBalance());
    }
}