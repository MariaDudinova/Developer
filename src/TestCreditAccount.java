import org.junit.Assert;
import org.junit.Test;

public class TestCreditAccount {

    @Test
    public void withdraw() {
        CreditAccount creditAccount = new CreditAccount("111", 5000, "Dudinova");
        double expected = 960;
        double actual = creditAccount.withdraw(4000);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void withdrawWithLim() {
        CreditAccount creditAccount = new CreditAccount("111", 0, "Dudinova");
        double expected2 = 0;
        double actual2 = creditAccount.withdraw(5000);
        Assert.assertEquals(expected2, actual2, 0.001);
    }

    @Test
    public void withdrawWithValid() {
        CreditAccount creditAccount = new CreditAccount("111", 60000, "Dudinova");
        double expected3 = 60000;
        double actual3 = creditAccount.withdraw(10000);
        Assert.assertEquals(expected3, actual3, 0.001);
    }

    @Test
    public void applyFee() {
        CreditAccount creditAccount = new CreditAccount("111", 5000, "Dudinova");
        double expected = 5050;
        double actual = creditAccount.applyFee(5000);
        Assert.assertEquals(expected, actual, 0.001);
    }
}