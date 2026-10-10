package org.javaoops.qa;

public class InheritanceChild1 extends InheritanceParent{

	int ChildBankBalance=5000;
	
	public void childCar() {
		System.out.println("Motor Bike");
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
		
	}
}
