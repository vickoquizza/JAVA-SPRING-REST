package com.vicko.intro;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void testPerson() {
		Person firstPerson = new Person("Vicko","Quizza", 22,85,1.80,true);
		
		firstPerson.setAge(10);
		
		assertEquals("Vicko Quizza", firstPerson.getFullName());
	    assertEquals(10, firstPerson.getAge());
	    assertEquals(85, firstPerson.getWeight());
	    assertEquals(1.80, firstPerson.getHeight());
	    assertEquals(true, firstPerson.isAdult());
	}  

}
