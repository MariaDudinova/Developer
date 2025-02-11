import java.math.BigDecimal;

public class DebitAccount extends BankAccount implements TransactionValidator{

    /** Операция снятия (возможно только если баланс >= запрашиваемой суммы) */
    @Override
    public BigDecimal withdraw(BigDecimal amount){
        if (!validate(amount)) {
            System.out.println("Транзакции более 10000 запрещены");
        }
        else {
            if (balance.compareTo(amount) >= 0) {
                balance = balance.subtract(amount);
            } else System.out.println("Недостаточно средств");
        }
        return balance;
    }
    /** Запрет на ранзакции больше 10000 */
    @Override
    public boolean validate(BigDecimal amount) {
        return amount.compareTo(new BigDecimal("10000")) <= 0;
    }

    public DebitAccount(String accountNumber, BigDecimal balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }
}
