package chapter2;

import java.util.Scanner;

public class CoinJarValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quarters: ");
		int quarters = input.nextInt();
		System.out.print("Dimes: ");
		int dimes = input.nextInt();
		System.out.print("Nickels: ");
		int nickels = input.nextInt();
		System.out.print("Pennies: ");
		int pennies = input.nextInt();
		
		System.out.println("Total worth: $" + (quarters * 0.25 + dimes * .10 + nickels * .05 + pennies * 0.01));
	}

}
