package org.java.qa;

public class StaticVariable {
	static int a=100;
	static double d;
	static char c;

	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");
		int a=324324;
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);
		System.out.println(StaticVariable.a); // localvariable is preferred over static so write like this
		System.out.println(StaticVariable.d);
		System.out.println(StaticVariable.c);
		
		
		
		System.out.println("End------------------------------------------------------------------");
	}

}
