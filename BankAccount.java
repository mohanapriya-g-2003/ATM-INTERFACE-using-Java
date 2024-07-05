package com.atminterface;

import java.util.Scanner;

class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: $" + amount);
     } else {
         System.out.println("Invalid amount for deposit.");
     }
 }

 public boolean withdraw(double amount) {
     if (amount > 0 && balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn: $" + amount);
         return true;
     } else {
         System.out.println("Insufficient funds or invalid amount for withdrawal.");
         return false;
     }
 }
}


