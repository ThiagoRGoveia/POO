package usp.poo.ex3;

public class UserThreadB extends Thread {
    private BankAccountB bankAccount;

    public UserThreadB(BankAccountB bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void run() {
        int tempBalance, realBalance;

        for (int i = 1; i <= 5000; i++) {
            tempBalance = bankAccount.getBalance();

            System.out.println("Balance before deposit " + tempBalance);

            tempBalance += 50;

            System.out.println("Balance after deposit should be:" + tempBalance);
            bankAccount.deposit(50);
            realBalance = bankAccount.getBalance();
            System.out.println("Real balance is: " + realBalance);
        }
    }
}
