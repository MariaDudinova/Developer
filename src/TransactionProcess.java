import java.math.BigDecimal;
import java.util.List;

public class TransactionProcess {
    void processTransaction (List<BankAccount> accounts, BigDecimal amount) {
        for (BankAccount account : accounts) {
            account.withdraw(amount);
        }
    }
}
