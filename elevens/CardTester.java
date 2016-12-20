package apcomputerprogramming.elevens;

public class CardTester{
	public static void main (String args[]){
		//test all methods for card with 3 objs
		Card obj1 = new Card("king", "hearts", 10);
		//suit
		//rank
		//point value
		Card[] cards = new Card[3];
		for(int i = 0; i < cards.length; i++){
			cards[0] = new Card("Ace", "Spades", 1);
			cards[1] = new Card("Two", "Diamonds", 2);
			cards[2] = new Card("Three", "Hearts", 3);
			//Card(String, String, int)
			//suit
			System.out.println(cards[i].suit());
			//rank
			System.out.println(cards[i].rank());
			//point value
			System.out.println(cards[i].pointValue());
			//mathches(card)
			System.out.println(cards[i].matches(cards[2]));
			//toString
			System.out.println(cards[i].toString());
		}
	}
}