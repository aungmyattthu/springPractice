package programming;

import java.util.List;

public class FP01Functional {
	public static void main(String[] args) {
		printAllNumberInListFunctinal(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
		System.out.println("________________________________________");
		printEvenNumberInListFunctinal(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
		System.out.println("________________________________________");
		printSquaresOfEvenNumberInListFunctinal(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
	}

//	private static boolean isEven(int number) {
//		return number % 2 == 0;
//	}

	// functional approach
	private static void printAllNumberInListFunctinal(List<Integer> numbers) {

		// what to do?
		// FP01Functional::print #method reference
//		numbers.stream()
//			.forEach(FP01Functional::print);
		numbers.stream().forEach(System.out::println);
	}

	private static void printEvenNumberInListFunctinal(List<Integer> numbers) {

		// what to do?
		// FP01Functional::print #method reference
		// numbers.stream()
		// .forEach(FP01Functional::print);
		// numbers.stream()
		// .filter(FP01Functional::isEven)
		// .forEach(System.out::println);
		// lambda expression
		numbers.stream().filter(a -> a % 2 == 0 && a == 2).forEach(System.out::println);
	}

	private static void printSquaresOfEvenNumberInListFunctinal(List<Integer> numbers) {

		numbers.stream()
				.filter(a -> a % 2 == 0)
				.map(number -> number * number)
				.forEach(System.out::println);
	}
}
