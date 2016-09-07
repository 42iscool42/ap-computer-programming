import java.util.Scanner;

public class InfoPrint {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your birthday: ");
        String bday  = input.nextLine();
        
        System.out.print("Enter your hobbies in a comma separated list: ");
        String hobbies = input.nextLine();
        
        System.out.print("Enter your favorite book: ");
        String book = input.nextLine();
        
        System.out.print("Enter your favorite movie: ");
        String movie = input.nextLine();
        
        System.out.println();
        System.out.println("Your birthday is " + bday);
        System.out.println("Your hobbies are " + hobbies);
        System.out.println("Your favorite book is " + book);
        System.out.println("Your favorite movie is " + movie);
        System.out.println();
        System.out.println("Thank you for using this Nate Inc. program");
    }
}