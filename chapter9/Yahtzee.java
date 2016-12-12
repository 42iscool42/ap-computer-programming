// This class was made to show Sherman how to make Dice Games

import java.util.HashMap; //Woot
import java.util.Iterator;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Yahtzee {
    Die[] dice;
    int inPlayNum;
    int score;
    Multiset<Integer> removed;
    HashMap<String, Integer> scoring;
	ArrayList<String> used;
	JPanel inPlay, outOfPlay, buttonHolder;
	JButton scoreButton, rollButton;
	ArrayList<Integer> inPlayDice;
	DieButton[] dieButtons;
	JLabel scoreLabel;
	int[] removeNums;
    
    public Yahtzee(JPanel inPlay, JPanel outOfPlay, JPanel buttonHolder) {
		this.inPlay = inPlay;
		this.outOfPlay = outOfPlay;
		this.buttonHolder = buttonHolder;
		used = new ArrayList<String>();
        score = 0;
        resetRound();
    }
    
    public void resetRound() {
		inPlay.removeAll();
		buttonHolder.removeAll();
		outOfPlay.removeAll();
        removed = new Multiset<Integer>();
		removeNums = new int[0];
		scoring = new HashMap<String, Integer>();
		dice = new Die[5];
		dieButtons = new DieButton[5];
        for (int i =0; i < dice.length; i++) {
            dice[i] = new Die();
			inPlay.add(dice[i]);
			dieButtons[i] = new DieButton(i);
			dieButtons[i].addMouseListener(new DieButtonListener(dice[i], this));
			buttonHolder.add(dieButtons[i]);
        }
		scoreButton = new JButton("Score Round");
		scoreButton.addMouseListener(new ScoreButtonListener(this));
		buttonHolder.add(scoreButton);
		rollButton = new JButton("Roll");
		rollButton.addMouseListener(new RollButtonListener(rollButton, this));
		buttonHolder.add(rollButton);
        inPlayNum = 5;
        removed = new Multiset<Integer>();
		buttonHolder.repaint();
		inPlay.repaint();
		outOfPlay.repaint();
		outOfPlay.getParent().repaint();
		scoreLabel = new JLabel("Score: " + score);
		buttonHolder.add(scoreLabel);
		inPlayDice = new ArrayList<Integer>();
		inPlayDice.add(0);
		inPlayDice.add(1);
		inPlayDice.add(2);
		inPlayDice.add(3);
		inPlayDice.add(4);
		inPlayDice.add(5);
    }
    
    public void roll() {
        for (int i = 0; i < dice.length; i++)
            if (inPlayDice.contains(i)) dice[i].roll();
    }
	
	public void removeDie(Die die) {
		for (int i =0; i < dice.length; i++) {
			if (dice[i].equals(die) && dice[i].getParent().equals(inPlay)) {
				inPlay.remove(dice[i]);
				outOfPlay.add(dice[i]);
				buttonHolder.remove(dieButtons[i]);
				inPlayDice.remove((Integer)i);
			}
		}
		removed.add(die.getRoll());
		inPlayNum--;
		buttonHolder.repaint();
		inPlay.repaint();
		outOfPlay.repaint();
	}
    
	public Die getDie(int i) {
		return dice[i];
	}
	
    public int[] sort(int[] a) {
        int[] sorted = new int[a.length];
        for (int i =0; i < a.length; i++) {
            int insert = 0;
            count:for (insert = 0; insert <= i-1; insert++)
                if (sorted[insert] < a[i]) break count;
            
            int temp = a[i];
            for(int k = insert; k <= i; k++){
                int old = sorted[k];
                sorted[k] = temp;
                temp = old;
            }
            
        }
        return sorted;
    }
    
    public int getScore() {
        return score;
    }
    
    public int score() {
        return score;
    }
    
    public void scoreRound() {
		if (inPlayNum > 0) return;

        HashMap<String, Integer> options = new HashMap<String, Integer>();
        for (int i = 1; i <= 6; i++) {
            if (removed.multiplicity(i) == 5) {
                options.put("Yahtzee", 50);
            } else if (removed.multiplicity(i) == 4) {
                int sum = i *4;
                for (int j : removed) {
                    if (j != i) sum += j;
                }
                options.put("Four of a Kind", sum);
            } else if (removed.multiplicity(i) == 3) {
                int sum = i *3;
                int other = 0;
                boolean fullHouse = false;
                for (int j : removed) {
                    if (j != i) {
                        if (j == other)
                            fullHouse = true;
                        sum += j;
                        other = j;
                    }
                }
				if (!used.contains("Three of a Kind"))
					options.put("Three of a Kind", sum);
				
                if (fullHouse && !used.contains("Full House"))
                    options.put("Full House", 25);
            }
        }
        if (!used.contains("Large Straight") && (removed.multiplicity(1) == 1 || removed.multiplicity(6) ==1) && (removed.multiplicity(2) == 1 && removed.multiplicity(3) == 1 && removed.multiplicity(4) == 1 && removed.multiplicity(5) == 1 ) ) {
            options.put("Large Straight", 40);
        }
        if (!used.contains("Small Straight") && (removed.multiplicity(3) >= 1 && removed.multiplicity(4) >= 1) && ( (removed.multiplicity(1) >= 1 && removed.multiplicity(2) >= 1) || (removed.multiplicity(2) >= 0 && removed.multiplicity(5) >= 0) || (removed.multiplicity(5) >= 0 && removed.multiplicity(6) >= 0 ))) {
            options.put("Small Straight", 30);
        }
        if (!used.contains("Aces") && removed.multiplicity(1) > 0) {
            options.put("Aces", removed.multiplicity(1));
        }
        if (!used.contains("Twos") && removed.multiplicity(2) > 0 ) {
            options.put("Twos", removed.multiplicity(2) * 2);
        }
        if (!used.contains("Threes") && removed.multiplicity(3) > 0) {
            options.put("Threes", removed.multiplicity(3) * 3);
        }
        if (!used.contains("Fours") && removed.multiplicity(4) > 0) {
            options.put("Fours", removed.multiplicity(4) * 4);
        }
        if (!used.contains("Fives") && removed.multiplicity(5) > 0) {
            options.put("Fives", removed.multiplicity(5) * 5);
        }
        if (!used.contains("Sixes") && removed.multiplicity(6) > 0) {
            options.put("Sixes", removed.multiplicity(6) * 6);
        }
        int chance = 0;
        for (int i : removed)
            chance += i;
        if(!used.contains("Chance"))
			options.put("Chance", chance);
        
		String message = "";
        for (String key : options.keySet()) {
            message = message + key + ", Score: " + options.get(key) + "\n";
        }
		String response = "";
		do {
			response = JOptionPane.showInputDialog(null, message, "Pick an Option", JOptionPane.INFORMATION_MESSAGE);
		} while (!options.containsKey(response));
		score += options.get(response);
		used.add(response);
		resetRound();
    }
    
    public String toString() {
        String string = "Unused: ";
        for (int i = 0; i < inPlayNum; i++) {
            string += (dice[i] + " ");
        }
        string += "\nRemoved: " + removed.toString();
        return string;
    }
    
    public int diceLeft() {
		return inPlayNum;
	}
	public class ScoreButtonListener extends MouseAdapter {
		Yahtzee yahtzee;
		public ScoreButtonListener(Yahtzee yahtzee) {
			this.yahtzee = yahtzee;
		}
		public void mouseClicked(MouseEvent event) {
			yahtzee.scoreRound();
		}
	}
	
	public class RollButtonListener extends MouseAdapter {
		int rolls;
		JButton butt;
		Yahtzee yahtzee;
		public RollButtonListener(JButton butt, Yahtzee yahtzee) {
			this.butt = butt;
			rolls = 1;
			this.yahtzee = yahtzee;
		}
		
		public void mouseClicked(MouseEvent event) {
			rolls++;
			if (rolls <= 3) {
				yahtzee.roll();
			}
			if (rolls > 2) {
				butt.setEnabled(false);
			}
		}
	}
}

