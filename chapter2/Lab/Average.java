package chapter2.Lab;
//*****************************************************************
//Average.java
//
//Read three integers from the user and print their average
//*****************************************************************
import java.util.Scanner;
public class Average
{
	public static void main(String[] args)
	{
		int val1, val2, val3;
		double average;
		Scanner scan = new Scanner(System.in) ;
		//get three values from user
		System.out.println("Please enter three integers and " +
				"I will compute their average");
		val1 = scan.nextInt();
		val2 = scan.nextInt();
		val3 = scan.nextInt();
		//compute the average
		average = (double)(val1+val2+val3)/3.0;
		//print the average
		System.out.println("Average: " + average);
	}
} 
/*
int a = 3, b = 10, c = 7;
double w = 12.9, y = 3.2;
a. a + b * c == 73
b. a - b - c  == -10
c. a / b == 0
d. b / a == 3
e. a - b / c == 2
f. w / y == 4.03125
g. y / w == .24806
h. a + w / b == 4.29
i. a % b / y == 3
j. b % a == 1
k. w % y == .1
*/