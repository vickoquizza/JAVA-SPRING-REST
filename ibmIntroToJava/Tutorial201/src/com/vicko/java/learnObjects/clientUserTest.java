package com.vicko.java.learnObjects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class clientUserTest {

	@Test
	void testEmailUserName() {
		clientUser mariano = new clientUser();
		
		mariano.emailUserName(99, "Sebas", "Garcia");
	}

}
