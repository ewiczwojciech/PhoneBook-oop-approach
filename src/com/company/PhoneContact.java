package com.company;

import java.util.Arrays;

public abstract class PhoneContact {

	private int id;
	private String name;
	private String surname;
	private String phoneNumber;
	private int age;
	private boolean isHidden;

	public PhoneContact(int id, String name, String surname, String phoneNumber, int age, boolean isHidden) {

//		System.out.println("\nTworzę obiekt typu phone number...");

		if(name.equals("")){
			name = "NIEZNANY";
		}

		if (surname.equals("")){
			surname = "NIEZNANY";
		}

		if(phoneNumber.length() != 9){
			phoneNumber = "000000000";
		}

		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.id = id;
		this.age = age;
		this.isHidden = isHidden;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHidden() {
		return isHidden;
	}

	public void setHidden(boolean hidden) {
		isHidden = hidden;
	}


	public String toString(){
		return "Id: " + id + "; Imię: " + name + "; Nazwisko: " + surname + "; Numer telefonu: " + phoneNumber + "; Wiek: " + age + "; Ukryty?: " + isHidden;
	}

	public String getContact(){

		return String.format("%d | %s | %s | %s | %d", this.id, this.name, this.surname, this.phoneNumber, this.age);
	}

	public String getContactRaw(){

		String raw = this.id + ";" + this.name + ";" + this.surname + ";" + this.phoneNumber + ";" + this.age + ";" + this.isHidden + ";";
		return raw;
	}

	public void printContactCard(){
//		String[] infoArray = contact.split(";");

		System.out.println("Id: " + this.id);
		System.out.println("Imię: " + this.name);
		System.out.println("Nazwisko: " + this.surname);
		System.out.println("Wiek: " + this.age);
		System.out.println("Numer telefonu: " + this.phoneNumber);
		System.out.println("isHidden: " + this.isHidden);
//		System.out.println("Typ numeru: " + infoArray[6]);
		System.out.println("");
	}
//
	public void printContact(){

//		String[] infoArray1 = contact.split(";");
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < infoArray1.length; i++) {
//			sb.append(infoArray1[i]);
//			sb.append(";");
//		}
//
		System.out.printf("%d | %s | %s | %s | %d", this.id, this.name, this.surname, this.phoneNumber, this.age);


	}
}
