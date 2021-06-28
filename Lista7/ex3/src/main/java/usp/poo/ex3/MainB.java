package usp.poo.ex3;

public class MainB {
    public static void main(String[] args) {
        BankAccountB bankAccount = new BankAccountB();

        bankAccount.deposit(500000);

        UserThreadB userThread = new UserThreadB(bankAccount);
        BankThreadB bankThread = new BankThreadB(bankAccount);

        bankThread.start();
        userThread.start();
    }
}
