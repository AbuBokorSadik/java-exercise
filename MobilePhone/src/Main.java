import com.abs.MobilePhone;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit){

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To modify a contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact(){
        String name, contact;
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Contact: ");
        contact = scanner.nextLine();
        mobilePhone.addContact(name,contact);
    }

    public static void modifyContact(){
        String currentName, newName, newContact;

        System.out.print("Current Name: ");
        currentName = scanner.nextLine();
        System.out.print("New Name: ");
        newName = scanner.nextLine();
        System.out.print("New Contact: ");
        newContact = scanner.nextLine();

        mobilePhone.modifyContact(currentName,newName,newContact);

    }

    public static void removeContact(){
        String name, contact;
        System.out.print("Name: ");
        name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }

    public static void searchForContact(){
        String name, contact;
        System.out.print("Name: ");
        name = scanner.nextLine();
        if (mobilePhone.searchContact(name)){
            System.out.println("Contact exist");
        }else {
            System.out.println("Contact dose not exist");
        }
    }
}


// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.