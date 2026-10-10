package org.java.qa;

public class NonStaticVariableORInstanceVariable {
	 int a=100;
	 double d;
	 char c;

	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");
		
		//className refVariableName=new ClassName();
		NonStaticVariableORInstanceVariable ref=new NonStaticVariableORInstanceVariable();
		System.out.println(ref.a);
		System.out.println(ref.d);
		System.out.println(ref.c);
		
		
		
		System.out.println("End------------------------------------------------------------------");
	}

}
