package programming;

import java.util.List;

public class Exercise {
	private static List<String> courses = List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
	private static List<Integer> numList = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
	public static void main(String[] args) {
		// Ex1. Print only odd number from the list
		numList.stream()
		.filter(a->a%2==1)
		.forEach(System.out::println);
		System.out.println("________________________________________");
		// Ex2. Print all course individually
		courses.stream()
		.forEach(System.out::println);
		System.out.println("________________________________________");
		// Ex3. Print Courses containing the word 'Spring'
		courses.stream()
		.filter(s->s.contains("Spring"))
		.forEach(System.out::println);
		System.out.println("________________________________________");
		// Ex4. Print Courses Whose Name has atleast 4 letters
		courses.stream()
		.filter(s->s.length()>=4)
		.forEach(System.out::println);
		System.out.println("________________________________________");
		// Ex5. Print the cubes of odd numbers
		numList.stream()
		.filter(a -> a % 2 == 1)
		.map(x -> x*x*x)
		.forEach(System.out::println);
		System.out.println("________________________________________");
		// Ex6. Print the number of characters in each course name
		courses.stream()
		.map(s->s.length())
		.forEach(System.out::println);
		System.out.println("________________________________________");
	}
}
