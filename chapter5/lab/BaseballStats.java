// ****************************************************************
// BaseballStats.java
//
// Reads baseball data in from a comma delimited file. Each line
// of the file contains a name followed by a list of symbols
// indicating the result of each at bat: h for hit, o for out,
// w for walk, s for sacrifice. Statistics are computed and
// printed for each player.
// ****************************************************************
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

public class BaseballStats {
    
    //-------------------------------------------------
    // Reads baseball stats from a file and counts
    // total hits, outs, walks, and sacrifice flies
    // for each player.
    //-------------------------------------------------
    public static void main (String[] args) throws IOException {
        Scanner fileScan, lineScan;
        String fileName;
        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the name of the input file: ");
        fileName = scan.nextLine();
        fileScan = new Scanner(new File(fileName));
        // Read and process each line of the file
        while (fileScan.hasNextLine()) {
            ArrayList<String> data = new ArrayList<String>(Arrays.asList(fileScan.nextLine().split(",")));
            String name = data.get(0);
            int outs = 0;
            int hits = 0;
            int sacrifices = 0;
            int walks = 0;
            int i = 1;
            while (i < data.size()) {
                String stat = data.get(i);
                if (stat.equals("o")) {
                    outs++;
                } else if (stat.equals("h")) {
                    hits++;
                } else if (stat.equals("s")) {
                    sacrifices++;
                } else if (stat.equals("w")) {
                    walks++;
                }
                i++;
            }
            System.out.printf("Player: %s\n\tHits: %d\n\tOuts: %d\n\tWalks: %d\n\tSacrifices: %d\n\tBatting Average: %f\n", name, hits, outs, walks, sacrifices, (double) hits / (hits + outs) );
        }
    }
}