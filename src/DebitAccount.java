public class DebitAccount extends BankAccount{

    @Override
    double withdraw(double amount){//снятие (возможно только если баланс >= запрашиваемой суммы)
        if (balance >= amount){
            balance-=amount;
        }
        else System.out.println("Недостаточно средств");
        return balance;
    }

    public DebitAccount(String accountNumber, double balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }
}
