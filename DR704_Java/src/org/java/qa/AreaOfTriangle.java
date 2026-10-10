package org.java.qa;

public class AreaOfTriangle {
	
	static double AOT(double b, double h) {
	    System.out.println("AOT");
	    return (b * h) / 2;
	}


	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");

	
		System.out.println(AreaOfTriangle.AOT(10, 5));
		
		System.out.println("End------------------------------------------------------------------");
	}

}
