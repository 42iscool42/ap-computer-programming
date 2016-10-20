import java.util.Scanner;

public class LeapYear {
    public static final int SENTINEL = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the years after 1582 that you want to check. \nEnter 0 to terminate the program:");
        int in = SENTINEL + 1;
        while (in != SENTINEL) {
            in = input.nextInt();
            if (in < 1582 && in != SENTINEL) {
                System.out.println("Enter a year after 1852");
            } else if (in != SENTINEL) {
                System.out.println(in + " is a leap year: " + isLeapYear(in));
            }
        }
    }
    
    public static boolean isLeapYear(int year) {
        if (year < 1582) throw new Error("Year can't be less than 1852");
        return (year%4==0 && (year%100!=0 || year%400==0));
    }
}