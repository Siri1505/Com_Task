package com.demo.MavenProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ClassATest {
  
	
	ClassA obj1 = new ClassA();

	@Test
	public void testAdd() {
		assertEquals(89, obj1.add(13, 76));
	}
	
	@Test
	public void testsub() {
		assertEquals(95, obj1.subtract(100, 5));
	}
	
	@Test
	public void testMul() {
		assertEquals(1000, obj1.multiply(10, 100));
	}
	
	
	
	 
  
  
}
