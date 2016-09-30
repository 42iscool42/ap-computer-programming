package chapter4;

public class BulbTest {

	public static void main(String[] args) {
		Bulb b1, b2, b3;
		b1 = new Bulb();
		b2 = new Bulb();
		b3 = new Bulb();
		b1.turnOn();
		b2.turnOn();
		b3.turnOn();
		b2.turnOff();
		
		System.out.println(b1.state());
		System.out.println(b2.state());
		System.out.println(b3.state());
	}

}
