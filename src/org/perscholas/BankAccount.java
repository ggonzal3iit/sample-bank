package org.perscholas;

public abstract class BankAccount {
    protected int id;
    protected Customer cust;
    protected int annualFee;
    protected int interestRate;
    protected int balance;

    public BankAccount() {
    }

    public BankAccount(int id, Customer cust, int annualFee, int interestRate, int balance) {
        this.id = id;
        this.cust = cust;
        this.annualFee = annualFee;
        this.interestRate = interestRate;
        this.balance = balance;
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

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

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
