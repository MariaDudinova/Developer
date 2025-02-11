import java.math.BigDecimal;

public abstract class BankAccount {
    protected String accountNumber;
    protected BigDecimal balance;
    protected String accountHolder;

    public BankAccount(String accountNumber, BigDecimal balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public abstract BigDecimal withdraw(BigDecimal amount);

    public BigDecimal deposit(BigDecimal amount){
        return balance.add(amount);
    }
}
