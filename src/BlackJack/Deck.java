package BlackJack;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
    }

    public void createFullDeck() {
        // generate cards
        for(Values value : Values.values()){
            deck.add(new Card(Suits.CLUB, value));
            deck.add(new Card(Suits.SPADE, value));
            deck.add(new Card(Suits.DIAMOND, value));
            deck.add(new Card(Suits.HEART, value));
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(deck);
    }



    public Card getCard(int i){
        return this.deck.get(i);
    }

    public void removeCard(int i){
        this.deck.remove(i);
    }

    public void addCard(Card addCard) {
        this.deck.add(addCard);
    }

    // Get the size of the deck
    public int deckSize() {
        return this.deck.size();
    }

    // Draws from the deck
    public Card draw(Deck comingFrom) {
        return comingFrom.getCard(0);
    }

    // Calculate cardValues
    public int cardValues() {
        int totalValue=0;
        for (int i = 0; i < deckSize(); i++) {
            Values cardValue = deck.get(i).getValue();
            switch (cardValue) {
                case TWO:
                    totalValue += 2;
                    break;
                case THREE:
                    totalValue += 3;
                    break;
                case FOUR:
                    totalValue += 4;
                    break;
                case FIVE:
                    totalValue += 5;
                    break;
                case SIX:
                    totalValue += 6;
                    break;
                case SEVEN:
                    totalValue += 7;
                    break;
                case EIGHT:
                    totalValue += 8;
                    break;
                case NINE:
                    totalValue += 9;
                    break;
                case TEN:
                case JACK:
                case QUEEN:
                case KING:
                    totalValue += 10;
                    break;
                case ACE:
                    if (totalValue < 21) {
                        totalValue += 11;
                    } else {
                        totalValue += 1;
                    }
                    break;

            }
        }return totalValue;
    }

    // This will move cards back into the deck to continue playing
    public void moveAllToDeck(Deck moveTo) {

    }


}
