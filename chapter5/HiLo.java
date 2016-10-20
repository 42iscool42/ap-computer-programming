import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        boolean playAgain = true;
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        while (playAgain) {
            System.out.println("Welcome to the Hi-Lo Guessing Game");
            System.out.println("You can end your guessing at any time");
            System.out.println("by entering a zero for your guess.");
            System.out.println("The number will be between 1 and 100");
            int guess = 101;
            int guesses = 0;
            int num = ran.nextInt(100) + 1;
            while (guess != 0 && guess != num) {
                guess = input.nextInt();
                guesses++;
                if (guess > num) System.out.println("High");
                if (guess < num) System.out.println("Low");
                if (guess == num) System.out.println("You go it");
            }
            System.out.println("You got it in " + guesses + " guesses");
            
            System.out.println("Play again? 1: yes 2: no");
            int again = input.nextInt();
            playAgain = (again == 1);
        }
    }
}