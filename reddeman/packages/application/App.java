
package reddeman.packages.application;

import reddeman.packages.cards.*;
import reddeman.packages.user.*;
import java.util.*;

public class App {

    public static void main(String[] args) {

        Deck deck = new Deck();
        System.out.println(deck);
        deck.shuffle();
        Player player1 = new Player("Kyle");
        player1.describe();

    }
}