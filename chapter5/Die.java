public class Die {
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
	    if (faceValue <= MAX && faceValue >0) { 
    		this.faceValue = faceValue;
	    }
	}
	
	public int getFaceValue() {
		return faceValue;
	}
	
	public String toString() {
		return Integer.toString(faceValue);
	}
}