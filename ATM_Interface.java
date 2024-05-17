package com.tw_Internship.in;

import java.util.Scanner;
public class ATM_Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balances = 0;
        System.out.println("Welcome to the ATM Machine");
        while (true) {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Your balance is Rs. " + balances);
                    break;
                case 2:
                    System.out.println("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balances += depositAmount;
                        System.out.println("Deposit successful. Your new balance is Rs. " + balances);
                    } else {
                        System.out.println("Invalid amount. Deposit failed.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balances) {
                        balances -= withdrawAmount;
                        System.out.println("Withdrawal successful. Your new balance is Rs. " + balances);
                    } else {
                        System.out.println("Invalid amount or insufficient balance. Withdrawal failed.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
