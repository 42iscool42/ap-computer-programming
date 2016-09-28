//This class lays down some sick rhymes about auto boxing and primitive types

import java.util.Scanner;

public class IntRapper {
    public static void main(String[] rhymeScheme) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = input.nextInt();
        
        System.out.printf("%d converted to:\n  -Binary: %s\n  -Octal: %s\n  -Hexadecimal: %s\n", userInput, Integer.toBinaryString(userInput), Integer.toOctalString(userInput), Integer.toHexString(userInput));
        
        System.out.printf("Max int val: %d\nMin int val: %d\n", Integer.MAX_VALUE, Integer.MIN_VALUE);
        
        System.out.print("Enter two integers separated by a space: ");
        String int1 = input.next();
        String int2 = input.next();
        
        int sum = Integer.parseInt(int1) + Integer.parseInt(int2);
        System.out.println("\nSum: " + sum);
    }
}