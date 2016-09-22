package chapter3;

import java.lang.Math;
import java.util.Scanner;

public class NearestInts {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		double in = input.nextDouble();
		
		System.out.println((int)Math.floor(in));
		System.out.println((int)Math.ceil(in));
	}

}
