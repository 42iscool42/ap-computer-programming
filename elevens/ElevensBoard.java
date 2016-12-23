package apcomputerprogramming.elevens;

import java.util.List;
import java.util.ArrayList;

public class ElevensBoard extends Board {
	 private static final int BOARD_SIZE = 9;
	  private static final String[] RANKS = { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };
	  private static final String[] SUITS = { "spades", "hearts", "diamonds", "clubs" };
	  private static final int[] POINT_VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0 };
	  
	  public ElevensBoard()
	  {
	    super(9, RANKS, SUITS, POINT_VALUES);
	  }
	  
	  public boolean isLegal(List<Integer> paramList)
	  {
	    if (paramList.size() < 2) {
	      return false;
	    }
	    if (paramList.size() > 3) {
	      return false;
	    }
	    if (paramList.size() == 2)
	    {
	      int i = ((Integer)paramList.get(0)).intValue();
	      int j = ((Integer)paramList.get(1)).intValue();
	      return cardAt(i).pointValue() + cardAt(j).pointValue() == 11;
	    }
	    return findJQK(paramList).size() > 0;
	  }
	  
	  public boolean anotherPlayIsPossible()
	  {
	    return (findPairSum11().size() > 0) || (findJQK().size() > 0);
	  }
	  
	  public ArrayList<Integer> findPairSum11()
	  {
	  	ArrayList<Integer> indexes = new ArrayList<Integer>();
	    for (int i = 0; i < 9; i++) {
	      if (cardAt(i) != null) {
	        for (int j = i + 1; j < 9; j++) {
	          if ((cardAt(j) != null) && (cardAt(i).pointValue() + cardAt(j).pointValue() == 11)) {
	            indexes.add(new Integer(i));
	            indexes.add(new Integer(j));
	            return indexes;
	          }
	        }
	      }
	    }
	    return indexes;
	  }
	  
	  public ArrayList<Integer> findJQK()
	  {
	    ArrayList localArrayList = new ArrayList();
	    for (int i = 0; i < 9; i++) {
	      if (cardAt(i) != null) {
	        localArrayList.add(new Integer(i));
	      }
	    }
	    return findJQK(localArrayList);
	  }
	  
	  public ArrayList<Integer> findJQK(List<Integer> paramList)
	  {
	  	ArrayList<Integer> indexes = new ArrayList<Integer>();
	    int i = -1;
	    int j = -1;
	    int k = -1;
	    for (int n = 0; n < paramList.size(); n++)
	    {
	    
	      int m = paramList.get(n).intValue();
	      if (cardAt(m).rank().equals("jack")) {
	        i = m;
	      } else if (cardAt(m).rank().equals("queen")) {
	        j = m;
	      } else if (cardAt(m).rank().equals("king")) {
	        k = m;
	      }
	    }
	    if ((i > -1) && (j > -1) && (k > -1)) {
	    	indexes.add(i);
	    	indexes.add(j);
	    	indexes.add(k);
	    }
	    return indexes;
	  }
	  
	  public void processPairSum11()
	  {
	    ArrayList localArrayList = new ArrayList();
	    for (int i = 0; i < 9; i++) {
	      if (cardAt(i) != null) {
	        for (int j = i + 1; j < 9; j++) {
	          if ((cardAt(j) != null) && 
	            (cardAt(i).pointValue() + cardAt(j).pointValue() == 11))
	          {
	            localArrayList.add(new Integer(i));
	            localArrayList.add(new Integer(j));
	            replaceSelectedCards(localArrayList);
	            return;
	          }
	        }
	      }
	    }
	  }
	  
	  public void processJQK()
	  {
	    int i = -1;
	    int j = -1;
	    int k = -1;
	    for (int m = 0; m < 9; m++) {
	      if (cardAt(m) != null) {
	        if (cardAt(m).rank().equals("jack")) {
	          i = m;
	        } else if (cardAt(m).rank().equals("queen")) {
	          j = m;
	        } else if (cardAt(m).rank().equals("king")) {
	          k = m;
	        }
	      }
	    }
	    ArrayList localArrayList = new ArrayList();
	    localArrayList.add(new Integer(i));
	    localArrayList.add(new Integer(j));
	    localArrayList.add(new Integer(k));
	    replaceSelectedCards(localArrayList);
	  }
	  
	  public boolean playIfPossible() {
	  		if (playPairSum11IfPossible()) {
	  			return true;
	  		} else if (playJQKIfPossible()) {
	  			return true;
	  		} 
	  		return false;
	  }
	  
	  private boolean playPairSum11IfPossible() {
	  	ArrayList<Integer> indexes = findPairSum11();
	  	if (indexes.size() > 0) {
	  		replaceSelectedCards(indexes);
	  		return true;
	  	}
	  	return false;
	  }
	  
	  private boolean playJQKIfPossible() {
	  	ArrayList<Integer> indexes = findJQK();
	  	if (indexes.size() > 0) {
	  		replaceSelectedCards(indexes);
	  		return true;
	  	}
	  	return false;
	  }
}
