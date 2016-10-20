public class FlipRace {
    public static void main(String[] args) {
        Coin c1 = new Coin();
        Coin c2 = new Coin();
        int heads1 = 0;
        int heads2 = 0;
        int flips = 0;
        while (heads1 < 3 && heads2 < 3) {
            flips++;
            c1.flip();
            c2.flip();
            if (c1.isHeads()) {
                System.out.print("Coin1: Heads, ");
                heads1++;
            } else {
                heads1 = 0;
                System.out.print("Coin1: Tails, ");
            }
            
            if (c2.isHeads()) {
                heads2++;
                System.out.println("Coin2: Heads");
            } else {
                heads2 = 0;
                System.out.println("Coin2: Tails");
            }
        }
        if (heads1 == heads2) {
            System.out.println("After " + flips + " flips it's a tie");
        } else if (heads1 == 3) {
            System.out.println("After " + flips + " flips Coin1 wins");
        } else {
            System.out.println("After " + flips + " flips Coin2 wins");
        }
    }
}