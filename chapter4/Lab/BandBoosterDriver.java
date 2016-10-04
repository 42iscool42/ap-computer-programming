package chapter4.Lab;

import java.util.Scanner;

public class BandBoosterDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("First Band Booster's Name: ");
		BandBooster b1 = new BandBooster(input.nextLine());
		System.out.print("Second Band Booster's Name: ");
		BandBooster b2 = new BandBooster(input.nextLine());
		
		System.out.print(b1.getName() + "'s first week sales: ");
		b1.updateSales(input.nextInt());
		System.out.print(b1.getName() + "'s second week sales: ");
		b1.updateSales(input.nextInt());
		System.out.print(b1.getName() + "'s third week sales: ");
		b1.updateSales(input.nextInt());

		System.out.print(b2.getName() + "'s first week sales: ");
		b2.updateSales(input.nextInt());
		System.out.print(b2.getName() + "'s second week sales: ");
		b2.updateSales(input.nextInt());
		System.out.print(b2.getName() + "'s third week sales: ");
		b2.updateSales(input.nextInt());
		
		System.out.println("Sales:\n\t" + b1 + "\n\t" + b2);
	}

}
