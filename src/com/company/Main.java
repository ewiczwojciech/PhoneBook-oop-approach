package com.company;

public class Main {

    private static final Object age = 20;

    public static void main(String[] args) {
        int id = 1;
        String name = "Janina";
        String surname = "Sokata";
        String phoneNumber = "999333222";
//        Integer age = 20;
        String contact = "";
        boolean isHidden = false;

        printContactCard();
        printContact(id, name, surname, Integer.parseInt(phoneNumber), age);
        String entry = getContact(id, name, surname, Integer.parseInt(phoneNumber));
        System.out.println(entry);


    }

    public static void printContactCard(){

        int id = 1;
        String name = "Janina";
        String surname = "Sokata";
        String phoneNumber = "999333222";
        int age = 20;
        String contact = "";
        boolean isHidden = false;

        System.out.println(contact);
        System.out.println("Id: " + id);
        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + surname);
        System.out.println("Wiek: " + age);
        System.out.println("Numer telefonu: " + phoneNumber);
        System.out.println("");

    }

    public static void printContact(int id, String name, String surname, int phoneNumber, Object age){
        System.out.printf("%d | %s | %s | %d | %d", id, name, surname, phoneNumber, age);
        System.out.println("");
    }

    public static String getContact(int id, String name, String surname, int phoneNumber){
        return String.format("%d | %s | %s | %d | %d", id, name, surname, phoneNumber, age);
    }

}
