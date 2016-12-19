import java.util.Scanner;

public class Essay extends TestQuestion {
    private int blankLines;
    
    public void readQuestion(Scanner input) {
        blankLines = Integer.parseInt(input.nextLine());
        question = input.nextLine();
    }
    
    public String toString() {
        String value = question + "\n";
        for (int i = 0; i < blankLines; i ++) {
            value += "\n";
        }
        return value;
    }
}