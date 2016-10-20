import java.util.Scanner;

public class PalindromeTest {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^\\w]", "").toLowerCase();
        int i = 0;
        boolean isPalindrome = true;
        while (i < s.length() / 2) {
            isPalindrome = isPalindrome && (s.charAt(i) == s.charAt(s.length() - i - 1));
            i++;
        }
        return isPalindrome;
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String in = input.nextLine();
        
        if (isPalindrome(in)) {
            System.out.println("'" + in + "' is a palindrome");
        } else {
            System.out.println("'" + in + "' is not a palindrome");
        }
    }
}