package usp.poo.ex3;

public class BankAccountB {
    private int balance;

    BankAccountB () {
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    synchronized public void deposit(int value) {
        balance += value;
    }

    synchronized public void withdraw(int value) {
        balance -= value;
    }
}
