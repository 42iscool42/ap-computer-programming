public class Kennel {
    public static void main(String args[]) {
        Dog d1 = new Dog("Grant", 6);
        Dog d2 = new Dog("Josh", 4);
        d1.setAge(5);
        d2.setAge(5);
        System.out.println(d1 + "\n" + d2);
    }
}