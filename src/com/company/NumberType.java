package com.company;

public enum NumberType {

	HOME("Domowy"), MOBI("Komórkowy"), WORK("Służbowy");

	private String fullName;

	NumberType(String type){
		this.fullName = type;
	}

	public String getFullName() {
		return fullName;
	}
}

