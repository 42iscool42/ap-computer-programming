package chapter2;

import java.util.Scanner;

public class TimeToSeconds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hours: ");
		int hours = input.nextInt();
		System.out.print("Minutes: ");
		int minutes = input.nextInt();
		System.out.print("Seconds: ");
		int seconds = input.nextInt();
		
		System.out.println("Total seconds: " + (hours * 3600 + minutes * 60 + seconds));
	}

}
