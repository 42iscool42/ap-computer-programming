package chapter2;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three integers:\n\t1:");
		int in1 = input.nextInt();
		System.out.print("2:");
		int in2 = input.nextInt();
		System.out.print("3:");
		int in3 = input.nextInt();
		System.out.println("Average: " + (in1+in2+in3)/3);
	}
}
