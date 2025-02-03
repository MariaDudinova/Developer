public class CreditAccount extends BankAccount implements TransactionFee, TransactionValidator{
    int creditLimit = -5000;

    @Override
    public double applyFee(double amount) { //комиссия - 1% от суммы
       amount+=amount*0.01;
       return amount;
    }

    @Override
    double withdraw(double amount) { //снятие (возможно только если итоговый баланс >= -5000)
        if(!validate(amount)) {
            System.out.println("Транзакции более 5000 запрещены");
        }
        else {
            amount = applyFee(amount);
            if (balance - amount >= creditLimit) {
                balance -= amount;
            } else {
                System.out.println("Недостаточно средств");
            }
        }
        return balance;
    }

    @Override
    public boolean validate(double amount) {//запрет на транзакции > 5000
        if(amount > 5000) return false;
        else return true;
    }

    public CreditAccount(String accountNumber, double balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }

}