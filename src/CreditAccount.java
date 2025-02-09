import java.math.BigDecimal;

public class CreditAccount extends BankAccount implements TransactionFee, TransactionValidator{
    protected BigDecimal creditLimit = new  BigDecimal("-5000");

    /** Комиссия 1% от суммы */
    @Override
    public BigDecimal applyFee(BigDecimal amount) {
        amount = amount.add(amount.multiply(new BigDecimal("0.01")));
        return amount;
    }
    /** Операция снятия (возможно только если итоговый баланс >= -5000) */
    @Override
    BigDecimal withdraw(BigDecimal amount) {
        if (!validate(amount)) {
            System.out.println("Транзакции более 5000 запрещены");
        }
        else {
            amount = applyFee(amount);
            if ((balance.subtract(amount)).compareTo(creditLimit) >= 0) {
                balance = balance.subtract(amount);
            } else {
                System.out.println("Лимит баланса (-5000) превышен");
            }
        }
        return balance;
    }
    /** Запрет на транзакции больше 5000 */
    @Override
    public boolean validate(BigDecimal amount) {
        return amount.compareTo(new BigDecimal("5000")) <= 0;
    }

    public CreditAccount(String accountNumber, BigDecimal balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }

}