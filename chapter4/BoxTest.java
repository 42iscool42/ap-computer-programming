package chapter4;

public class BoxTest {
	public static void main(String[] args) {
		Box b1 = new Box(1, 2, 3);
		Box b2 = new Box(5,6,4);
		b1.setFull(true);
		b2.setHeight(6);
		b1.setDimensions(7, 8, 10);
		System.out.println(b1 + "\n"+ b2);
	}
}
