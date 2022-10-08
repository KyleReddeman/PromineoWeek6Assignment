package src.tests.user;

import org.junit.*;
import src.packages.user.*;
import src.packages.cards.*;

public class PlayerTest {
    private Player player;

    @Before 
    public void setup() {
        player = new Player("Kyle");
    }

    @Test
    public void testDraw() {
        player.draw(new Deck());
        Assert.assertEquals("Two of Clubs", player.flip().toString());
    }

    @Test
    public void testDescribe() {
        String expectedString = "Kyle - Score: 0\nCards: \nTwo of Clubs";
        player.draw(new Deck());
        Assert.assertEquals(expectedString, player.toString());
    }

    @Test
    public void testFlip() {
        player.draw(new Deck());
        Assert.assertEquals("Two of Clubs", player.flip().toString());
    }

    @Test
    public void testFlipWithEmptyHand() {
        Assert.assertTrue(player.flip() == null);
    }

    @Test
    public void testIncrementScore() {
        player.incrementScore();
        Assert.assertEquals(1, player.getScore());
    }
}
