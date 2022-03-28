package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int id = 1;
        String name = "";
        String surname = "Sokata";
        String phoneNumber = "453000";
        int age = 20;
        boolean isHidden = false;

        String contact = getContactRaw(id, name, surname, age, phoneNumber,isHidden);

//        printContactCard(id, name, surname, phoneNumber, age);
//        printContact(id, name, surname, Integer.parseInt(phoneNumber), age);
        String entry;
        entry = getContact(id, name, surname, Double.valueOf(phoneNumber), age);
        System.out.println(entry);

        System.out.println(contact);
        printContactCard(contact);
        printContact(contact);


        int[] lastDialed;
        lastDialed = new int[10];
        System.out.println(lastDialed.length);

        Random rng = new Random();

        System.out.println("\ntablica przed zmianą:");
        for (int i = 0; i<lastDialed.length; i++){
            lastDialed[i] = rng.nextInt(1000000000);
            System.out.println(lastDialed[i]);
        }

        int newDial = dial(lastDialed, 666000666);
        System.out.println("\ntablica po zmianie:");
        for (int i = 0; i<lastDialed.length; i++){
            System.out.println(lastDialed[i]);
        }
        int lastDial;
        System.out.println("\nOstatnio wybrany: " + (lastDial = getLastDialed(lastDialed)));

        int chooseDial;
        System.out.printf("Numer na wybranym miejscu to %d", (getLastDialed(lastDialed, 3)));

        System.out.println("\nUsuwam z wybieranych" + (removeLastDialed(lastDialed, 9)));
        System.out.println("\ntablica po usuwaniu:");

        for (int i = 0; i<lastDialed.length; i++){
            System.out.println(lastDialed[i]);
        }

    }

//    public static void printContactCard(int id, String name, String surname, String phoneNumber, int age){
//
//        System.out.println("Id: " + id);
//        System.out.println("Imię: " + name);
//        System.out.println("Nazwisko: " + surname);
//        System.out.println("Wiek: " + age);
//        System.out.println("Numer telefonu: " + phoneNumber);
//        System.out.println("");
//
//    }
//
//    public static void printContact(int id, String name, String surname, int phoneNumber, int age){
//        System.out.printf("%d | %s | %s | %d | %d", id, name, surname, phoneNumber, age);
//        System.out.println("");
//    }

    public static String getContact(int id, String name, String surname, Double phoneNumber, int age){
        if(name.equals("")){
            name = "NIEZNANY";
        }
        if (surname.equals("")){
            surname = "NIEZNANY";
        }
        if(phoneNumber.toString().length() != 9){
            String pn = "000000000";
            phoneNumber = Double.valueOf(pn);
        }

        return String.format("%d | %s | %s | %f | %d", id, name, surname, phoneNumber, age);
    }

    //2 praca domowa
    public static String getContactRaw(int id, String name, String surname, int age, String number, boolean isHidden){

        if(name.equals("")){
            name = "NIEZNANY";
        }
        if (surname.equals("")){
            surname = "NIEZNANY";
        }
        if(number.length() != 9){
            number = "000000000";
        }

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
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < infoArray1.length; i++) {
            sb.append(infoArray1[i]);
            sb.append(";");
        }

        System.out.println(sb);
    }


//    PRACA DOMOWA TABLICE I CONDITIONAL STATEMENTS
    public static int dial(int[] tab, int dial){

        for(int i = tab.length -1 ; i>0 ; i--){
                   int save = tab[i-1];
                   tab[i] = save;
        }
        return tab[0] = dial;
    }

    public static int getLastDialed(int[] tab){
        return tab[0];
    }

    public static int getLastDialed(int[] tab, int index){

        if(index < 0 || index > tab.length){
            System.out.println("Nieprawidłowy indeks!");
            return 0;
        }
            return tab[index-1];
    }

    public static int removeLastDialed(int[] tab, int index){
        if(index < 0 || index > tab.length){
            System.out.println("\nNieprawidłowy indeks!");
            return 0;
        }
        return tab[index-1] = 0;
    }

}
