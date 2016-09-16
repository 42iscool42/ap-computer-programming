package chapter2.Lab;

import java.util.Scanner;
//************************************************************
//Circle.java
//
//Print the area of a circle with two different radii
//************************************************************
public class Circle
{
	public static void main(String[] args)
	{
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		int radius1 = input.nextInt();
		double area1 = PI * radius1 * radius1;
		double circumference1 = PI * 2 * radius1;
		System.out.println("The area of a circle with radius " + radius1 +
				" is " + area1 + " and the circumference is " + circumference1);
		int radius2 = radius1*2;
		double area2 = PI * radius2 * radius2;
		double circumference2 = PI * 2 * radius2;
		System.out.println("The area of a circle with radius " + radius2 +
				" is " + area2 + " and the circumference is " + circumference2);
		
		double areaChange = area2/area1;
		double circumferenceChange = circumference2/circumference1;
		System.out.println("Change in area: " + areaChange);
		System.out.println("Change in circumference: " + circumferenceChange);
	}
}