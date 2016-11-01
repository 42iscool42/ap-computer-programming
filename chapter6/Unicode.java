public class Unicode {
    public static void main(String[] todosEstanListos) {
        for (int i = 32; i <= 126; i++) {
            System.out.print(i + ": " + (char)i + "\t");
            if ((i-1) % 5 == 0 ) System.out.println();
        }
    }
}