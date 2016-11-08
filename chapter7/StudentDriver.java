public class StudentDriver {
    public static void main(String[] spanishRose) {
        Address home = new Address("360 Ivy Lane", "Glen Mills", "PA", 19342l);
        Address school = new Address("522 Smithbridge Road", "Glen Mills", "PA", 19342);
        
        Student nate = new Student("Nathan", "Lipiarski", home, school, 94.5, 88.3, 75.6);
        Student grant = new Student("Grant", "Block", home, school, 95.6, 78.3, 89.2);
        
        System.out.println(nate);
        System.out.println();
        System.out.println(grant);
    }
}