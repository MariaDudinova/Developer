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

    @Test
    public void withdrawWithLim() {
        DebitAccount debitAccount = new DebitAccount("111", 500, "Dudinova");
        double expected2 = 500;
        double actual2=debitAccount.withdraw(600);
        Assert.assertEquals(expected2, actual2, 0.001);
    }

    @Test
    public void withdrawWithValid() {
        DebitAccount debitAccount = new DebitAccount("111", 15000, "Dudinova");
        double expected3 = 15000;
        double actual3 =debitAccount.withdraw(15000);
        Assert.assertEquals(expected3, actual3, 0.001);
    }
}