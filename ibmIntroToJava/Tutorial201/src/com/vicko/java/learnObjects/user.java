package com.vicko.java.learnObjects;

import java.util.Objects;

public class user {
	
	public static final String  VAL = "Valle del Cauca";
	public static final String COL = "Colombia";
	
	private String username;
	private String firstName;
	private String lastName;
	private long id;
	private String address;
	private short zipCode;
	private String state;
	private String country;
	
	//Default constructor es el que esta implicito al crear la clase y el que por defecto dene estar en toda clase de java
	
	public user() {
		
	}
	
	//Generamos un override del hashcode y de equals para hacer que cuando Java detecte dos instancias de nuestra nueva clase, determine que son esta nueva definicion
	
	@Override
	public int hashCode() {
		return Objects.hash(address, country, firstName, id, lastName, state, username, zipCode);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		user other = (user) obj;
		return Objects.equals(address, other.address) && Objects.equals(country, other.country)
				&& Objects.equals(firstName, other.firstName) && id == other.id
				&& Objects.equals(lastName, other.lastName) && Objects.equals(state, other.state)
				&& Objects.equals(username, other.username) && zipCode == other.zipCode;
	}

	


	@Override
	public String toString() {
		return "user [username=" + username + ", firstName=" + firstName + ", lastName=" + lastName + ", id=" + id
				+ ", address=" + address + ", zipCode=" + zipCode + ", state=" + state + ", country=" + country + "]";
	}

	public user(String username, String firstName, String lastName, long id, String address, short zipCode,
			String state, String country) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.address = address;
		this.zipCode = zipCode;
		this.state = state;
		this.country = country;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public short getZipCode() {
		return zipCode;
	}

	public void setZipCode(short zipCode) {
		this.zipCode = zipCode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	//Esto se llama sobrecargar metodos
	
	public void printAudit(StringBuilder buffer) {
		   buffer.append("username=");
		   buffer.append(getUsername());
		   buffer.append(",");
		   buffer.append("id=");
		   buffer.append(getId());
		   buffer.append(",");
		   buffer.append("address=");
		   buffer.append(getAddress());
		}
	
	public void printAudit() {
		   System.out.println("username= " + getUsername() + "id=" + getId() + "address=" + getAddress());
		}

}
