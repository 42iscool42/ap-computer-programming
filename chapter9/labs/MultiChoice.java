import java.util.Scanner;

public class MultiChoice extends TestQuestion {
    private String[] choices;
    
    public void readQuestion(Scanner input) {
        int length = Integer.parseInt(input.nextLine());
        choices = new String[length];
        question = input.nextLine();
        for (int i = 0; i < choices.length; i++) {
            String choice = input.nextLine();
            choices[i] = choice;
        }
    }
    
    public String toString() {
        String value = question + "\n";
        for (String i : choices) {
            value += (i + "\n");
        }
        return value;
    }
}