
package reddeman.packages.application;

import reddeman.packages.cards.*;
import reddeman.packages.user.*;
import java.util.*;

public class App {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();
        System.out.println(deck);
        Player player1 = new Player("Kyle");
        player1.describe();
        player1.draw(deck);
        player1.describe();
        System.out.println(deck);

    }
}