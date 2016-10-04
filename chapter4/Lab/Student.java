package chapter4.Lab;

//************************************************************
//Student.java
//
//Define a student class that stores name, score on test 1, and
//score on test 2. Methods prompt for and read in grades,
//compute the average, and return a string containing student's info.
//************************************************************
import java.util.Scanner;
public class Student
{
	//declare instance data
	private String studentName;
	int score1, score2;
	//---------------------------------------------
	//constructor
	//---------------------------------------------
	public Student(String studentName)
	{
		this.studentName = studentName;
	}
	//---------------------------------------------
	//inputGrades: prompt for and read in student's grades for test1 and test2.
	//Use name in prompts, e.g., "Enter's Joe's score for test1".
	//---------------------------------------------
	public void inputGrades()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first score: ");
		score1 = input.nextInt();
		System.out.print("Enter second score: ");
		score2 = input.nextInt();
	}
	
	public String getName() {
		return studentName;
	}
	
	
	//---------------------------------------------
	//getAverage: compute and return the student's test average
	//---------------------------------------------
	//add header for getAverage
	public double getAverage() {
		return (double)(score1 + score2) / 2.0;
	}
	//---------------------------------------------
	//getName: print the student's name
	//---------------------------------------------
	//add header for printName
	public void printName()
	{
		System.out.println("Name: " + studentName);
	}
}
