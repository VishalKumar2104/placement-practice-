package org.example;

import java.util.*;

public class Account {
    private String username;
    private String password;
    private double balance;
    ArrayList<String> arraylist=new ArrayList<>();
}
    Account(String username,String password,double balance){
     this.username= username;
     this.password=password;
     this.balance=0;
    }
    void deposit(double amount) {
    balance += amount;
    transactions.add("Deposited: " + amount);
    System.out.println("Amount Deposited Successfully!");
}
void withdraw(double amount) {
    if (amount <= balance) {
        balance -= amount;
        transactions.add("Withdrawn: " + amount);
        System.out.println("Amount Withdrawn Successfully!");
    } else {
        System.out.println("Insufficient Balance!");
    }
}
void showBalance() {
    System.out.println("Current Balance: " + balance);
}

void showTransactions() {
    System.out.println("Transaction History:");
    for (String t : transactions) {
        System.out.println(t);
    }
}
}


