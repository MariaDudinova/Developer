abstract class BankAccount {
    String accountNumber;
    double balance;
    String accountHolder;

    public BankAccount(String accountNumber, double balance, String accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    abstract double withdraw(double amount); //для снятия наличных

    double deposit(double amount){ //пополнение счета
        balance += amount;
        return balance;
    }
}
