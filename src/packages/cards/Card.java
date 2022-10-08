package packages.cards;


//class that is used to represent a playing card
public class Card {

    public static enum Suit {//represents the card suits
        CLUBS("Clubs"), SPADES("Spades"), DIAMONDS("Diamonds"), HEARTS("Hearts");

        private final String name;
        Suit(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
    }

    public static enum CardValue { //represents the cards name and value
        TWO(2, "Two"), THREE(3, "Three"), FOUR(4, "Four"), FIVE(5, "Five"), 
        SIX(6, "Six"), SEVEN(7, "Seven"), EIGHT(8, "Eight"), NINE(9, "Nine"), TEN(10, "Ten"), 
        JACK(11, "Jack"), QUEEN(12, "Queen"), KING(13, "King"), ACE(14, "Ace");

        private final int value;
        private final String name;
        CardValue(int value, String name) {
            this.value = value;
            this.name = name;
        }
        public int getValue() {
            return this.value;
        }
        public String getName() {
            return this.name;
        }
    }


    private CardValue cardValue;
    private Suit suit;
    private String cardDescription;


    public Card(CardValue cardValue, Suit suit) {
        this.cardValue = cardValue;
        this.suit = suit;
        this.cardDescription = calculateDescription();
    }

    public int getValue() {
        return this.cardValue.getValue();
    }

    public void describe() {
        System.out.println(cardDescription);
    }

    public String toString() {
        return cardDescription;
    }
    

    //adds the name of the card and its suit to create a card description
    private String calculateDescription() {
            return cardValue.getName() + " of " + suit.getName();
    }
}
