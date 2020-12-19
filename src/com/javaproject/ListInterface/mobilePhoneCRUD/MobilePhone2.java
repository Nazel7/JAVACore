package com.javaproject.ListInterface.mobilePhoneCRUD;

import java.util.ArrayList;

public class MobilePhone2 {
    private String phoneNumber;
    private ArrayList<Contact2> myContact2;

    public MobilePhone2() {
        this.phoneNumber = "+2348168135061";
        this.myContact2 = new ArrayList<>();
    }

    public void addContact(Contact2 newContact) {
        if (findContact(newContact.getName()) >= 0) {
            System.out.println("The contact " + newContact.getName() + " is already on your contact list " +
                    "Please add another contact");
        } else {
            this.myContact2.add(newContact);
            System.out.println("The Contact " + newContact.getName() + " has been added to your contact list");
        }


    }

    public void modifyContact(Contact2 oldContact, Contact2 newContact) {
        int modifyContacts = findContact(oldContact);
        if(modifyContacts <0){
            System.out.println("Contact not on file");
        }
        else{
            if(findContact(newContact.getName())!= -1){
                System.out.println("New contact on file");
                return;
            }
        }

      this.myContact2.set(modifyContacts, newContact);
    System.out.println(oldContact.getName() + " has been replaced with " + newContact.getName());
    }

    private int findContact(String contactName) {
        Contact2 contact;
        for (int i = 0; i < this.myContact2.size(); i++) {
            contact = this.myContact2.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }

        }
        return -1;
    }

    public Contact2 queryContact(String contactName) {
        int queryContact = findContact(contactName);
        if(queryContact >= 0){
            System.out.println(contactName+" on your contact list");
            return this.myContact2.get(queryContact);
        }
        return null;
    }


    public Contact2 removeContact2(String name) {
        int removeContacts = findContact(name);
        if(removeContacts>= 0){
            System.out.println("Contact " + this.myContact2.get(removeContacts).getName() + " removed successfully");
            return  this.myContact2.remove(removeContacts);
        }

        System.out.println("Contact not found");
        return  null;
    }

    public void printContact2() {
        System.out.println("There are " + this.myContact2.size() + " contacts on your contact list");
        for (int i = 0; i < this.myContact2.size(); i++) {
            System.out.println(i + 1 + ". " + this.myContact2.get(i).getName() + " : " + this.myContact2.get(i).getPhoneNumber());
        }
    }
public int findContact(Contact2 contact2){
        return this.myContact2.indexOf(contact2);
}
}
