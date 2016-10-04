public class Sphere {
	private double diameter;
	
	public Sphere(double diameter) {
		this.diameter = diameter;
	}
	
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public double getDiameter() {
		return diameter;
	}
	
	public double getVolume() {
		return Math.PI * Math.pow(diameter, 3) / 6.0;
	}
	
	public double getSurfaceArea() {
		return Math.PI * Math.pow(diameter, 2);
	}
	
	public String toString() {
		return "Sphere: " + diameter;
	}
}
