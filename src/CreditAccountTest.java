import org.junit.Assert;
import org.junit.Test;

public class CreditAccountTest {

    @Test
    public void withdraw() {
        CreditAccount creditAccount = new CreditAccount("111", 5000, "Dudinova");
        double expected = 5000;
        double actual = creditAccount.withdraw(10001);
        Assert.assertEquals(expected, actual, 0.001);
    }
}