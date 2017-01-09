public class DisplaySorting {
    
    public static void main(String args[]) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        insertionSort(arr);
    }
    
    public static void selectionSort(int[] list) {
        int max;
        int temp;
        
        for (int index = 0; index < list.length -1; index++) {
            displayArray(list);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
            System.out.println("\n\n");
            max = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan] > list[max])
                    max = scan;
            temp = list[max];
            list[max] = list[index];
            list[index] = temp;
        }
    }
    
    public static void insertionSort(int[] list) {
        for (int index = 1; index < list.length; index++) {
            int key = list[index];
            int position = index;
            
            while (position > 0 && key < list[position - 1]) {
                list[position] = list[position - 1];
                position--;
            }
            
            list[position] = key;
            displayArray(list);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {}
            
        }
    }
    
    public static void displayArray(int[] array) {
        if(array.length == 0) return;
        int max = array[0];
        int min = array[0];
        for (int i : array) {
            if (i > max) max = i;
            if (i < min) min = i;
        }
        max = max > 0 ? max : 0;
        min = min < 0 ? min : 0;
        for (int i = max; i >= min; i--) {
            if (i == 0) {
                System.out.print("0");
            } else {
                System.out.print(" ");
            }
            for (int j : array) {
                if ((j >0 && j - i >= 0 && i >= 0) || ( j < 0 && j - i <= 0 && i <= 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
    }
}