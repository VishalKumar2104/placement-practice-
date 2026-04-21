package org.example;

import java.util.*;

public class Main{

}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    HashMap<String, Account> users = new HashMap<>();
    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- BANK SYSTEM---");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                   create account;
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

static void createAccount() {
    System.out.print("Enter Username: ");
    String username = sc.next();

    if (users.containsKey(username)) {
        System.out.println("Username already exists!");
        return;
    }

    System.out.print("Enter Password: ");
    String password = sc.next();

    users.put(username, new Account(username, password));
    System.out.println("Account Created Successfully!");
}