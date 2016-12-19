import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WriteTest {
    public static void main(String[] args) throws FileNotFoundException {
        TestQuestion[] qs;
        Scanner input = new Scanner(new File("testbank.dat"));
        
        int length = Integer.parseInt(input.nextLine());
        qs = new TestQuestion[length];
        for (int i = 0; i < qs.length; i++) {
            String type = input.nextLine();
            if (type.equalsIgnoreCase("e")) {
                Essay essay = new Essay();
                essay.readQuestion(input);
                qs[i] = essay;
            } else {
                MultiChoice mc = new MultiChoice();
                mc.readQuestion(input);
                qs[i] = mc;
            }
        }
        
        for (TestQuestion q : qs) {
            System.out.println(q);
        }
    }
}