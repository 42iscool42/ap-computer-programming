public class Die {
    int num;
    public Die() {
        roll();
    }
    
    public void roll() {
        num = (int)(6 * Math.random()) + 1;
    }
    
    public int getRoll() {
        return num;
    }
    
    public String toString() {
        return String.valueOf(num);
    }
}