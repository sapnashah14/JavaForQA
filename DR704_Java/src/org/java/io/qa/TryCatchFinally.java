package org.java.io.qa;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try {
			System.out.println(10/0);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am inside finally Block");
		}
		
		System.out.println("End");
	}
}
