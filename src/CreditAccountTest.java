import org.junit.Assert;
import org.junit.Test;

public class CreditAccountTest {

    @Test
    public void withdraw() {
        CreditAccount account = new CreditAccount();
        double expected = 5000;
        double actual = account.withdraw(5000,10001);
        Assert.assertEquals(expected, actual, 0.001);
    }
}