package packages.user;

import java.util.*;

import packages.cards.*;

//represents a player of the game War.
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

    public String getName() {
        return this.name;
    }

    //prints the players name and score, as well as
    //all of the cards in the players hand.
    public void describe() {
        System.out.println(this.name + " - Score: " + this.score);
        System.out.println("Cards: ");
        for(Card card : this.hand) {
            System.out.println(card);
        }
    }

    //removes and returns a card from the top of the players hand.
    public Card flip() {
        return this.hand.remove(0);
    }

    //draws one card from a deck, and adds it to the top of your hand.
    public void draw(Deck deck) {
        this.hand.add(0, deck.draw());
    }

    //adds to your score
    public void incrementScore() {
        this.score++;
    }
}
