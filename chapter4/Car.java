package chapter4;

public class Car {
	private String make, model;
	private int year;
	
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isAntique() {
		return (2016 - year) > 45;
	}
	
	public String toString() {
		return "Car: make=" + make + ", model=" + model + ", year=" + year + ";";
	}

	
}


