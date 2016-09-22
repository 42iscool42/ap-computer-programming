package chapter3;

import java.text.DecimalFormat;
import java.util.Random;

public class PhoneNumGen {

	public static void main(String[] args) {
		Random ran = new Random();
		String phoneNum = "";
		phoneNum = phoneNum + ran.nextInt(8) + ran.nextInt(8)+ ran.nextInt(8) + "-";
		
		DecimalFormat fmt = new DecimalFormat("000");
		int nextPart = ran.nextInt(656);
		phoneNum+= fmt.format(nextPart);
		phoneNum += "-";

		DecimalFormat fmt2 = new DecimalFormat("0000");
		nextPart = ran.nextInt(10000);
		phoneNum+=fmt2.format(nextPart);
		
		System.out.println(phoneNum);
	}

}
