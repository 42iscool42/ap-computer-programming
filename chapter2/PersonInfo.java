package chapter2;

import java.util.Scanner;

public class PersonInfo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Name: ");
		String name = input.nextLine();
		System.out.print("Age: ");
		int age = Integer.parseInt(input.nextLine());
		System.out.print("College: ");
		String college = input.nextLine();
		System.out.print("Pet's Name:");
		String pet = input.nextLine();
		System.out.printf("Hello, my name is %s and I am %d years\nold. I'm enjoying my time at %s, though\nI miss my pet %s very much!", name, age, college, pet);
		
	}
}
