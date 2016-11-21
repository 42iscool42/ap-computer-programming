import java.util.ArrayList;

public class MultisetTest {
    public static void main(String[] args) {
        Integer[] array1 = {1,8,4,9,4,2};
        Multiset<Integer> set1 = new Multiset<Integer>(array1);
        System.out.println(set1);
        set1.remove(4);
        set1.remove(8);
        System.out.println(set1);
        Integer[] array2 = {4, 9, 2, 1};
        Multiset<Integer> set2 = new Multiset<Integer>(array2);
        System.out.println(set2);
        System.out.println(set1.equals(set2));
        
    }
}