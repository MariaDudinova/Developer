import java.math.BigDecimal;

public class SavingsAccount extends BankAccount implements InterestBearing {
    protected BigDecimal interest = new BigDecimal("0.0025");

    @Override
    public BigDecimal applyInterest() {
        BigDecimal amount = balance.multiply(interest);
        return deposit(amount);
    }

    @Override
    public BigDecimal withdraw(BigDecimal amount) {
        return balance.subtract(amount);
    }

    public SavingsAccount(String accountNumber, BigDecimal balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }
}
