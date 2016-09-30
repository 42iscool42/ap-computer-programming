package chapter4;

public class CounterTest {

	public static void main(String[] args) {
		Counter c1, c2;
		c1 = new Counter();
		c2 = new Counter();
		
		c1.click();
		System.out.println(c1.getCount());
		c2.click();
		c2.click();
		System.out.println(c2.getCount());
		c1.reset();
		c2.reset();
		System.out.println(c1.getCount());
		System.out.println(c2.getCount());
	}

}
