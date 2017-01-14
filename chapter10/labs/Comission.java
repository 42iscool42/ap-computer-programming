public class Comission extends Hourly {
    double totalSales;
    double rate;
    
    public Comission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.rate = comissionRate;
    }
    
    public void addSales(double sales) {
        totalSales += sales;
    }
    
    public double pay() {
        double amount = super.pay() + rate * totalSales;
        totalSales = 0;
        return amount;
    }
    
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}