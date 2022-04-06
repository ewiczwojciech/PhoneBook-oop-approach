package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        PhoneContact phoneContact1 = new PhoneContact(1,"Andrzej","Gołota", "663977888", 19, false);
        phoneContact1.printPhoneContact();

        PhoneContact phoneContact2 = new PhoneContact(2, "", "", "1234567890", 21, true);
        phoneContact2.printPhoneContact();

    }

}
