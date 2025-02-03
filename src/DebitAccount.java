public class DebitAccount extends BankAccount{
    double balance = 500;
    @Override
    double withdraw(double amount) //снятие (возможно только если баланс >= запрашиваемой суммы)
    {
        if (balance >= amount){
            balance-=amount;
        }
        else System.out.println("Недостаточно средств");
        return balance;
    }

}
