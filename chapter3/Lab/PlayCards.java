public class PlayCards {
    enum Rank { ace, two, three, four, five, six, seven, eight, nine, ten, jack, queen, king }
    
    public static void main(String[] args) {
        Rank highCard, faceCard, card1, card2;
        highCard = Rank.ace;
        faceCard = Rank.jack;
        card1 = Rank.two;
        card2 = Rank.three;
        
        System.out.println("A black jack hand: " + highCard + " and " + faceCard);
        int card1Val = card1.ordinal() + 1;
        int card2Val = card2.ordinal() + 1;
        System.out.println("A two card hand " + card1 + " and " + card2);
        System.out.println("Hand value: " + (card1Val + card2Val));
    }
}