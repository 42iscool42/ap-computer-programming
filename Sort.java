public class Sort {
    public static int[] mergeSort(int[] a) {
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
    
    public static int[] merge(int[] a, int[] b) {
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
    
    public static int[] insertionSort(int[] a) {
        int[] sorted = new int[a.length];
        for (int i =0; i < a.length; i++) {
            int insert = 0;
            count:for (insert = 0; insert <= i-1; insert++)
                if (sorted[insert] > a[i]) break count;
            
            int temp = a[i];
            for(int k = insert; k <= i; k++){
                int old = sorted[k];
                sorted[k] = temp;
                temp = old;
            }
            
        }
        return sorted;
    }
    
    public static int[] quickSort(int[] a) {
        if (a.length <= 4) return insertionSort(a);
        int partInd = a.length/2;
        int partition = a[partInd];
        int bLength = 0;
        while (bLength <= 0) {
            for (int i : a)
                if (i < partition) bLength ++;
            if (bLength ==0) {
                partInd = (partInd + 1 ) % a.length;
                partition = a[partInd];
            }
        }
        int[] b = new int[bLength];
        int[] c = new int[a.length - bLength];
        int bIndex = 0;
        int cIndex = 0;
        for (int i : a) {
            if (i < partition) {
                b[bIndex] = i;
                bIndex++;
            } else {
                c[cIndex] = i;
                cIndex++;
            }
        }
        b = quickSort(b);
        c = quickSort(c);
        
        int[] sorted = new int[a.length];
        for (int i = 0; i < b.length; i++)
            sorted[i] = b[i];
        for (int i = 0; i < c.length; i++)
            sorted[i+b.length] = c[i];
        return sorted;
    }
    
    public static void main(String[] args) {
        int[] array1 = {1,2,3,0,-1};
        int[] array2 = {98, 23, 22, 14, 6, 67, 33, 42, 15};
        
        for (int i : quickSort(array1)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : quickSort(array2)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}