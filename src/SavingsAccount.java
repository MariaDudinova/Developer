import java.math.BigDecimal;

public class SavingsAccount extends BankAccount implements InterestBearing {

    @Override
    public BigDecimal applyInterest() {
        BigDecimal amount = balance.multiply(new BigDecimal("0.0025"));
        return deposit(amount);
    }

    @Override
    BigDecimal withdraw(BigDecimal amount) {
        return balance.subtract(amount);
    }

    public SavingsAccount(String accountNumber, BigDecimal balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }
}
