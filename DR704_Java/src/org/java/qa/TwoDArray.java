package org.java.qa;

public class TwoDArray {

	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");

		int arr[][]= new int[2][2];
		arr[0][0] = 3237;
		arr[0][1] = 3237;
		arr[1][0] = 323777;
		arr[1][1] = 356237;
		
		System.out.println("Print Directly");
		System.out.println(arr[0][0]);
		
		System.out.println("Print via for loop");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		System.out.println("Print via for each loop or advance for loop");
		for(int brr[]:arr) {
			for(int crr:brr) {
				System.out.println(crr);
			}
		}
		
		int drr[][]= {{33,333}, {444,555}, {666,7777}};
		for(int brr[]:drr) {
			for(int crr:brr) {
				System.out.println(crr);
			}
		}
		System.out.println("End------------------------------------------------------------------");
	}

}
