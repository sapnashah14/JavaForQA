package org.java.qa;

public class ForEachLoop {

	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");

		int arr[] = {100, 200, 300};

		// Using For Loop
		System.out.println("Using For Loop");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

        //Using For Each Loop
		System.out.println("Using Advance or For Each Loop");

		for (int brr : arr) {
			System.out.println(brr);
			
		//Array Reverse Using For loop
		System.out.println("Array Reverse Using For loop");
		for (int i = 2; i > arr.length; i--) {
			System.out.println(arr[i]);
		}

		}
		
		

		System.out.println("End------------------------------------------------------------------");
	}

}
