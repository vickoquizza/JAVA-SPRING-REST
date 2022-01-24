package com.vicko.java.learnObjects;

public class finalUser extends clientUser implements SendSomething {

	public finalUser() {
		super();
		
	}

	public finalUser(String username, String firstName, String lastName, long id, String address, short zipCode,
			String state, String country) {
		super(username, firstName, lastName, id, address, zipCode, state, country);
		
	}
	
}
