import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class FindInts {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the filename to find integers in: ");
        Scanner file = new Scanner(new File(input.nextLine()));
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        while (file.hasNext()) {
            String line = file.nextLine();
            int i = 0;
            String cur = "";
            while (i < line.length()) {
                String c = String.valueOf(line.charAt(i));
                if ("0123456789".indexOf(c) >= 0) {
                    cur += c;
                    if (i == line.length() - 1) {
                        nums.add(Integer.parseInt(cur));
                        cur = "";
                    }
                } else if (cur.length() > 0) {
                    nums.add(Integer.parseInt(cur));
                    cur = "";
                }
                i++;
            }
        }
        
        System.out.println("Number of numbers found: " + nums.size());
        int i = 0;
        while (i < nums.size()) {
            System.out.println(nums.get(i));
            i++;
        }
    }
}