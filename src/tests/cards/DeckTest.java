package src.tests.cards;

import org.junit.*;
import src.packages.cards.*;

public class DeckTest {
    private Deck deck;

    @Before
    public void setup() {
        deck = new Deck();
    }

    @Test
    public void testDraw() {
        Assert.assertEquals("Two of Clubs", deck.draw().toString());
    }

    @Test //tests that the deck has only 52 cards, and that it returns null when overdrawn
    public void testOverDraw() { 
        int count = 0;
        for(int i = 0; i < 52; i++) {
            if(deck.draw() == null) {
                count++;
            }
        }
        Assert.assertTrue(deck.draw() == null && count == 0);

    }

    @Test
    public void testToString() {
        String expectedString = "Queen of Hearts\nKing of Hearts\nAce of Hearts";
        for(int i = 0; i < 49; i++) {
            deck.draw();
        }
        Assert.assertEquals(expectedString, deck.toString());
    }
}
