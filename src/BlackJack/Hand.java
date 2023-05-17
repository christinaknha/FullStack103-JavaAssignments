package BlackJack;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> hand;

    public Hand() {
        hand = new ArrayList<Card>();
    }

    public void createHand(Deck deck) {
        for (int i = 0; i < 2; i++) {
            hand.add(deck.getCard(i));
            deck.removeCard(i);
        }
    }
}
