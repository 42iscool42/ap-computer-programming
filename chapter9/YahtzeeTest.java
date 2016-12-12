import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class YahtzeeTest {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Yahtzee!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		JPanel inPlay, buttonHolder, outOfPlay;
		inPlay = new JPanel();
		buttonHolder = new JPanel();
		outOfPlay = new JPanel();
		container.add(inPlay);
		container.add(buttonHolder);
		container.add(outOfPlay);
		frame.getContentPane().add(container);
		
		Yahtzee yahtzee = new Yahtzee(inPlay, buttonHolder, outOfPlay);
		
		frame.setSize(new Dimension(800, 300));
		frame.setVisible(true);
    }
}