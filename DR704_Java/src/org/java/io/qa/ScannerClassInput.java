package org.java.io.qa;

import java.util.Scanner;

public class ScannerClassInput {

	public static void main(String[] args) {
		
		System.out.println("Scanner Class Start");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Age:");
		
		int age = scanner.nextInt();
		
		if (age>=18) {
			System.out.println("You can vote");
		}else {
			System.out.println("You can't vote");
		}
		
	}
}
