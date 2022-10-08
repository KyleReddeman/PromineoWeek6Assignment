package packages.cards;

import java.util.*;

//class used to represent a standard deck of playing cards.
public class Deck {
    List<Card> cards;

    //populates the deck with all 52 distinct cards
    public Deck () {
        cards = new LinkedList<>();
        for(Card.Suit suit : Card.Suit.values()) {
            for(Card.CardValue cardValue : Card.CardValue.values()) {
                cards.add(new Card(cardValue, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    //removes and returns top card.
    //returns null if called on empty deck.
    public Card draw() {
        if(cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

    //returns a string representation of all the cards currently in the deck
    public String toString() {
        String description = "";
        for(Card card : cards) {
            description += card + "\n";
        }
        return description;
    }
}
