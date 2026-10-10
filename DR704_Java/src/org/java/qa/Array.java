package org.java.qa;

public class Array {

	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");

		int arr[] = new int[2];
		arr[0] = 100;
		arr[1] = 200;

		System.out.println(arr[0]);
		System.out.println(arr[1]);

		// Using For Loop
		System.out.println("Using For Loop");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

        //Using For Each Loop for reverse array
		System.out.println("Using Advance or For Each Loop");

		for (int brr : arr) {
			System.out.println(brr);
		}
		
		// Using For Loop
				System.out.println("Using For Loop");
				for (int i = 0; i < arr.length-1; i++) {
					System.out.println(arr[i]);
				}

//		        //Using For Each Loop
//				System.out.println("Using Advance or For Each Loop");
//
//				for (int brr : arr) {
//					System.out.println(brr);
//				}
//		
		

		System.out.println("End------------------------------------------------------------------");
	}

}
