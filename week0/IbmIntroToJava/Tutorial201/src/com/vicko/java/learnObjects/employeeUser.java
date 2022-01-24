package com.vicko.java.learnObjects;

import java.util.Objects;

public class employeeUser extends user {
	
	public static String FIRST_COMPANY = "ABC, inc";
	public static String SECOND_COMPANY = "DEF, inc";
	
	private String company;
	private boolean adminPermises;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(adminPermises, company);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		employeeUser other = (employeeUser) obj;
		return adminPermises == other.adminPermises && Objects.equals(company, other.company);
	}

	public employeeUser(String username, String firstName, String lastName, long id, String address, short zipCode, String state, String country) {
		super(username, firstName, lastName, id, address, zipCode, state, country);
	}

	public employeeUser() {
		super();
		
	}

	
	//Se puede hacer override de equals sin embargo esta es la version en donde se comparan las instancias y que viene por defecto de objets
	/*
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	*/

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public boolean isAdminPermises() {
		return adminPermises;
	}

	public void setAdminPermises(boolean adminPermises) {
		this.adminPermises = adminPermises;
	}
	
	//Esto se llama sobremontar un metodo y sirve para modificar metodos heredados en subclases

	@Override
	public void printAudit(StringBuilder buffer) {
	/* de esta forma solo se imprimirian los atributos de la subclase
		buffer.append("Company=");
		buffer.append(getCompany());
		buffer.append("adminPermises=");
		buffer.append(isAdminPermises());
	*/
		// Asi para imprimir tambien los valores de la superclase
		super.printAudit(buffer);
		buffer.append("Company=");
		buffer.append(getCompany());
		buffer.append("adminPermises=");
		buffer.append(isAdminPermises());
	}
	@Override
	public void printAudit() {
		super.printAudit();
		System.out.println("Company= "+ getCompany());
	}

	@Override
	public String toString() {
		return super.toString() + "employeeUser [company=" + company + ", adminPermises=" + adminPermises + "]";
	}

	
	public static void aboutUserEmployee() {
		System.out.println("A user subclass");
	}


}
