/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author pccorner
 */
public class test {

    public static void main(String[] args) {
        BankAccount mais = new BankAccount();
        mais.depositMoney(300, "checking");
        mais.depositMoney(3.00, "saving");
        mais.displayAccountBalance();
        System.out.println(BankAccount.amount);
        mais.withdrawMoney(50, "checking");
        mais.withdrawMoney(50, "saving");
        mais.displayAccountBalance();
        System.out.println(BankAccount.amount);
    }

}
