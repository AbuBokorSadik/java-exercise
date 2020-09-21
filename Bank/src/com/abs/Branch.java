package com.abs;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public boolean addCustomers(Customer customer){
        customer.setTransaction(new Double(500));
        customers.add(customer);
        return true;
    }

    public boolean addTransaction(String name, double amount){

        int position = searchCustomer(name);
        if (position>=0){
            customers.get(position).setTransaction(new Double(amount));
        }else {
            System.out.println("Customer not exist.");
        }
        return true;
    }

    public void printCustomerInformation(){
        for (int i=0;i<customers.size();i++){
            System.out.println("Customer Name: " + customers.get(i).getName());
        }
    }

    private int searchCustomer(String name){

        for (int i=0;i<customers.size();i++){

            if (name.equals(customers.get(i).getName())){
                return i;
            }
        }
        return -1;
    }
}
