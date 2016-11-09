import java.util.Scanner;
public class Compare {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three strings: ");
        System.out.println("Largest: " + Compare3.largest(input.nextLine(), input.nextLine(), input.nextLine()));
        
        System.out.print("Enter three integers: ");
        System.out.println("Largest: " + Compare3.largest(input.nextInt(), input.nextInt(), input.nextInt()));
    }
}