package usp.poo.ex3;

public class BankAccountA {
    private int balance;

    BankAccountA () {
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int value) {
        balance += value;
    }

    public void withdraw(int value) {
        balance -= value;
    }
}
