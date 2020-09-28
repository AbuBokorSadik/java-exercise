package com.abs;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public String getName() {
        return name;
    }

    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public Customer(String name) {
        this.name = name;
    }

    public void addTransaction(double amount){
        transactions.add(amount);
    }

    public void printTransaction(){
        for (int i=0;i<transactions.size();i++){
            System.out.println("Transaction #" + (i+1) + ". " + transactions.get(i) + " BDT");
        }
    }
}
