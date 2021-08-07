package org.perscholas;

public class SavingsAccount extends BankAccount {
    public SavingsAccount() {
    }

    public SavingsAccount(int id, int annualFee, int interestRate, int balance) {
        super(id, annualFee, interestRate, balance);
    }
}
