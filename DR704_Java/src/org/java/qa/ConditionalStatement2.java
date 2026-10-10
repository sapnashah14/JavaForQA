package org.java.qa;

public class ConditionalStatement2 {
	static int a=100;
	static double d;
	static char c;

	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");
		int a=95;
		int b=78;
		int c=100;
		if (a>b && a>c) {
			System.out.println("A is the topper");
		} else if (b>a && b>c) {
			System.out.println("B is the topper");
		} else {
			System.out.println("C is the topper");
		}
		
		
		
		System.out.println("End------------------------------------------------------------------");
	}

}
