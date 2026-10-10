package org.java.qa;
import java.util.Scanner;
public class PrimeOrNot {
	public static boolean prime(int number) {
		boolean isPrime = true;
		if (number <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < number; i++) {

				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}

		return isPrime;
	}
	public static void main(String[] args) {
		System.out.println("Start------------------------------------------------------------------");

		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");
		int number = sc.nextInt();

		System.out.println(prime(number));
		

		System.out.println("End------------------------------------------------------------------");
	}

}
