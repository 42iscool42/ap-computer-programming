package chapter3;

import java.util.Scanner;
import java.util.Random;

public class RandomName {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random ran = new Random();
		System.out.print("Enter your first name: ");
		String firstName = input.next();
		System.out.print("enter your last name: ");
		String lastName = input.next();
		
		System.out.println(firstName.charAt(0) + lastName.substring(0,5) + (ran.nextInt(89) + 10));
	}
}
