import java.util.Scanner;

public class NumDigits {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String in = Integer.toString(input.nextInt());
        int i = 0;
        int odd = 0;
        int even = 0;
        int zero = 0;
        while (i < in.length()) {
            if ("0".indexOf(in.charAt(i)) >= 0) {
                zero++;
            } else if ("13579".indexOf(in.charAt(i)) >= 0) {
                odd++;
            } else if ("23468".indexOf(in.charAt(i)) >= 0) {
                even++;
            }
            i++;
        }
        System.out.printf("%d zeros, %d odds, %d evens", zero, odd, even);
    }
}