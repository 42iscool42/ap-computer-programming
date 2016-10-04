package chapter4;

public class PairOfDice {
	private Die die1, die2;
	
	public PairOfDice() {
		die1 = new Die();
		die2 = new Die();
	}
	
	public int getDie1() {
		return die1.getFaceValue();
	}
	
	public void setDie1(int faceValue) {
		die1.setFaceValue(faceValue);
	}
	
	public int getDie2() {
		return die2.getFaceValue();
	}
	
	public void setDie2(int faceValue) {
		die2.setFaceValue(faceValue);
	}
	
	public void roll() {
		die1.roll();
		die2.roll();
	}	
	
	public int sum() {
		return die1.getFaceValue() + die2.getFaceValue();
	}
	
	private class Die {
		private int faceValue;
		private final int MAX = 6;
		
		public Die() {
			faceValue = 1;
		}
		
		public Die(int faceValue) {
			this.faceValue = faceValue;
		}
		
		public int roll() {
			faceValue = (int) (Math.random() * MAX) + 1;
			return faceValue;
		}
		
		public void setFaceValue(int faceValue) {
			this.faceValue = faceValue;
		}
		
		public int getFaceValue() {
			return faceValue;
		}
		
		public String toString() {
			return Integer.toString(faceValue);
		}
	}
}

