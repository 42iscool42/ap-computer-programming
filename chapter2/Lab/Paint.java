package chapter2.Lab;
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.util.Scanner;
public class Paint
{
	public static void main(String[] args)
	{
		final int COVERAGE = 350; //paint covers 350 sq ft/gal
		//declare integers length, width, and height;
		int length, width, height, doors, windows;
		//declare double totalSqFt;
		double totalSqFt;
		//declare double paintNeeded;
		double paintNeeded;
		//declare and initialize Scanner object
		Scanner input = new Scanner(System.in);
		//Prompt for and read in the length of the room
		System.out.print("Length of the room: ");
		length = input.nextInt();
		//Prompt for and read in the width of the room
		System.out.print("Width of the room: ");
		width = input.nextInt();
		//Prompt for and read in the height of the room
		System.out.print("Height of the room: ");
		height = input.nextInt();
		
		System.out.print("Enter number of windows: ");
		windows = input.nextInt();
		
		System.out.print("Enter the number of doors: ");
		doors = input.nextInt();
		
		//Compute the total square feet to be painted--think
		//about the dimensions of each wall
		totalSqFt = (2*width + 2*length) * height; 
		//Compute the amount of paint needed
		paintNeeded = totalSqFt/COVERAGE - (doors * 20 + windows * 15);
		//Print the length, width, and height of the room and the
		//number of gallons of paint needed.
		System.out.printf("Dimensions of the room: %d x %d x %d.\nPaint needed: %d gallons\n", length, width, height, paintNeeded);
	}
}