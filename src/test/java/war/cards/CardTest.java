package war.cards;

import org.junit.*;

public class CardTest {
    
    private Card card;

    @Before
    public void setup() {
        card = new Card(Card.CardValue.KING, Card.Suit.HEARTS);
    }

    @Test
    public void testGetValue() {
        Assert.assertEquals(13, card.getValue());
    }

    @Test
    public void testToString() {
        Assert.assertEquals("King of Hearts", card.toString());
    }
}
