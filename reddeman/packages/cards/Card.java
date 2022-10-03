package reddeman.packages.cards;



public class Card {

    public static enum Suit {
        CLUBS, SPADES, DIAMONDS, HEARTS;
    }

    public static enum CardValue {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);
        private final int value;
        CardValue(int value) {
            this.value = value;
        }
    }

    private String name;
    private CardValue cardValue;
    private Suit suit;


    public Card(CardValue cardValue, Suit suit) {
        System.out.println(Suit.SPADES);
        System.out.println(CardValue.TWO);
        this.cardValue = cardValue;
        this.suit = suit;
        this.name = calculateName();
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
    
    private String calculateName() {
            String valueName = cardValue.toString().substring(0, 1) + cardValue.toString().substring(1, cardValue.toString().length()).toLowerCase();
            String suitName = suit.toString().substring(0, 1) + suit.toString().substring(1, suit.toString().length()).toLowerCase();
            return valueName + " of " + suitName;
    }
}
