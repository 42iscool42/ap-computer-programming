import java.util.Scanner;

public class Stars {
    public final static int max = 100;
    public static void main(String[] itsHalloween) {
        Scanner input = new Scanner(System.in);
        String choice = "";
        do {
            System.out.print("Choose 'a', 'b', 'c', or 'd':");
            choice = String.valueOf( input.nextLine().toLowerCase().charAt(0) );
        } while ("abcd".indexOf((String) choice) < 0);
        
        switch (choice) {
            case "a":
                a();
                break;
            case "b":
                b();
                break;
            case "c":
                c();
                break;
            case "d":
                d();
                break;
        }
    }
    
    public static void a() {
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max-i; j++){ 
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void b() {
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max-i-1; j++){ 
                System.out.print(" ");
            }
            
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void c() {
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < i; j++){ 
                System.out.print(" ");
            }
            
            for (int k = 0; k < max-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void d() {
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < Math.ceil(Math.abs((double) (i - max/2) + 0.5)); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (max/2 - Math.ceil(Math.abs((double) (i - max/2) + 0.5)) ) + 1; k++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}