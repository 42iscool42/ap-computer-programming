import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class CompareFile {
    public static void main(String[] args) throws IOException {
        ArrayList<String> file1 = new ArrayList<String>();
        ArrayList<String> file2 = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter file1 name: ");
        Scanner in1 = new Scanner(new File(input.nextLine()));
        System.out.println("Enter file2 name: ");
        Scanner in2 = new Scanner(new File(input.nextLine()));
        
        while (in1.hasNext()) {
            file1.add(in1.nextLine());
        }
        
        while (in2.hasNext()) {
            file2.add(in2.nextLine());
        }
        
        int i = 0;
        if (file1.size() > file2.size()) {
            while (i < file1.size()) {
                if (i < file2.size()) {
                    if (!file1.get(i).equals(file2.get(i))) {
                        System.out.println(file1.get(i));
                        System.out.println(file2.get(i));
                        System.out.println();
                    }
                } else {
                    System.out.println(file1.get(i));
                }
                i++;
            }
        } else {
            while (i < file2.size()) {
                if (i < file2.size()) {
                    if (!file1.get(i).equals(file2.get(i))) {
                        System.out.println(file1.get(i));
                        System.out.println(file2.get(i));
                        System.out.println();
                    }
                } else {
                    System.out.println(file2.get(i));
                }
                i++;
            }
        }
    }
}