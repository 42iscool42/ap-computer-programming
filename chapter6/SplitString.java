import java.util.Scanner;

public class SplitString {
    public static void main(String rushabhIsALiar[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String in = input.nextLine();
        for ( int i = 0; i < in.length(); i++) {
            System.out.println(in.charAt(i));
        }
    }
}