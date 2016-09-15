package chapter2;

import java.util.Scanner;

public class SecondsToTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Seconds: ");
		int seconds = input.nextInt();
		
		System.out.printf("%d hours, %d minutes, %d seconds", seconds / 3600, (seconds % 3600) / 60, seconds % 60);

	}

}
