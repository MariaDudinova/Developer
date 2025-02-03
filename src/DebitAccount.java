public class DebitAccount extends BankAccount implements TransactionValidator{

    @Override
    double withdraw(double amount){//снятие (возможно только если баланс >= запрашиваемой суммы)
        if(!validate(amount)) {
            System.out.println("Транзакции более 10000 запрещены");
        }
        else {
            if (balance >= amount) {
                balance -= amount;
            } else System.out.println("Недостаточно средств");
        }
        return balance;
    }

    @Override
    public boolean validate(double amount) {
        if (amount > 10000) return false;
        else return true;
    }

    public DebitAccount(String accountNumber, double balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }

}
