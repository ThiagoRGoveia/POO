package usp.poo.ex3;

public class BankThreadB extends Thread {
    private BankAccountB bankAccount;

    public BankThreadB(BankAccountB bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void run() {
        int tempBalance, realBalance;

        for (int i = 1; i <= 5000; i++) {
            tempBalance = bankAccount.getBalance();

            System.out.println("Balance before withdraw " + tempBalance);

            tempBalance -= 50;

            System.out.println("Balance after withdraw should be:" + tempBalance);
            bankAccount.withdraw(50);
            realBalance = bankAccount.getBalance();
            System.out.println("Real balance is: " + realBalance);
        }
    }
}
