package org.java.qa;

public class ConditionalStatement1 {
	static int a=100;
	static double d;
	static char c;

	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");
		
		int age=10;
		
		if(age>=18) { //10>=18
			System.out.println("You can vote");
		} else {
			System.out.println("You are not eligible for voting");
		}
		
		
		System.out.println("End------------------------------------------------------------------");
	}

}
