package chapter2;

import java.util.Scanner;

public class FindArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Side length: ");
		int side = input.nextInt();
		
		System.out.println("Perimeter: " + 4 * side);
		System.out.println("Area: " + side * side);
	}

}
