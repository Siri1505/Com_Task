package com.demo.MavenProject;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class ClassBTest {

	ClassB obj = new ClassB();
	
	@Test
	public void testIsPalindromeTrue() {

		String input = "RaceCar";
		assertDoesNotThrow(() -> obj.isPalindrome(input));

	}


	@Test
	public void testIsPrime() {

		int num = 143;
		assertDoesNotThrow(() -> obj.isPrime(num));

	}
	
	
	 
	


}
