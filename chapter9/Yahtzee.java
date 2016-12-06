// This class was made to show Sherman how to make Dice Games

import java.util.HashMap; //Woot
import java.util.Iterator;

public class Yahtzee {
    Die[] dice;
    int inPlay;
    int score;
    Multiset<Integer> removed;
    HashMap<String, Integer> scoring;
    
    public Yahtzee() {
        dice = new Die[5];
        for (int i =0; i < dice.length; i++) {
            dice[i] = new Die();
        }
        inPlay = 5;
        score = 0;
        removed = new Multiset<Integer>();
    }
    
    public void resetRound() {
        removed = new Multiset<Integer>();
    }
    
    public void roll() {
        for (int i = 0; i < inPlay; i++)
            dice[i].roll();
    }
    
    public void remove(int[] dies) {
        dies = sort(dies);
        Multiset<Integer> used = new Multiset<Integer>();
        for (int i : dies) {
            if (!used.contains(i)) {
                removed.add(dice[i-1].getRoll());
                for (int j = i; j < inPlay-1; j++)
                    dice[j-1] = dice[j];
                used.add(i);
            }
        }
        inPlay -= used.size();
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
    
    public int scoreGame() {
        return score;
    }
    
    public void scoreRound() {
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
                options.put("Three of a Kind", sum);
                if (fullHouse)
                    options.put("Full House", 25);
            }
        }
        if ((removed.multiplicity(1) == 1 || removed.multiplicity(6) ==1) && (removed.multiplicity(2) == 1 && removed.multiplicity(3) == 1 && removed.multiplicity(4) == 1 && removed.multiplicity(5) == 1 ) ) {
            options.put("Large Straight", 40);
        }
        if ((removed.multiplicity(3) >= 1 && removed.multiplicity(4) >= 1) && ( (removed.multiplicity(1) >= 1 && removed.multiplicity(2) >= 1) || (removed.multiplicity(2) >= 0 && removed.multiplicity(5) >= 0) || (removed.multiplicity(5) >= 0 && removed.multiplicity(6) >= 0 ))) {
            options.put("Small Straight", 30);
        }
        if (removed.multiplicity(1) > 0) {
            options.put("Aces", removed.multiplicity(1));
        }
        if (removed.multiplicity(2) > 0 ) {
            options.put("Twos", removed.multiplicity(2) * 2);
        }
        if (removed.multiplicity(3) > 0) {
            options.put("Threes", removed.multiplicity(3) * 3);
        }
        if (removed.multiplicity(4) > 0) {
            options.put("Fours", removed.multiplicity(4) * 4);
        }
        if (removed.multiplicity(5) > 0) {
            options.put("Fives", removed.multiplicity(5) * 5);
        }
        if (removed.multiplicity(6) > 0) {
            options.put("Sixes", removed.multiplicity(6) * 6);
        }
        int chance = 0;
        for (int i : removed)
            chance += i;
        options.put("Chance", chance);
        
        int opNum = 1;
        for (String key : options.keySet()) {
            System.out.println(opNum + " " + key + " Score: " + options.get(key));
            opNum ++;
        }
    }
    
    public String toString() {
        String string = "Unused: ";
        for (int i = 0; i < inPlay; i++) {
            string += (dice[i] + " ");
        }
        string += "\nRemoved: " + removed.toString();
        return string;
    }
    
    public int diceLeft() {
        return inPlay;
    }
}