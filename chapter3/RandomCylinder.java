package chapter3;

import java.util.Random;
import java.lang.Math;

public class RandomCylinder {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int radius = ran.nextInt(21);
		int height = ran.nextInt(21);
		
		double volume = Math.PI * Math.pow(radius, 2) * height;
		double surfaceArea = Math.PI * radius * height;
		
		System.out.printf("Volume: %f\nSurface Area: %f\n", volume, surfaceArea);
	}

}
