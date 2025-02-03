import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestTransactionProcess {

    @Test
    public void processTransaction() {
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(new DebitAccount("111", 1000, "Dudinova"));

        TransactionProcess transactionProcess = new TransactionProcess();
        double expected = 500;
        transactionProcess.processTransaction(bankAccounts, 500);

        assertEquals(expected, bankAccounts.getFirst().balance, 0.001);
    }
}