import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CreditAccount creditAccount = new CreditAccount("111", new BigDecimal("1000"), "Dudinova");
        DebitAccount debitAccount = new DebitAccount("555", new BigDecimal("2000"), "Kashkel");
        SavingsAccount savingsAccount = new SavingsAccount("666", new BigDecimal("2000"), "Volf");

        List<BankAccount> bankAccounts = List.of(creditAccount, debitAccount, savingsAccount);

        TransactionProcess transactionProcess = new TransactionProcess();
        transactionProcess.processTransaction(bankAccounts, new BigDecimal("500"));
        for (BankAccount account : bankAccounts) {
            System.out.println("Владелец счета:" + account.accountHolder + " Баланс: " + account.balance);
        }
        transactionProcess.processTransaction(bankAccounts, new BigDecimal("1000"));
        for (BankAccount account : bankAccounts) {
            System.out.println("Владелец счета:" + account.accountHolder + " Баланс: " + account.balance);
        }

    }
}