import java.util.Scanner;

public class ChangeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the money to make change for: ");
        double money = scanner.nextDouble();
        double[] billsAvailable = {10.0, 5.0, 1.0, 0.25, 0.10, 0.05, 0.01};
        int[] change = getChange(money, billsAvailable);
        System.out.println(change[0] + " ten" + (change[0] == 1 ? "" : "s"));
        System.out.println(change[1] + " five" + (change[1] == 1 ? "" : "s"));
        System.out.println(change[2] + " one" + (change[2] == 1 ? "" : "s"));
        System.out.println(change[3] + " quarter" + (change[3] == 1 ? "" : "s"));
        System.out.println(change[4] + " dime" + (change[4] == 1 ? "" : "s"));
        System.out.println(change[5] + " nickel" + (change[5] == 1 ? "" : "s"));
        System.out.println(change[6] + " penn" + (change[0] == 1 ? "y" : "ies"));
    }
    
    public static int[] getChange(double money, double[] amounts) { //Amounts should be ordered highest to lowest
        int[] change = new int[amounts.length];
        for (int i = 0; i < amounts.length; i++) {
            change[i] = (int)(money / amounts[i]);
            money -= amounts[i] * change[i];
        }
        return change;
        
    }
}