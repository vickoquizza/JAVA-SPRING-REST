package com.vicko.java.learnObjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tryCatchTest {

	@Test
	void test() {
		try {
		    employeeUser employee1 = null;
		    employee1.setCompany("nfl");
		  } catch (Exception e) {
			  System.out.println("Caught exception: " + e.getMessage());
		  } finally {
			  System.out.println("DONE");
		  }
	}

}
