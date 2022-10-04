package reddeman.packages.cards;

import java.util.*;

public class Deck {
    List<Card> cards;

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
    //can't call on empty deck.
    public Card draw() {
        return cards.remove(0);
    }

    public String toString() {
        String description = "";
        for(Card card : cards) {
            description += card + "\n";
        }
        return description;
    }
}
