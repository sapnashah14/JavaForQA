package org.javaoops.qa;

public class MethodOverloading {

	public void m1() {
		System.out.println("m1");
	}
	
	public void m1(int a) {
		System.out.println("m1 with int argument");
		System.out.println(a);
	}
	
	int m1(String s1) {
		System.out.println("m1 with 1 string argument");
		System.out.println(s1);
		return 10;
	}
	
	public void m1(int a, String b) {
		System.out.println("m1 with int a and string b argument");
	}
	
	public void m1(String a, int b) {
		System.out.println("m1 with int b and string a argument");
	}
	
	
}
