package org.perscholas;

public class CheckingAccount extends BankAccount {
    private static int annualFee = 100;
    private static int interestRate = 25;

    public CheckingAccount() {
    }

    public CheckingAccount(int id, int annualFee, int interestRate, int balance) {
        super(id, annualFee, interestRate, balance);
    }


    public CheckingAccount(int id, int balance){
        super(id, annualFee, interestRate, balance);
    }
}
