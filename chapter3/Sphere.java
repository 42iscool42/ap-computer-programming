package chapter3;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Sphere {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of a sphere: ");
		double radius = input.nextDouble();
		
		double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		
		DecimalFormat dfmt = new DecimalFormat("0.####");
		System.out.printf("The surface ares is %s and volume is %s", dfmt.format(surfaceArea), dfmt.format(volume));
	}

}
