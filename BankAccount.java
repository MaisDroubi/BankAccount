package bankaccount;

import java.util.*;

public class BankAccount {

    private String accountnumber = "";
    private double checkingbalance = 0;
    private double savingsbalance = 0;

    public static int counter = 0;
    public static double amount = 0;

    public BankAccount() {
        this.counter++;
        this.accountnumber = createRandom();
        this.checkingbalance = checkingbalance;
        this.savingsbalance = savingsbalance;
    }

    public String getCheckingbalance() {
        return accountnumber;
    }

    public double getSavingBalance() {
        return savingsbalance;
    }

    public void depositMoney(double dep, String account) {
        if (account.equals("saving")) {
            this.savingsbalance += dep;
        } else if (account.equals("checking")) {
            this.checkingbalance += dep;
        }
        this.amount += dep;
    }

    private static String createRandom() {
        int m = (int) Math.pow(10, 9);
        return m + new Random().nextInt(9 * m) + "";
    }

    public void withdrawMoney(double withdraw, String account) {
        boolean successful = false;
        if (account.equals("saving")) {
            if (this.savingsbalance - withdraw >= 0) {
                successful = true;
                this.savingsbalance -= withdraw;
            }
        } else if (account.equals("checking")) {
            if (this.checkingbalance - withdraw >= 0) {
                successful = true;
                this.checkingbalance -= withdraw;
            }
        }
        if (successful) {
            this.amount -= withdraw;
        }
    }

    public void displayAccountBalance() {
        System.out.println(String.format("Savings: %.2f, Checking: %.2f", this.savingsbalance, this.checkingbalance));
    }

}
