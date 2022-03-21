package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int id = 1;
        String name = "Janina";
        String surname = "Sokata";
        String phoneNumber = "999333222";
        int age = 20;
        boolean isHidden = false;

        String contact = getContactRaw(id, name, surname, age, phoneNumber,isHidden);

        printContactCard(id, name, surname, phoneNumber, age);
        printContact(id, name, surname, Integer.parseInt(phoneNumber), age);
        String entry = getContact(id, name, surname, Integer.parseInt(phoneNumber), age);
        System.out.println(entry);

        System.out.println(contact);
        printContactCard(contact);
        printContact(contact);



    }

    public static void printContactCard(int id, String name, String surname, String phoneNumber, int age){

        System.out.println("Id: " + id);
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + surname);
        System.out.println("Wiek: " + age);
        System.out.println("Numer telefonu: " + phoneNumber);
        System.out.println("");

    }

    public static void printContact(int id, String name, String surname, int phoneNumber, int age){
        System.out.printf("%d | %s | %s | %d | %d", id, name, surname, phoneNumber, age);
        System.out.println("");
    }

    public static String getContact(int id, String name, String surname, int phoneNumber, int age){
        return String.format("%d | %s | %s | %d | %d", id, name, surname, phoneNumber, age);
    }

    //2 praca domowa
    public static String getContactRaw(int id, String name, String surname, int age, String number, boolean isHidden){
        String raw = id + ";" + name + ";" + surname + ";" + age + ";" + number + ";" + isHidden;
        return raw;
    }

    public static void printContactCard(String contact){
        String[] infoArray = contact.split(";");

        System.out.println("Id: " + infoArray[0]);
        System.out.println("Imię: " + infoArray[1]);
        System.out.println("Nazwisko: " + infoArray[2]);
        System.out.println("Wiek: " + infoArray[3]);
        System.out.println("Numer telefonu: " + infoArray[4]);
        System.out.println("isHidden: " + infoArray[5]);
        System.out.println("");
    }

    public static void printContact(String contact){
        String[] infoArray1 = contact.split(";");
        System.out.println(infoArray1[0] + "|" + infoArray1[1] + "|" + infoArray1[2] + "|" + infoArray1[3] + "|" + infoArray1[4] + "|" + infoArray1[5]);
    }
}
