import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TransactionProcess transactionProcess = new TransactionProcess();
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new CreditAccount("111", 1000, "Dudinova"));
        bankAccounts.add(new DebitAccount("555", 2000, "Kashkel"));
        bankAccounts.add(new SavingsAccount("666", 20000, "Volf"));

        transactionProcess.processTransaction(bankAccounts, 500);
        for (BankAccount account : bankAccounts) {
            System.out.println("Владелец счета:" + account.accountHolder + " Баланс: " + account.balance);
        }
        transactionProcess.processTransaction(bankAccounts, 1000);
        for (BankAccount account : bankAccounts) {
            System.out.println("Владелец счета:" + account.accountHolder + " Баланс: " + account.balance);
        }

    }
}