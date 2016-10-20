import java.util.Scanner;

public class RPS {
    public static void main(String[] joshIsDum) {
        Scanner input = new Scanner(System.in);
        String in = " ";
        while (!Character.toString(in.charAt(0)).toLowerCase().equals("e")){
            System.out.println("Enter Rock(r), Paper(p), Scissors(s), or Exit(e) to exit:");
            in = input.next();
            in = Character.toString(in.charAt(0)).toLowerCase();
            int compThrow = (int) (Math.random() * 3) + 1;
            if (in.equals("r")) {
                if (compThrow == 1) {
                    System.out.println("I throw rock, it's a tie.");
                } else if (compThrow == 2) {
                    System.out.println("I throw paper, I win.");
                } else {
                    System.out.println("I throw scissors, you win.");
                }
            } else if (in.equals("p")) {
                if (compThrow == 1) {
                    System.out.println("I throw rock, you win.");
                } else if (compThrow == 2) {
                    System.out.println("I throw paper, it's a tie.");
                } else {
                    System.out.println("I throw scissors, I win.");
                }
            } else if (in.equals("s")) {
                if (compThrow == 1) {
                    System.out.println("I throw rock, I win.");
                } else if (compThrow == 2) {
                    System.out.println("I throw paper, you win.");
                } else {
                    System.out.println("I throw scissors, it's a tie.");
                }
            } else if (!in.equals("e")){
                System.out.println("Unrecognized throw");
            }
        }
        System.out.println("Thanks for playing");
    }
}