class SavingsAccount extends BankAccount implements InterestBearing{

    @Override
    public double applyInterest() { //проценты начисляются ежемесячно
        balance+=balance*0.0025;
        return balance;
    }

    @Override
    double withdraw(double amount) {
        balance-=amount;
        return balance;
    }

    public SavingsAccount(String accountNumber, double balance, String accountHolder) {
        super(accountNumber, balance, accountHolder);
    }
}
