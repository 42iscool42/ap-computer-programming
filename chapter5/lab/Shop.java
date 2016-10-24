// ***************************************************************
// Shop.java
//
// Uses the Item class to create items and add them to a shopping
// cart stored in an ArrayList.
// ***************************************************************
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Shop {
    
    public static void main (String[] args) {
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        ArrayList<Item> cart = new ArrayList<Item>();
        
        do {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            // *** create a new item and add it to the cart 
            item = new Item(itemName, itemPrice, quantity);
            cart.add(item);
            // *** print the contents of the cart object using println
            printCart(cart);
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
            keepShopping = scan.nextLine();
        } while (keepShopping.equals("y"));
    }
    
    public static void printCart(ArrayList<Item> cart) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        double price = 0;
        for (Item i : cart) {
            System.out.println(i);
            price += (i.getPrice() * i.getQuantity());
        }
        System.out.println("Total Price: $" + fmt.format(price));
    }
}