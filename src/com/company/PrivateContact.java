package com.company;

public class PrivateContact extends PhoneContact{

	public PrivateContact(int id, String name, String surname, String phoneNumber, int age, boolean isHidden) {
		super(id, name, surname, phoneNumber, age, isHidden);
		System.out.println("Tworzę obiekt typu private number...");
	}
}
