import java.util.Scanner;

public class Slots {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Slots. Type 'c' to continue playing or 'e' to exit.");
        String in = "c";
        while (!in.equals("e")) {
            int d1 = (int) (Math.random() * 10);
            int d2 = (int) (Math.random() * 10);
            int d3 = (int) (Math.random() * 10);
            System.out.println("Spin: " + d1 + d2 + d3);
            if (d1 == d2 && d2 == d3) {
                System.out.println("Jackpot!");
            } else if (d1 == d2 || d2 == d3 || d1 == d3) {
                System.out.println("Two match!");
            }
            in = input.next();
        }
        System.out.println("Thanks for playing.");
    }
}