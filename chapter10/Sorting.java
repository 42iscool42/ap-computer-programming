public class Sorting {
    
    public static void main(String[] args) {
        String[] unsorted = {"Hello", "world", "how", "are", "you", "?"};
        String[] selectionSort = unsorted;
        String[] insertionSort = unsorted;
        
        System.out.println("Unsorted: ");
        displayStringArray(unsorted);
        System.out.println("Selection sort: ");
        selectionSort(selectionSort);
        displayStringArray(selectionSort);
        System.out.println("Insertion sort: ");
        insertionSort(insertionSort);
        displayStringArray(insertionSort);
    }
    
    public static void displayStringArray(String[] array) {
        for (String s : array) {
            System.out.print(s + ";  ");
        }
        System.out.println();
    }
    
    public static void selectionSort(Comparable[] list) {
        int max;
        Comparable temp;
        
        for (int index = 0; index < list.length -1; index++) {
            max = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[max]) > 0)
                    max = scan;
            temp = list[max];
            list[max] = list[index];
            list[index] = temp;
        }
    }
    
    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;
            
            while (position > 0 && key.compareTo(list[position - 1]) > 0) {
                list[position] = list[position - 1];
                position--;
            }
            
            list[position] = key;
        }
    }
}