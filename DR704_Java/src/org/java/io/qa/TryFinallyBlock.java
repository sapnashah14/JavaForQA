package org.java.io.qa;

public class TryFinallyBlock {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try {
			System.out.println(10/0);
		}
		finally {
			System.out.println("I am inside finally block");
		}
		
		System.out.println("End");
	}

}
