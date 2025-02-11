import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class TestTransactionProcess {

    @Test
    public void processTransaction() {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new DebitAccount("111", new BigDecimal("1000"), "Dudinova"));

        TransactionProcess transactionProcess = new TransactionProcess();
        BigDecimal expected = new BigDecimal("500");
        transactionProcess.processTransaction(bankAccounts, new BigDecimal("500"));
        assertEquals(expected, bankAccounts.getFirst().balance);
    }
}