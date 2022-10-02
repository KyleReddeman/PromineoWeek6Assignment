package reddeman.packages.cards;

public class Card {
    final private int value; //made final because a card would never change.
    final private String name;
    final private String suit;
    final private String[] valueNames = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
        this.name = calculateName(value, suit);
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
    
    private String calculateName(int value, String suit) {
        return valueNames[value - 2] + " of " + suit;
    }
}
