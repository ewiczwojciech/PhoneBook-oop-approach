package com.company;

public class PhoneContact {

	private int id;
	private String name;
	private String surname;
	private String phoneNumber;
	private int age;
	private boolean isHidden;

	public PhoneContact(int id, String name, String surname, String phoneNumber, int age, boolean isHidden) {

		System.out.println("\nTworzę obiekt typu phone number...");

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

	public void printPhoneContact(){
		System.out.println("\nId: " + id + "\nImię: " + name + "\nNazwisko: " + surname + "\nNumer telefonu: " + phoneNumber + "\nWiek: " + age + "\nUkryty?: " + isHidden);
	}
}
