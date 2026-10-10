package org.java.qa;

public class ConditionlStatement3 {
	static int a=100;
	static double d;
	static char c;

	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");
		
		int bankbalance=12340;
		int withdrawnAmount=10000;
		int atmPin=2234;
		
		if(atmPin==2234) {
			if(bankbalance>withdrawnAmount){
				System.out.println("You can withdraw money");
			} else {
				System.out.println("Insufficient Balance");
			}
		} else {
			System.out.println("Entered pin is incorrect");
		}
	
		
		
		System.out.println("End------------------------------------------------------------------");
	}

}
