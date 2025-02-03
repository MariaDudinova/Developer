public abstract class BankAccount {
    String accountNumber;
    double balance;
    String accountHolder;

    abstract double withdraw(double amount); //для снятия наличных

    double deposit(double amount) //пополнение счета
    {
        return balance += amount;
    } //для пополнения средств
}
