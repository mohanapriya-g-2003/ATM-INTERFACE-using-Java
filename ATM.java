package com.atminterface;

import java.util.Scanner;

public class ATM {
	 private BankAccount account;
	 private Scanner scanner;

	 public ATM(BankAccount account) {
	     this.account = account;
	     this.scanner = new Scanner(System.in);
	 }

	 public void run() {
	     while (true) {
	         System.out.println("\nATM Menu:");
	         System.out.println("1. Check Balance");
	         System.out.println("2. Deposit");
	         System.out.println("3. Withdraw");
	         System.out.println("4. Exit");
	         System.out.print("Enter your choice: ");

	         int choice = scanner.nextInt();

	         switch (choice) {
	             case 1:
	                 checkBalance();
	                 break;
	             case 2:
	                 deposit();
	                 break;
	             case 3:
	                 withdraw();
	                 break;
	             case 4:
	                 System.out.println("Thank you for using the ATM. Goodbye!");
	                 return;
	             default:
	                 System.out.println("Invalid choice. Please enter a number between 1 and 4.");
	         }
	     }
	 }

	 private void checkBalance() {
	     double balance = account.getBalance();
	     System.out.println("Your balance: $" + balance);
	 }

	 private void deposit() {
	     System.out.print("Enter amount to deposit: $");
	     double amount = scanner.nextDouble();
	     account.deposit(amount);
	 }

	 private void withdraw() {
	     System.out.print("Enter amount to withdraw: $");
	     double amount = scanner.nextDouble();
	     boolean success = account.withdraw(amount);
	     if (success) {
	         System.out.println("Please take your cash.");
	     }
	 }

	 public static void main(String[] args) {
	     BankAccount userAccount = new BankAccount(50000.0); // initial balance $1000
	     ATM atm = new ATM(userAccount);
	     atm.run();
	 }
	}
