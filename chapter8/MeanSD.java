import java.util.Scanner;

public class MeanSD {
    public static void main(String[] args) {
        int[] input = {2, 4, 7, 12, 4, 15, 1, 23};
        System.out.println("Mean: " + mean(input));
        System.out.println("Standard Deviation: " + standardDeviation(input));
    }
    
    public static double mean(int[] ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        
        return (double) sum / ints.length;
    }
    
    public static double standardDeviation(int[] ints) {
        double mean = mean(ints);
        double sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += Math.pow(((double)(ints[i]) - mean), 2);
        }
        sum /= ints.length;
        return Math.sqrt(sum);
    }
}