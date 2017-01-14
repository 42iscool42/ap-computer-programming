public class Cylinder extends Shape {
    private double height, radius;

    public Cylinder(double height, double radius) {
        super("Cylinder");
        this.height= height;
        this.radius = radius;
    }

    public double area() {
        return ( radius * radius + height * 2 * radius ) * Math.PI;
    }

    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}