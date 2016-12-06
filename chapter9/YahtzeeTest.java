import java.util.Scanner;

public class YahtzeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Yahtzee yahtzee = new Yahtzee();
        yahtzee.roll();
        System.out.println(yahtzee);
        int[] remove = {1,2,3,4,5};
        yahtzee.remove(remove);
        System.out.println(yahtzee);
        yahtzee.scoreRound();
    }
}