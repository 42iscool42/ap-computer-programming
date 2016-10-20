import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class GolfScores {
    public static void main(String[] args) throws IOException{
        ArrayList<Integer> totals = new ArrayList<Integer>();
        
        Scanner input = new Scanner(new File("golf.txt"));
        
        int par = 0;
        int t1 = 0;
        int t2 = 0;
        int t3 = 0;
        int t4 = 0;
        
        while (input.hasNext()) {
            String line = input.nextLine();
            String[] pieces = line.split(" ");
            par += Integer.parseInt(pieces[0]);
            t1 += Integer.parseInt(pieces[1]);
            t2 += Integer.parseInt(pieces[2]);
            t3 += Integer.parseInt(pieces[3]);
            t4 += Integer.parseInt(pieces[4]);
        }
        
        totals.add(par);
        totals.add(t1);
        totals.add(t2);
        totals.add(t3);
        totals.add(t4);
        
        int i = 1;
        int minStrokes = totals.get(1);
        int minPlayer = 1;
        while (i < totals.size()) {
            if (totals.get(i) < minStrokes) {
                minStrokes = totals.get(i);
                minPlayer = i;
            }
            i++;
        }
        System.out.println("Player " + minPlayer + " wins with " + minStrokes + " strokes");
        System.out.println("Scores compared to par:");
        System.out.println("P1\tP2\tP3\tP4");
        System.out.println((totals.get(1)-totals.get(0)) +"\t" + (totals.get(2)-totals.get(0)) +"\t" +(totals.get(3)-totals.get(0)) +"\t" + (totals.get(4)-totals.get(0)));
    }
}