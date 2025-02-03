import org.junit.Assert;
import org.junit.Test;

public class TestDebitAccount {
    @Test
    public void withdraw() {

        DebitAccount debitAccount = new DebitAccount("111", 500, "Dudinova");
        double expected = 0;
        double actual=debitAccount.withdraw(500);

        Assert.assertEquals(expected, actual, 0.001);

    }
}