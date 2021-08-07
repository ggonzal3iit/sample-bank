package org.perscholas;

import java.util.Scanner;

public class UserInterfaceMethods {

    private static boolean continueInteracting = true;

    public static void userInterface(){
        BankAccount currentAccount;
        System.out.println("Welcome to Sample Bank. We hope you enjoy your stay!");

        System.out.println("Main Menu:\n" +
                "  - Create new account\n");

        currentAccount = createNewAccount();
        while(continueInteracting) {
            interactWithAccount(currentAccount);
        }
    }

    private static void interactWithAccount(BankAccount currentAccount) {
        System.out.println("Account Menu \n" +
                "1 - Deposit \n" +
                "2 - Withdraw \n" +
                "3 - Quit");

        Scanner scan = new Scanner(System.in);


        int choice = scan.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("How much do you want to deposit?");
                int depositAmount = scan.nextInt();
                currentAccount.deposit(depositAmount);
                System.out.println("You have deposited " + depositAmount + "\n" +
                        "Your new balance is " + currentAccount.getBalance());
            }
            case 2 -> {
                System.out.println("How much do you want to withdraw?");
                int withdrawAmount = scan.nextInt();
                currentAccount.withdraw(withdrawAmount);
                System.out.println("You have withdrawn " + withdrawAmount + "\n" +
                        "Your new balance is " + currentAccount.getBalance());
            }
            case 3 -> continueInteracting = false;
        }
    }


    private static BankAccount createNewAccount() {
        System.out.println("New account menu:\n" +
                "  - 1 Create checking account\n" +
                "  - 2 Create savings account");
        Scanner scn = new Scanner(System.in);
        int accountTypeCode = scn.nextInt();
        System.out.println("Please enter an account id");
        int accountId = scn.nextInt();
        // get account Type Code
        // get int id, int annualFee, int interestRate, int balance
        BankAccount bankAccount = BankAccount.createAccount(accountTypeCode, accountId);
        System.out.println("Account " + accountId + " created");
        return bankAccount;

    }


}



