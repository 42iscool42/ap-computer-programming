import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ScoreButtonListener extends MouseAdapter {
	Yahtzee yahtzee;
	public void ScoreButtonListener(Yahtzee yahtzee) {
		this.yahtzee = yahtzee;
	}
	public void mouseClicked(MouseEvent event) {
		yahtzee.scoreRound();
	}
}