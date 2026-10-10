package org.java.qa;

public class DoWhileStatement {

	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");

		// Print 1 to 10:
		System.out.println("Print 1 to 10:");

		int a = 1;
		do {
			System.out.println(a);
			++a;
		} while (a <= 10);

		// Print 10 to 1:
		System.out.println("Print 10 to 1:");

		int b = 10;
		do {
			System.out.println(b);
			--b;
		} while (b >= 1);

		// Print 10.00 to 1.0:
		System.out.println("Print 10.00 to 1.0:");

		double c = 10.00;
		do {
			System.out.println(c);
			--c;
		} while (c >= 1.0);
		

		System.out.println("End------------------------------------------------------------------");
	}

}
