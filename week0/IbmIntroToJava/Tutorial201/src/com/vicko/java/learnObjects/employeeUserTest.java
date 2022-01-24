package com.vicko.java.learnObjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class employeeUserTest {

	@Test
	void testPrintAudit() {
		employeeUser Carlos = new employeeUser("carlos123", "Carlos", "Martinez", 12345, "Cali", (short) 70098, user.VAL, user.COL);
		Carlos.setCompany("Globant");
		Carlos.setAdminPermises(true);
		
		
		Carlos.printAudit();
	}
}
