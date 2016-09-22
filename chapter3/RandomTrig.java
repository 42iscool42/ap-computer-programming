package chapter3;

import java.util.Random;
import java.lang.Math;

public class RandomTrig {

	public static void main(String[] args) {
		Random ran = new Random();
		int num = ran.nextInt(21) + 20;
		
		System.out.println("Num: " + num);
		System.out.println("Sine: " + Math.sin(num));
		System.out.println("Cosine: " + Math.cos(num));
		System.out.println("Tangent: " + Math.tan(num));
	}

}
