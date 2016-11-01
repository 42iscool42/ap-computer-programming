import java.util.Scanner;

public class BeerBottles {
    public static void main(String[] rushabhCantUseSwitchStatements) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number greater than 0 less than or equal to 100: ");
        int in = 0;
        do {
            in = input.nextInt();
            if (in < 0 || in > 100) System.out.print("Enter a number greater than 0 less than or equal to 100: "); 
        } while (in < 0 || in > 100);
        
        for (int i = 100; i > 100 - in; i--) {
            System.out.println(i + " bottles of beer on the wall\n" + i + " bottles of beer\nIf one of those bottles should happen to fall\n" + (i-1) + " bottles of beer on the wall");
        }
    }
}