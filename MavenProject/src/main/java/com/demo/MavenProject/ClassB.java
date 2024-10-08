package com.demo.MavenProject;

import java.util.Scanner;

public class ClassB {
	public void isPalindrome(String str) {
		String revStr = "";
		for(int i=str.length()-1;i>=0;i--) {
			revStr = revStr+str.charAt(i);
		}
		if(revStr.toLowerCase().equals(str.toLowerCase())) {
			System.out.println(str+" is a palindrome..");
		}else {
			System.out.println("Not a palindrome......");
		}
		
	}
	public void isPrime(int num) {
		boolean isPrime = true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(num+" is a prime number...");
		}
		else
		{
			System.out.println(num+" is not a prime number.....");
		}
		
	}
  public static void main(String[] args) {
	ClassB obj = new ClassB();
	
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String :");
    String str = sc.next();
    
     obj.isPalindrome(str);
     
     System.out.println("Enter a number :");
     int num = sc.nextInt();
     obj.isPrime(num);
    
    
    

  }


}
