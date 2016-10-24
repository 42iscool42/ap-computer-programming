// ****************************************************************
// LoveCS.java
//
// Use a while loop to print many messages declaring your
// passion for computer science
// ****************************************************************
import java.util.Scanner;

public class LoveCS
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        int limit = -1;
        while (limit < 0) {
            System.out.println("How many times would you like to run the loop: ");
            limit = input.nextInt();
        }
        int count = 1;
        while (count <= limit){
            System.out.println(count + " I love Computer Science!!");
            count++;
        }
        System.out.println("Message printed " + limit + " times. The sum from 1 to " + limit + " is " + ((limit * (limit+1))/2));
    }
}