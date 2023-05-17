package BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private int wins;
    private int losses;
    private int pushes;

    public Game() {
        wins = 0;
        losses = 0;
        pushes = 0;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Blackjack!");

        System.out.println("How much do you have to play with today?");
        int playerBalance = Integer.valueOf(scanner.nextLine());

        System.out.println("How much would you like to bet this round?");
        int betAmount = Integer.valueOf(scanner.nextLine());

        // Create the playing deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffleDeck();

        // Create hands for the player and the dealer - hands are created from methods that are made in the deck class
        Deck playerHand = new Deck();

        playerHand.addCard(playerHand.draw(playingDeck));
        playingDeck.removeCard(0);
        playerHand.addCard(playerHand.draw(playingDeck));
        playingDeck.removeCard(0);

//        System.out.println(playerHand.deckSize());
//        System.out.println(playingDeck.deckSize());
//        System.out.println(playerHand.cardValues());

        Deck dealerHand = new Deck();

        dealerHand.addCard(dealerHand.draw(playingDeck));
        playingDeck.removeCard(0);
        System.out.println("The dealer's hand looks like this: " + dealerHand.getCard(0) + " - " +
                "Dealer's value: " + dealerHand.cardValues());
        dealerHand.addCard(dealerHand.draw(playingDeck));
        playingDeck.removeCard(0);
        System.out.println("The second card is face down.");

//        System.out.println(dealerHand.deckSize());
//        System.out.println(playingDeck.deckSize());
//        System.out.println(dealerHand.cardValues());
        while (true) {
            System.out.println("Your hand looks like this: ");
            for (int i = 0; i < playerHand.deckSize(); i++) {
                System.out.println(playerHand.getCard(i).toString());
            }
            System.out.println("- Your Value: " + playerHand.cardValues());

            System.out.println("What would you like to do? Enter 1 to Hit or 2 to Stand");

            int userMove = Integer.valueOf(scanner.nextLine());
            if (userMove == 1) {
                playerHand.addCard(playerHand.draw(playingDeck));
                playingDeck.removeCard(0);
                System.out.println("The dealer gives you a card form the Deck.");
                System.out.println("Your hand looks like this: ");
                for (int j = 0; j < playerHand.deckSize(); j++) {
                    System.out.println(playerHand.getCard(j).toString());
                }
                System.out.println("Your value: " + playerHand.cardValues());
                if (playerHand.cardValues() > 21) {
                    System.out.println("You've busted. You lose $" + betAmount);
                    playerBalance = playerBalance - betAmount;
                    System.out.println("You now have $" + playerBalance);
                    break;
                }

            } else if (userMove == 2) {
                System.out.println("Dealer hand looks like this: ");
                for (int j = 0; j < dealerHand.deckSize(); j++) {
                    System.out.println(dealerHand.getCard(j).toString());
                }
                System.out.println("Dealer value: " + dealerHand.cardValues());
                if (dealerHand.cardValues() == 21) {
                    System.out.println("Dealer has blackjack!");
                    if (playerHand.cardValues() == 21) {
                        System.out.println("It is a tie! You also have blackjack! You win nothing.");
                        System.out.println("You now have $" + playerBalance);
                        break;
                    } else {
                        System.out.println("Dealer has blackjack. You lose.");
                        playerBalance = playerBalance - betAmount;
                        System.out.println("You now have $" + playerBalance);
                        break;
                    }
                }
                if (playerHand.cardValues() == 21) {
                    System.out.println("You have BlackJack! You win!");
                    playerBalance = playerBalance + betAmount;
                    System.out.println("You now have $" + playerBalance);
                    break;
                }
                if (dealerHand.cardValues() < 17) {
                    dealerHand.addCard(dealerHand.draw(playingDeck));
                    playingDeck.removeCard(0);

                    if (dealerHand.cardValues() >= 21) {
                        System.out.println("Dealer has busted. You win $" + betAmount);
                        playerBalance = playerBalance + betAmount;
                        System.out.println("You now have $" + playerBalance);
                        break;
                    }
                } else if (playerHand.cardValues() < 21 && playerHand.cardValues() > dealerHand.cardValues()) {
                    System.out.println("You have higher values. You win!");
                    playerBalance = playerBalance + betAmount;
                    System.out.println("You now have $" + playerBalance);
                    break;
                } else if (dealerHand.cardValues() < 21 && dealerHand.cardValues() > playerHand.cardValues()) {
                    System.out.println("Dealer has higher values. You lose!");
                    playerBalance = playerBalance + betAmount;
                    System.out.println("You now have $" + playerBalance);
                    break;
                } else if (playerHand.cardValues() == dealerHand.cardValues()) {
                    System.out.println("It is a tie! You also have blackjack! You win nothing.");
                    System.out.println("You now have $" + playerBalance);
                    break;
                }


            }
        }
    }
}

