package com.demo.MavenProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ClassTest {

	ClassA obj = new ClassA();
	
	@ParameterizedTest
	@CsvSource({"10,10,20","20,45,65"})
	public void test(int n1,int n2,int sum) {
		assertEquals(sum, obj.add(n1, n2));
	}
	
	
}
