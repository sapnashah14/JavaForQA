package org.java.qa;

public class LoopingStatement {

	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");

		// Print 1 to 10;

		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}

		// Print 10 to 1;

		for (int a = 10; a >= 1; a--) {
			System.out.println(a);
		}
		
		//Second Way print 1 to 10;
		int b=10;
		
		for(b=1; b<=10; b++) {
			System.out.println(b);
		}

		//Second Way print 10 to 1;
				int c=10;
				
				for(c=10; c>=1; c--) {
					System.out.println(c);
				}
		System.out.println("End------------------------------------------------------------------");
	}

}
