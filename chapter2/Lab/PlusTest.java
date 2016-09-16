package chapter2.Lab;

// ************************************************************
// PlusTest.java
//
// Demonstrate the different behaviors of the + operator
// ************************************************************
public class PlusTest
{
	// -------------------------------------------------
	// main prints some expressions using the + operator
	// -------------------------------------------------
	public static void main (String[] args)
	{
		System.out.println ("This is a long string that is the " +
				"concatenation of two shorter strings.");//This is a long string that is the concatenation of two shorter strings.  Since java ignores white space, the two strings are concatinated together even though they are on two lines.
		System.out.println ("The first computer was invented about" + 55 +
				"years ago."); //The first computer was invented about55years ago.  The first string gets 55 concatinated to it the then second string gets added to that
		System.out.println ("8 plus 5 is " + 8 + 5); //8 plus 5 is 85.  The 8 is added to the string and the 5 is added to string
		System.out.println ("8 plus 5 is " + (8 + 5)) ; //8 plus 5 is 13.  This is because the parentheses say that 8 +5 is calculated before string concatination
		System.out.println (8 + 5 + " equals 8 plus 5."); //13 equals 8 plus 5.  This is because 8+5 is calculated before string concatination
	}
}