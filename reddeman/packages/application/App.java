
package reddeman.packages.application;

import reddeman.packages.cards.*;

public class App {

    public static void main(String[] args) {
        Card card = new Card(Card.CardValue.KING, Card.Suit.CLUBS);
        System.out.println(card.getValue());
        System.out.println(card);
    }
}