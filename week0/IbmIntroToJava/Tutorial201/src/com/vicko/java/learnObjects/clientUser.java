package com.vicko.java.learnObjects;

public class clientUser extends employeeUser implements EmailOptionElegible {

	public clientUser() {
		super();
	}

	public clientUser(String username, String firstName, String lastName, long id, String address, short zipCode,
			String state, String country) {
		super(username, firstName, lastName, id, address, zipCode, state, country);
		
	}

	@Override
	public void emailUserName(int id, String firstName, String LastName) {
		System.out.println("El usario es" + firstName + LastName + id);

	}

}
