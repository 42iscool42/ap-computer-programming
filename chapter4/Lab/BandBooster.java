package chapter4.Lab;

public class BandBooster {
	int boxesSold;
	String name;
	public BandBooster(String name) {
		this.name = name;
		boxesSold = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void updateSales(int boxes) {
		boxesSold+=boxes;
	}
	
	public String toString() {
		return name + ": " + boxesSold + " boxes";
	}
}
