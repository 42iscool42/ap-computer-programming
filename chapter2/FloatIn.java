package chapter2;

import java.util.Scanner;

public class FloatIn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 floating point numbers:");
		float f1 = input.nextFloat();
		float f2 = input.nextFloat();
		System.out.println("a+b: " + (f1+f2));
		System.out.println("a-b: " + (f1-f2));
		System.out.println("a*b: " + (f1+f2));
	}

}
