public class CreditAccount extends BankAccount implements TransactionFee {
    int creditLimit = -5000;
    double balance = 5000;

    @Override
    public double applyFee(double sum) { //комиссия - 1% от суммы
       sum+=(sum*0.01);
       return sum;
    }

    @Override
    double withdraw(double amount) { //снятие (возможно только если итоговый баланс >= -5000)
        amount=applyFee(amount);
        if (balance-amount >= creditLimit){
            balance-=amount;
        }
        else{
            System.out.println("Недостаточно средств");
        }
        return balance;
    }


}