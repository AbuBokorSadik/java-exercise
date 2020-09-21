package com.abs;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transaction;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public void setTransaction(Double transaction) {
        this.transaction.add(transaction);
    }

//    public Customer getCustomer(String name, ArrayList<Double> transaction){
//        return new Customer(name,transaction);
//    }

    public void printTransaction(){
        for (int i=0;i<transaction.size();i++){
            System.out.println("Transaction #" + i + " - " + transaction.get(i) + " BDT");
        }
    }
}
