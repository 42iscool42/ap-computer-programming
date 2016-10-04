package chapter4.Lab;

import java.util.Scanner;

public class TestNames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a first middle and last name: ");
		Name n1 = new Name(input.next(), input.next(), input.next());
		System.out.print("Enter another first middle and last name: ");
		Name n2 = new Name(input.next(), input.next(), input.next());
		
		System.out.println(n1.firstMiddleLast() + "\n" + n1.lastFirstMiddle() + "\n" + n1.initials() + "\n" + n1.length());
		System.out.println(n2.firstMiddleLast() + "\n" + n2.lastFirstMiddle() + "\n" + n2.initials() + "\n" + n2.length());
	}

}
