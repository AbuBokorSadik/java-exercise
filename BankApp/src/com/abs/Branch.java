package com.abs;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customer = new ArrayList<Customer>();
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
    }
    public boolean addCustomer(String branchName ,String name){
        int position = searchCustomer(name);

        if (position >= 0){
            return false;
        }else {
            customer.add(new Customer(name));
        }
        return true;
    }

    public boolean addCustomer(String name){
        int position = searchCustomer(name);
        if (name!=null){
            if (position >= 0){
                return false;
            }else {
                customer.add(new Customer(name));
                customer.get(searchCustomer(name)).addTransaction(500);
            }
        }
        return true;
    }

    public void searchCustomer(String branchName ,String name){

    }

    public int searchCustomer(String name){

        if (name!=null){
            for (int i=0;customer!=null && i< customer.size();i++){
                if (name.equals(customer.get(i).getName())) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean printCustomerInformation(String name){
        int position = searchCustomer(name);
        if (position >= 0){
            System.out.println("Customer Name: " + customer.get(position).getName());
            customer.get(position).printTransaction();
            return true;
        }
        return false;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public void printCustomerInformation(){
        for (int i=0;i<customer.size();i++){
            System.out.println("Customer Name: " + customer.get(i).getName());
            customer.get(i).printTransaction();
        }
    }
}
