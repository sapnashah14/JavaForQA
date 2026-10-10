package org.java.qa;

public class ArrayOfIntegers {

	public static void main(String[] args) {
		
		int[] numbers = {14, 25, 45, 52, 30, 9};
		int sum = 0;
		int max = numbers[0];
		int min = numbers[0];
		
		System.out.print("The Even numbers are ");
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] %2 == 0) {
				System.out.print(numbers[i]+ ", ");
			}
		}
		System.out.println();
		System.out.print("The sum of all elements is ");
		for (int i = 0; i<numbers.length; i++) {
			sum = sum + numbers[i];
		}
	    System.out.println(sum);
	    
	    System.out.print("The maximum number is ");
	    for (int i = 0; i<numbers.length; i++) {
	    	if (numbers[i] > max) {
	            max = numbers[i];
	        }
	    }
	    System.out.println(max);
	    
	    System.out.print("The minimum number is ");
	    for (int i = 0; i<numbers.length; i++) {
	    	if (numbers[i] < min) {
	            min = numbers[i];
	        }
	    }
	    System.out.println(min);
	    
	}

}
