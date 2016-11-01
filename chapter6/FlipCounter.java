public class FlipCounter {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        Coin c = new Coin();
        for (int i = 0; i < 100; i++ ) {
            c.flip();
            if (c.isHeads()) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println(heads + " heads were flipped and " + tails + " tails were flipped.");
    }
}