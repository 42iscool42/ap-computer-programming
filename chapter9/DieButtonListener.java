import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DieButtonListener extends MouseAdapter {
	Die die;
	Yahtzee yahtzee;
	public DieButtonListener(Die die, Yahtzee yahtzee) {
		this.die = die;
		this.yahtzee = yahtzee;
	}
	public void mouseClicked(MouseEvent event) {
		yahtzee.removeDie(die);
	}
}