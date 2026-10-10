package org.java.qa;

public class Variables {
	//static variable
 static int a=10;
 static int b=20;
 //non static variable
 boolean c;
 int d=50;
 int e=80;
 
 
	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");
		
		//local variable
		int a=30;
		int b=40;
		
		System.out.println(a);
		System.out.println(b);
		
		//Static Variable
		System.out.println(Variables.a);
		System.out.println(Variables.b);
		
		//instance variable
		Variables ref=new Variables();
		System.out.println(ref.e);
		System.out.println(ref.d);
		System.out.println(ref.c);
		
		
		
		
		
		System.out.println("End------------------------------------------------------------------");
	}

}
