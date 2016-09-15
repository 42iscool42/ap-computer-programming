package chapter2;

import java.util.Scanner;

public class TimeCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Speed(mph): ");
		int speed = input.nextInt();
		System.out.print("Distance(mi): ");
		int distance = input.nextInt();
		
		System.out.println("Time: " + distance / speed);
	}

}
