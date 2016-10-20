import java.util.Scanner;

public class Pig {
    public static void main(String[] rushabsMom){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to Pig. Type 'c' to continue rolling or 'p' to pass.");
        int pScore = 0;
        int cScore = 0;
        PairOfDice pair = new PairOfDice();
        while (pScore < 100 && cScore < 100) {
            String doThing = "c";
            int round = 0;
            while (!doThing.equals("p")) {
                boolean rolled1 = false;
                pair.roll();
                System.out.println("You rolled " + pair.getDie1() + " and " + pair.getDie2());
                if (pair.getDie1() == 1 && pair.getDie2() ==1) {
                    System.out.println("You lost all your points!");
                    pScore = 0;
                    doThing = "p";
                    round = 0;
                    rolled1 = true;
                } else if (pair.getDie1() == 1 || pair.getDie2() ==1) {
                    System.out.println("You rolled a 1 and lost your points from this round!");
                    round = 0;
                    doThing = "p";
                    rolled1 = true;
                } else {
                    round += (pair.getDie1() + pair.getDie2());
                }
                if (!rolled1) {
                    System.out.println("What do you want to do:");
                    doThing = input.next();
                }
            }
            pScore += round;
            
            doThing = "c";
            round = 0;
            while (!doThing.equals("p")) {
                boolean rolled1 = false;
                pair.roll();
                System.out.println("Computer rolled " + pair.getDie1() + " and " + pair.getDie2());
                if (pair.getDie1() == 1 && pair.getDie2() ==1) {
                    System.out.println("The coputer lost all its points!");
                    cScore = 0;
                    doThing = "p";
                    round = 0;
                    rolled1 = true;
                } else if (pair.getDie1() == 1 || pair.getDie2() ==1) {
                    System.out.println("The computer rolled a 1 and lost its points from this round!");
                    round = 0;
                    doThing = "p";
                    rolled1 = true;
                } else {
                    round += (pair.getDie1() + pair.getDie2());
                }
                if (!rolled1) {
                    if (round >= 20) doThing = "p";
                }
            }
            cScore += round;
            System.out.println("Scores-\n\tYou: " + pScore + "\n\tComputer: " + cScore);
        }
        
        if (cScore >= 100) {
            System.out.println("The computer wins.");
        } else {
            System.out.println("You win!");
        }
    }
}