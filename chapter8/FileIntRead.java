import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileIntRead {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("ints.txt"));
        int[] freq = new int[10];
        while (input.hasNextInt()) {
            int i = input.nextInt();
            if (!(i > 0 && i < 101)) break;
            freq[(i-1)/10]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (i == 0) System.out.print(" ");
            System.out.print((i*10 + 1) + " - " + ((i+1) * 10));
            if (i < freq.length-1) System.out.print(" ");
            System.out.print(" | ");
            for (int j = 0; j < freq[i] / 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}