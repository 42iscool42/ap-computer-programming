public class Dog implements Speaker {
    public void speak() {
        System.out.println("Woooof");
    }
    
    public void announce(String str) {
        System.out.println("Dogs don't speak!");
    }
}