public class Compare3 {
    public static Comparable largest(Comparable c1, Comparable c2, Comparable c3) {
        Comparable largest = c1;
        
        if (c2.compareTo(largest) > 0) largest = c2;
        if (c3.compareTo(largest) > 0) largest = c3;
        
        return largest;
    }
}