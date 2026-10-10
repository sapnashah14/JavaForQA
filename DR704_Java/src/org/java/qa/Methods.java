package org.java.qa;

public class Methods {

	public static void m1() {
		System.out.println("m1");
	}
	
	protected void m2() {
		System.out.println("m2");
	}
	
	private static void m3() {
		System.out.println("m3");
	}
	
	void m4() {
		System.out.println("m4");
	}
	
	static int m5() {
		System.out.println("m5");
		return 10;
	}
	
	double m6() {
		System.out.println("m6");
		return 10.00d;
	}
	
	private static void m7(int a) {
		System.out.println("m7");
		System.out.println(a+1);
	}
	
	public void m8(String s, int a) {
		System.out.println("m8");
		System.out.println(s+a);
	}
	
	public static short m9(int b) {
		System.out.println("m9");
		System.out.println(b+67347624);
		return 3456;
	}
	
	long m10(double d) {
		System.out.println("m10");
		System.out.println(d);
		return 100432042404l;
	}

	public static void main(String[] args) {
		System.out.println("Start");
		
		Methods.m1();
		Methods obj=new Methods();
		obj.m2();
		
		Methods.m3();
		obj.m4();
		
		Methods.m5();
		System.out.println(Methods.m5());
		
		obj.m6();
		System.out.println(obj.m6());
		
		Methods.m7(100);
		obj.m8("ITVedant", 88888);
		
		Methods.m9(10000);
		System.out.println(Methods.m9(13365237));
		
		obj.m10(327683467.20);
		System.out.println(obj.m10(325635.008545));
		
		
		
		System.out.println("End");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
