package com.abs;

public class Bank {

    public static void main(String[] args) {

        Branch branch = new Branch("Rampura");

        branch.addCustomer("Sadik");
        branch.getCustomer().get(branch.searchCustomer("Sadik")).addTransaction(2000);

        branch.addCustomer("Arif");


        branch.addCustomer("Kamal");


        branch.printCustomerInformation();

//        Customer customer = new Customer("Sadik");
//        customer.addTransaction(500);
//        customer.addTransaction(1500);
//        customer.addTransaction(2000);
//        customer.printTransaction();



    }

}
