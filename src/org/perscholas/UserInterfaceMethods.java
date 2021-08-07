package org.perscholas;

import java.util.Scanner;

public class UserInterfaceMethods {

    public static void userInterface() {
        BankAccount currentAccount;
        System.out.println("Welcome to Sample Bank. We hope you enjoy your stay!");

        System.out.println("Main Menu:\n" +
                "  - Create new account\n");
//                    "  - 2 Access existing account\n" +
//                    "  - 3 Exit");
//        Scanner scn = new Scanner(System.in);
//        int userResponse = scn.nextInt();
//        switch (userResponse) {
//            case 1:
        currentAccount = createNewAccount();
//                break;
//            case 2:
//                // access existing account
//                break;
//            case 3:
//                break;
//    }
        System.out.println(currentAccount.toString());

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



