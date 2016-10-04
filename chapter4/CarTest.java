package chapter4;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("T-4", "7-g", 1913);
		Car c2 = new Car("Honda", "Civic", 2009);
		c2.setYear(2000);
		System.out.println("Car 1 is antique: " + c1.isAntique());
		System.out.println(c1 + "\n" + c2);

	}

}
