public class Transactions {
    public static void main(String[] iGotThreeHoursOfSleep) {
        Account grant = new Account("Grant", 00112233l, -23);
        Account nate = new Account("Nate", 46676734l);
        
        grant.deposit(80);
        nate.deposit(70);
        
        System.out.println(grant);
        System.out.println(nate);
    }
}