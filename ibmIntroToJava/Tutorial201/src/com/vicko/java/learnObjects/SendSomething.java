package com.vicko.java.learnObjects;

public interface SendSomething {

	
	default void checkSomething() {
		System.out.println("Checked!");
	}
	
	
}
