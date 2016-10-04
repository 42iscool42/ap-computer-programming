public class MultiSphere {
    public static void main(String[] args) {
        Sphere s1 = new Sphere(4);
        Sphere s2 = new Sphere(8);
        s1.setDiameter(5);
        s2.setDiameter(7);
        System.out.println(s1 + "\n" + s2);
    }
}