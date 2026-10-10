package org.java.qa;

public class FibonacciSeries {
	
	public static void fibonacci(int n) {
		int a = 0;
		int b = 1;
		int c;
		c= a+b;
		System.out.print(a+" ");
		System.out.print(b+" ");
    for (int i = 1; i <= n-2 ; i++) {
		    c= a+b;
		    System.out.print(c+" ");
		    a = b;
		    b = c;
		}

	}

	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");
		
		
		fibonacci(10);
		
		
		System.out.println("End------------------------------------------------------------------");
	}

}
