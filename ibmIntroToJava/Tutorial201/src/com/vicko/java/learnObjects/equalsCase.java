package com.vicko.java.learnObjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class equalsCase {

	@Test
	void test() {
		employeeUser employ1 = new employeeUser();
		employeeUser employ2 = new employeeUser();
		
		
		System.out.println(employ1.equals(employ2));
		System.out.println(employ1.toString());
		
		employeeUser.aboutUserEmployee();
	}

}
