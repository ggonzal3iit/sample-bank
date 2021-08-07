package org.perscholas;

public abstract class BankAccount {
    protected int id;
//    protected Customer cust;
    protected int annualFee;
    protected int interestRate;
    protected int balance;

    public BankAccount() {
    }

    public BankAccount(int id, int annualFee, int interestRate, int balance) {
        this.id = id;
//        this.cust = cust;
        this.annualFee = annualFee;
        this.interestRate = interestRate;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", annualFee=" + annualFee +
                ", interestRate=" + interestRate +
                ", balance=" + balance +
                '}';
    }

    public static BankAccount createAccount(int accountTypeCode, int id) {
        BankAccount bankAccount;
        int annualFee = 10;
        int interestRate = 2;
        int balance = 0;
        switch (accountTypeCode) {
            case 1:
                bankAccount = new CheckingAccount(id, annualFee, interestRate, balance);
                return bankAccount;
            case 2:
                bankAccount = new SavingsAccount(id, annualFee, interestRate, balance);
                return bankAccount;
            default:
                return null;
        }

    }

    public void deposit(int amt) {
        this.balance += amt;
    }

    public void withdraw(int amt) {
        this.balance -= amt;
    }

    public void chargeAnnualFee() {
        this.balance -= annualFee;
    }

    public void addInterest() {
        this.balance *= (int) ((100.0 + this.interestRate) / 100.0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public Customer getCust() {
//        return cust;
//    }
//
//    public void setCust(Customer cust) {
//        this.cust = cust;
//    }

    public int getAnnualFee() {
        return annualFee;
    }

    public void setAnnualFee(int annualFee) {
        this.annualFee = annualFee;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
