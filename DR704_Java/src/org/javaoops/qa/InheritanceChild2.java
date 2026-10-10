package org.javaoops.qa;

public class InheritanceChild2 extends InheritanceChild1 {
	
	int Child2BankBalance=2500;

	public void child2Car() {
		System.out.println("Toy Car");
	}
	
	public static void main(String[] args) {
		
		InheritanceParent parent=new InheritanceParent();
		System.out.println(parent.parentBankBalance);
		parent.parentCar();
		
		InheritanceChild1 child=new InheritanceChild1();
		System.out.println(child.ChildBankBalance);
		System.out.println(child.parentBankBalance);
		
		child.childCar();
		child.parentCar();
		
		InheritanceChild2 child2=new InheritanceChild2();
		System.out.println(child2.Child2BankBalance);
		System.out.println(child2.ChildBankBalance);
		System.out.println(child2.parentBankBalance);
		
		child2.child2Car();
		child2.childCar();
		child2.parentCar();
	
		
	}
}
