package usp.poo.ex3;

public class MainA {
    public static void main(String[] args) {
        BankAccountA bankAccount = new BankAccountA();

        bankAccount.deposit(500000);

        UserThreadA userThread = new UserThreadA(bankAccount);
        BankThreadA bankThread = new BankThreadA(bankAccount);

        bankThread.start();
        userThread.start();
    }
}
