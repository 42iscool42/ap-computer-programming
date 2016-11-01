import java.util.Scanner;

public class SumEven {
    public static void main(String[] rushabhSucksEggs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number greater than 2: ");
        int in = 0; 
        do {
            in = input.nextInt();
            if (in <2) System.out.println("Enter a number greater than 2: ");
        } while (in < 2);
        int sum = 0;
        for (int i = 2; i <= in; i+=2) {
            sum += i;
        }
        System.out.println("The sum of all even numbers up to " + in +": " + sum);
        
    }
}