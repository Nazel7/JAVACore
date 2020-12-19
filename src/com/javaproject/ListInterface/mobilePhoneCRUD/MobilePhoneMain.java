package com.javaproject.ListInterface.mobilePhoneCRUD;

import java.util.Scanner;

public class MobilePhoneMain {
    private static Scanner input = new Scanner(System.in);
    private static MobilePhone2 mobilePhone2 = new MobilePhone2();

    public MobilePhoneMain() {
        System.out.println("Mobile Phone has empty contact");
    }



    public static void main(String[] args) {
        System.out.println("The Mobile Phone options to press\n" +
                "0: Switching off your Moblie Phone\n" +
                "1: Add contact\n" +
                "2: Print Contacts\n" +
                "3: Query Contacts\n" +
                "4: Modify Contact\n" +
                "5: Remove Contact\n");
        boolean quit = false;

        while (!quit) {
            System.out.println("Enter the command to press:\n");
            int press = input.nextInt();
            input.nextLine();
            switch (press) {
                case 0:
                    System.out.println("Mobile Phone shutting down........");
                    quit = true;
                    break;
                case 1:
                    addContact2();
                    break;
                case 2:
                    printContact2();
                    break;
                case 3:
                    queryContact();
                    break;
                case 4:
                    modifyContact2();
                    break;

                case 5:
                    removeContact2();
                    break;
            }
        }
    }

    private static void addContact2() {
        System.out.println("Enter add contact name:");
        String name = input.nextLine();
        System.out.println("Enter add contact Phone number: ");
        String phoneNumber = input.nextLine();
        Contact2 contact2 = Contact2.creatMyContact(name, phoneNumber);
        mobilePhone2.addContact(contact2);
    }

    private static void printContact2() {
        mobilePhone2.printContact2();
    }

    private static void queryContact() {
        System.out.println("Enter query contact name:");
        String queryContactName = input.nextLine();
        Contact2 queryContact = mobilePhone2.queryContact(queryContactName);
        if (queryContact == null) {
            System.out.println(queryContactName + " not on your contact list");
        }
    }

    private static void modifyContact2() {
        System.out.println("Enter modify contact name:");
        String name = input.nextLine();
        Contact2 oldContact2 = mobilePhone2.queryContact(name);
        if (oldContact2 == null) {
            System.out.println("Contact " + name + " not on your contact list");
            return;
        }
        System.out.println("Enter new contact name:");
        String newContact = input.nextLine();
        System.out.println("Enter new contact Phone number: ");
        String newPhoneNumber = input.nextLine();
        Contact2 newOldContact2 = Contact2.creatMyContact(newContact, newPhoneNumber);
        mobilePhone2.modifyContact(oldContact2, newOldContact2);

    }

    private static void removeContact2() {
        System.out.println("Enter remove contact name:\n");
        String name = input.nextLine();
        System.out.println(mobilePhone2.removeContact2(name));
    }
}
