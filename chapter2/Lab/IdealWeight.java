package chapter2.Lab;

import java.util.Scanner;

public class IdealWeight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the feet part of your height: ");
		int feet = input.nextInt();
		
		System.out.print("Enter the inches part of your height: ");
		int inches = input.nextInt();
		
		int height = feet * 12 + inches;
		int idealWeightM = 106 + 6 * (height - 60);
		int idealWeightW = 100 + 5 * (height - 60);
		
		System.out.println("Ideal male weight: " + idealWeightM);
		System.out.println("Min weight: " + idealWeightM * 0.85 + " Max weight: " + idealWeightM * 1.15);
		System.out.println("Ideal female weight: " + idealWeightW);
		System.out.println("Min weight: " + idealWeightW * 0.85 + " Max weight: " + idealWeightW * 1.15);
	}

}
