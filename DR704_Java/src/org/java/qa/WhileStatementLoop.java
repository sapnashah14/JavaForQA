package org.java.qa;

public class WhileStatementLoop {

	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");

		//Print 1 to 10:
		
		int a=1;
		
		while(a<=10) {
	
			System.out.println(a);
			++a;
		
		}
		
		//Print 10 to 1:
		
				int b=10;
				
				while(b>=1) {
			
					System.out.println(b);
					--b;
				
				}
		
		System.out.println("End------------------------------------------------------------------");
	}

}
