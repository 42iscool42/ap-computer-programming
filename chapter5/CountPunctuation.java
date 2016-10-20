import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class CountPunctuation {
    private static final String punctuation = "!,./?'\";:<>()&";
    
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ArrayList<String> chars = new ArrayList<String>();
        ArrayList<Integer> count = new ArrayList<Integer>();
        
        int i = 0;
        while (i < punctuation.length()) {
            chars.add(String.valueOf(punctuation.charAt(i)));
            i++;
        }
        
        System.out.print("Enter the name of the file you wish to search: ");
        Scanner file = new Scanner(new File(input.nextLine()));
        
        String fileContents = "";
        while (file.hasNext()) {
            fileContents += file.nextLine();
        }
        
        i = 0;
        while (i < chars.size()) {
            count.add(  fileContents.length() - fileContents.replaceAll("\\" + chars.get(i), "").length()  );
            i++;
        }
        
        i = 0;
        System.out.println("Appearance of punctuation marks:");
        while (i < chars.size()) {
            System.out.printf("\t%s: %s\n", chars.get(i), count.get(i));
            i++;
        }
    }
}