package chapter2;

import java.util.Scanner;

public class MilesToKilometers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of miles: ");
		float miles = input.nextFloat();
		
		System.out.println(miles + " miles is " + miles * 1.60935 + " kilometers");

	}

}
