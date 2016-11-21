import java.util.Scanner;

public class IntRead {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] occur = new int[51];
        int in = 0;
        while (in >= -25 && in <= 25) {
            System.out.print("Enter a number between -25 and 25: ");
            in = input.nextInt();
            if (in < -25 || in > 25) break;
            occur[in+25]++;
        }
        
        for (int i = 0; i < occur.length; i++) {
            System.out.print(i-25 + ": " + occur[i] + "\t");
            if ((i+1)%5 == 0) System.out.println();
        }
    }
}