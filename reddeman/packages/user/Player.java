package reddeman.packages.user;

import reddeman.packages.cards.*;
import java.util.*;

public class Player {
    private List<Card> hand;
    private int score;
    private String name;

    public Player(String name) {
        this.hand = new LinkedList<>();
        this.score = 0;
        this.name = name;
    }

    public int getScore() {
        return this.score;
    }

    public void describe() {
        System.out.println(this.name + " - Score: " + this.score);
        System.out.println("Cards: ");
        for(Card card : this.hand) {
            System.out.println(card);
        }
    }

    public Card flip() {
        return this.hand.remove(0);
    }

    public void draw(Deck deck) {
        this.hand.add(0, deck.draw());
    }

    public void incrementScore() {
        this.score++;
    }
}
