package com.abs;

public class Bank {
    public static void main(String[] args) {

        Branch branch = new Branch();
        branch.addCustomers(new Customer("Sadik"));
        branch.addTransaction("Sadik",2000);
        branch.printCustomerInformation();

    }
}
