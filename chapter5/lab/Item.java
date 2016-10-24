import java.text.DecimalFormat;

public class Item {
    private String name;
    private double price;
    private int quantity;
    private DecimalFormat fmt = new DecimalFormat("0.00");
    
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public String toString() {
        return name + ": " + quantity + " @ $" + fmt.format(price); 
    }
}