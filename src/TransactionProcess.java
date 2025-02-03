import java.util.List;

class TransactionProcess {
    void processTransaction (List<BankAccount> accounts, double amount) {
        for (BankAccount account : accounts) {
            account.withdraw(amount);
        }
    }
}
