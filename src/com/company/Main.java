package com.company;

public class Main {

    public static void main(String[] args) {

        PhoneContact[] phoneContact = new PhoneContact[5];
        phoneContact[0] = new MobileContact(1,"Andrzej","Gołota", "663977883", 19, false);
        phoneContact[1] = new PrivateContact(2,"Mike","Tyson", "674633488", 21, true);
        phoneContact[2] = new MobileContact(3,"Tyson","Fury", "623697888", 20, false);
        phoneContact[3] = new WorkContact(4,"Vasiliy","Lomachenko", "663755428", 16, true);
        phoneContact[4] = new WorkContact(5,"Joe","Frazier", "663008788", 29, false);

        System.out.println(phoneContact[0].getContactRaw());
        System.out.println(phoneContact[1].getContact());
        phoneContact[2].printContactCard();
        phoneContact[3].printContact();

    }

}
