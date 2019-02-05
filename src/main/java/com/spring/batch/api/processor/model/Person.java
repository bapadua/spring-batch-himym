package com.spring.batch.api.processor.model;

import lombok.Data;

@Data
public class Person {
	private String lastName;
	private String firstName;
	
	public Person() {}
	
	public Person(String firstname, String lastname) {
		this.lastName = lastname;
		this.firstName = firstname;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + "]";
	}

}
