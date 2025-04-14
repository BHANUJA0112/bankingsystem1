package com.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account acc1 = new Account(1001, "Alice", 5000.0);
        Account acc2 = new Account(1002, "Bob", 3000.0);

        bank.addAccount(acc1);
        bank.addAccount(acc2);

        System.out.println("Initial Balances:");
        System.out.println("Alice: " + acc1.getBalance());
        System.out.println("Bob: " + acc2.getBalance());

        System.out.println("\nTransferring 1000 from Alice to Bob...");
        if (bank.transfer(1001, 1002, 1000.0)) {
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer failed!");
        }

        System.out.println("\nUpdated Balances:");
        System.out.println("Alice: " + acc1.getBalance());
        System.out.println("Bob: " + acc2.getBalance());
    }
}
