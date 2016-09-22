package chapter3;

import java.lang.Math;
import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two points: ");
		System.out.print("X1: ");
		int x1 = input.nextInt();
		System.out.print("Y1: ");
		int y1 = input.nextInt();
		System.out.print("X2: ");
		int x2 = input.nextInt();
		System.out.print("Y2: ");
		int y2 = input.nextInt();
		
		double distance = Math.pow(x2*x2 - x2 * x1 + x1*x1 + y2 * y2 + y1 * y2 + y1 * y1, 0.5);
		System.out.println("Distance between the two points: " + distance);

	}

}
