package chapter3;

import java.util.Scanner;
import java.lang.Math;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side lengths of a triangle: ");
		System.out.print("a: ");
		double a = input.nextDouble();
		System.out.print("b: ");
		double b = input.nextDouble();
		System.out.print("c: ");
		double c = input.nextDouble();
		
		double s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		System.out.println("Area of the triangle: " + area);
	}

}
