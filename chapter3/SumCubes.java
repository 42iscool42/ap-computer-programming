package chapter3;

import java.util.Scanner;
import java.lang.Math;

public class SumCubes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num1 = input.nextInt();
		System.out.print("Enter another number: ");
		int num2 = input.nextInt();
		System.out.print("Sum of the two numbers cubed: ");
		System.out.println(Math.pow(num1, 3) + Math.pow(num2,  3));
	}
}
