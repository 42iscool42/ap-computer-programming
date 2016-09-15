package chapter2;

import java.util.Scanner;

public class Fraction {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Numerator: ");
		int numerator = input.nextInt();
		System.out.print("Denominator: ");
		int denominator = input.nextInt();
		
		System.out.println("Decimal value: " + (double)numerator/denominator);
	}

}
