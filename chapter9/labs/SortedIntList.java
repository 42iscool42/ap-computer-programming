public class SortedIntList extends IntList {
    public SortedIntList(int size) {
        super(size);
    }
    
    public void add(int value) {
        super.add(value);
        sort();
    }
    
    public void sort() {
        int[] temp = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            temp[i] = list[i];
        }
        temp = mergeSort(temp);
        for (int i = 0; i < numElements; i++) {
            list[i] = temp[i];
        }        
    }
    
    private static int[] mergeSort(int[] a) {
        if (a.length == 1) return a;
        
        int[] a1 = new int[a.length/2];
        int[] a2 = new int[a.length - a.length/2];
        
        for (int i =0; i < a.length/2; i++) {
            a1[i] = a[i];
            a2[i] = a[i + a.length/2];
        }
        a2[a2.length-1] = a[a.length-1];
        a1 = mergeSort(a1);
        a2 = mergeSort(a2);
        
        return merge(a1, a2);
    }
    
    private static int[] merge(int[] a, int[] b) {
        int aIndex = 0;
        int bIndex = 0;
        int index = 0;
        int[] sorted = new int[a.length + b.length];
        while (aIndex < a.length || bIndex < b.length) {
            if (aIndex == a.length) {
                sorted[index] = b[bIndex];
                index++;
                bIndex++;
            } else if (bIndex == b.length) {
                sorted[index] = a[aIndex];
                index++;
                aIndex++;
            } else if (a[aIndex] < b[bIndex]) {
                sorted[index] = a[aIndex];
                index++;
                aIndex++;
            } else {
                sorted[index] = b[bIndex];
                index++;
                bIndex++;
            }
        }
        return sorted;
    }
    
}