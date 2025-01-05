package programming;

import java.util.List;

public class FP01Structured {
	public static void main(String[] args) {
		printAllNumberInListStructured(List.of(12,9,13,4,6,2,4,12,15));
		System.out.println("________________________________________");
		printEvenNUmberInListStructured(List.of(12,9,13,4,6,2,4,12,15));
	}
	
	private static void printEvenNUmberInListStructured(List<Integer> numbers) {
		
		for(int number:numbers) {
			if(number%2 == 0)
				System.out.println(number); 
		}	
	}

	// traditional approach
	private static void printAllNumberInListStructured(List<Integer> numbers) {
		// How to loop the numbers?
		for(int number:numbers) {
			System.out.println(number); 
		}		
	}
	
	
}
