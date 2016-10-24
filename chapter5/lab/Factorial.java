import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = -1;
        while (n < 0) {
            System.out.print("Enter a non-negative number:");
            n = input.nextInt();
            if (n < 0) System.out.println("Number must be positive");
        }
        System.out.println( n + "! = " + factorial(n));
    }
    
    public static int factorial(int n) {
        if (n < 2) return 1;
        return factorial(n-1);
    }
}