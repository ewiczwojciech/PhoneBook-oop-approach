package com.company;

public class MobileContact extends PhoneContact{

	public MobileContact(int id, String name, String surname, String phoneNumber, int age, boolean isHidden) {
		super(id, name, surname, phoneNumber, age, isHidden);
		System.out.println("Tworzę obiekt typu mobile number...");
	}
}
