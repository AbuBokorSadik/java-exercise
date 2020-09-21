package com.abs;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();

    public void printContacts(){
        System.out.println("Contacts ->");
        for (int i=0;i<contacts.size();i++){
            System.out.println(i+1 + "# Name: " + contacts.get(i).getName());
            System.out.println("Contact: " + contacts.get(i).getPhoneNumber());
        }
    }

    public void addContact(String name, String contact){
        int position = findItem(name);
        if (position>=0){
            System.out.println("Contact exist in the list");
        }else {
            contacts.add(new Contacts(name,contact));
            System.out.println("Contact information added");
        }
    }

    public void modifyContact(String currentName, String newName, String newContact){
        int position = findItem(currentName);
        int positionNewName = findItem(newName);

        if (positionNewName>=0){
            System.out.println("Newly modify name is exist in the list");
        }else if (position>=0){
            contacts.set(position,new Contacts(newName,newContact));
            System.out.println("Contact information modified");
        }else {
            System.out.println("Contact dose not exist in the list");
        }
    }

    public boolean searchContact(String name){

        int position = findItem(name);
        if (position>=0){
            return true;
        }
        return false;
    }

    public void removeContact(String name){
        int position = findItem(name);
        if (position>=0){
            contacts.remove(position);
            System.out.println("Contact information deleted");
        }else {
            System.out.println("Contact dose not exist in the list");
        }
    }

    private int findItem(String name){
        for (int i=0;i<contacts.size();i++){
            if (name.equals(contacts.get(i).getName())){
                return i;
            }
        }
        return -1;
    }
}
