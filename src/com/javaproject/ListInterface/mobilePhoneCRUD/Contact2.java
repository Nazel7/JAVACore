package com.javaproject.ListInterface.mobilePhoneCRUD;

public class Contact2 {
    private String name;
    private String phoneNumber;


    public Contact2(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact2 creatMyContact(String name, String phoneNumber){
        return new Contact2(name, phoneNumber);
    }
}
