
package reddeman.packages.application;

import reddeman.packages.cards.*;
import java.util.*;

public class App {

    public static void main(String[] args) {

        Deck deck = new Deck();
        System.out.println(deck);
        deck.shuffle();
        System.out.println(deck);
        System.out.println(deck.draw());
        System.out.println("");
        System.out.println(deck);
    }
}