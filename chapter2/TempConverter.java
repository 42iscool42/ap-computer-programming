package chapter2;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temperature in Fahrenheit: ");
		double tempF = input.nextDouble();
		double tempC = (tempF-32) * 5.0 /9.0;
		System.out.println(tempF + " degrees Fahrenheit is " + tempC + " degrees celsius");
	}

}
