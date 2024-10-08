package com.demo.MavenProject;

import java.util.Scanner;

public class ClassA {

	public int add(int n1,int n2) {
		return n1+n2;
	}
	public int subtract(int n1, int n2) {
		return n1-n2;
	}
	public int multiply(int n1,int n2) {
		return n1*n2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1:");
		int n1 =sc.nextInt();
		System.out.println("Enter number 2:");
		int n2 =sc.nextInt();
		
		ClassA obj = new ClassA();
		System.out.println("Addition :"+obj.add(n1, n2));
		System.out.println("Subtraction :"+obj.subtract(n1, n2));
		System.out.println("Multiplication :"+obj.multiply(n1, n2));
	}

}
