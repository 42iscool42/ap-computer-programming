import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Random ran = new Random();
        int die1 = ran.nextInt(6) + 1;
        int die2 = ran.nextInt(6) + 1;
        
        System.out.printf("Roll 1: %d\nRoll 2: %d\nSum: %d\n", die1, die2, die1 + die2);
    }
}