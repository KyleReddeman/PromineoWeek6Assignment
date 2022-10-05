
package reddeman.packages.application;

import reddeman.packages.cards.*;
import reddeman.packages.user.*;
import java.util.*;

public class App {

    public static void main(String[] args) {
        //game setup
        Player playerOne = new Player("Kyle");
        Player playerTwo = new Player("Bill");
        Deck deck = new Deck();
        deck.shuffle();

        for(int i = 0; i < 52; i++) {//seems silly, why not go through 26 times and get rid of conditional.
            if(i % 2 == 0) {
                playerOne.draw(deck);
            } else {
            playerTwo.draw(deck);
            }
        }
        //gameplay loop
        for(int i = 0; i < 26; i++) {
            Card playerOneCard = playerOne.flip();
            Card playerTwoCard = playerTwo.flip();

            System.out.println(playerOne.getName() + " drew a " + playerOneCard);
            System.out.println(playerTwo.getName() + " drew a " + playerTwoCard);

            if(playerOneCard.getValue() > playerTwoCard.getValue()) {
                playerOne.incrementScore();
                System.out.println(playerOne.getName() + " won the round");
            } else if(playerTwoCard.getValue() > playerOneCard.getValue()) {
                playerTwo.incrementScore();
                System.out.println(playerTwo.getName() + " won the round");

            } else {
                System.out.println("This round was a draw!");
            }
            System.out.println(playerOne.getName() + ": " + playerOne.getScore() + " - " + playerTwo.getName() + ": " + playerTwo.getScore()); //print score

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
            System.out.println();
        }

        //print game outcome
        if(playerOne.getScore() > playerTwo.getScore()) {
            System.out.println(playerOne.getName() + " won the game!");
        } else if(playerTwo.getScore() > playerOne.getScore()) {
            System.out.println(playerTwo.getName() + " won the game!");
        } else {
            System.out.println("The game was a draw!");
        }


    }
}