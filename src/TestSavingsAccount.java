import org.junit.Assert;
import org.junit.Test;


public class TestSavingsAccount {

    @Test
    public void applyInterest() {
        SavingsAccount savingsAccount = new SavingsAccount("111", 5000, "Dudinova");
        double expected = 5012.5;
        double actual = savingsAccount.applyInterest();
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void withdraw() {
        SavingsAccount savingsAccount = new SavingsAccount("111", 5000, "Dudinova");
        double expected = 4900;
        double actual = savingsAccount.withdraw(100);
        Assert.assertEquals(expected, actual, 0.001);
    }
}