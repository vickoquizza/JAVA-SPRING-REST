package com.vicko.java.learnObjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class finalUserTest {

	@Test
	void testEmailUserName() {
		finalUser mariano = new finalUser();
		
		mariano.emailUserName(99, "Sebas", "Garcia");
	}

}
