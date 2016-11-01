import java.util.Scanner;

public class CountVowel {
    public static void main(String[] tuMadreEsUnaPuta) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int a = 0, e = 0, i = 0, o = 0, u = 0, other = 0;
        for (int j = 0; j < s.length(); j++) {
            switch (s.toLowerCase().charAt(j)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    other++;
                    break;
            }
        }
        System.out.printf("A: %d\nE: %d\nI: %d\nO: %d\nU: %d\nOther: %d\n", a, e, i, o, u, other);
    }
}