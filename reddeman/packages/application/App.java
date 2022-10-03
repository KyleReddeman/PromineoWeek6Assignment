
package reddeman.packages.application;

import reddeman.packages.cards.*;

public class App {

    public static void main(String[] args) {
        System.out.println(Card.CardValue.THREE);
        Card card = new Card(Card.CardValue.THREE, Card.Suit.CLUBS);
        System.out.println(card);

    }
}