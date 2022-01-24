package com.vicko.java.learnObjects;

public class NetworkForUsers {
	public static void main(String args[]) {
		employeeUser Carlos = new employeeUser("carlos123", "Carlos", "Martinez", 12345, "Cali", (short) 70098, user.VAL, user.COL);
		Carlos.setCompany(employeeUser.FIRST_COMPANY);
		Carlos.printAudit();
		
		
		//Se puede hacer una asignacion de una subclase a una superclase pero no de forma viceversa
		//Si se hace una asginacion de una subclase a otra por lo geneal, la clase a la cual se le va a hacer la asignación(la que va en la izquierda), tiene que ser la que más cerca de la superclase este
		user carlosFueraDeEmpresa = Carlos;
	}

}
