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

        // Create the playing deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffleDeck();

        // Create hands for the player and the dealer - hands are created from methods that are made in the deck class
        Deck playerHand = new Deck();
        int playerScore = 0;
        for (int i = 0; i < 2; i++) {
            playerHand.addCard(playingDeck.getCard(i));
            playingDeck.removeCard(i);

            Values cardValue;
            cardValue = playerHand.getCard(i).getValue();
            switch (cardValue) {
                case TWO:
                    playerScore = playerScore + 2;
                    break;
                case THREE:
                    playerScore = playerScore + 3;
                    break;
                case FOUR:
                    playerScore = playerScore + 4;
                    break;
                case FIVE:
                    playerScore = playerScore + 5;
                    break;
                case SIX:
                    playerScore = playerScore + 6;
                    break;
                case SEVEN:
                    playerScore = playerScore + 7;
                    break;
                case EIGHT:
                    playerScore = playerScore + 8;
                    break;
                case NINE:
                    playerScore = playerScore + 9;
                    break;
                case TEN, JACK, QUEEN, KING:
                    playerScore = playerScore + 10;
                    break;
                case ACE:
                    if (playerScore < 21) {
                        playerScore = playerScore + 11;
                    } else {
                        playerScore = playerScore + 1;
                    }
                    break;
            }
//            System.out.println(playerHand.getCard(i));
//            System.out.println(playingDeck.deckSize());
        }

        Deck dealerHand = new Deck();
        int dealerScore = 0;
        for (int i = 0; i < 2; i++) {
            dealerHand.addCard(playingDeck.getCard(i));
            playingDeck.removeCard(i);
            Values cardValue;
            cardValue = dealerHand.getCard(i).getValue();
            switch (cardValue) {
                case TWO:
                    dealerScore = dealerScore + 2;
                    break;
                case THREE:
                    dealerScore = dealerScore + 3;
                    break;
                case FOUR:
                    dealerScore = dealerScore + 4;
                    break;
                case FIVE:
                    dealerScore = dealerScore + 5;
                    break;
                case SIX:
                    dealerScore = dealerScore + 6;
                    break;
                case SEVEN:
                    dealerScore = dealerScore + 7;
                    break;
                case EIGHT:
                    dealerScore = dealerScore + 8;
                    break;
                case NINE:
                    dealerScore = dealerScore + 9;
                    break;
                case TEN, JACK, QUEEN, KING:
                    dealerScore = dealerScore + 10;
                    break;
                case ACE:
                    if (dealerScore < 21) {
                        dealerScore = dealerScore + 11;
                    } else {
                        dealerScore = dealerScore + 1;
                    }
                    break;
            }
//            System.out.println(dealerHand.getCard(i));
//            System.out.println(playingDeck.deckSize());
        }

//        FIGURE OUT HOW TO PRINT ONE OF DEALERS CARDS ONLY
        System.out.println("The dealer's hand looks like this: " + dealerHand.getCard(0) + " - " +
                "Dealer's value: ");
        System.out.println("The second card is face down.");

        System.out.println("Your hand looks like this: " + playerHand.getCard(0) + " - " +
                playerHand.getCard(1) + "- Your Value: " + playerScore);

        System.out.println("What would you like to do? Enter 1 to Hit or 2 to Stand");

        int userMove = Integer.valueOf(scanner.nextLine());
        if (userMove == 1) {
            playerHand.addCard(playingDeck.getCard(0));
            playingDeck.removeCard(0);
            for (int i = 0; i < 1; i++) {
                Values cardValue;
                cardValue = playerHand.getCard(i).getValue();
                switch (cardValue) {
                    case TWO:
                        playerScore = playerScore + 2;
                        break;
                    case THREE:
                        playerScore = playerScore + 3;
                        break;
                    case FOUR:
                        playerScore = playerScore + 4;
                        break;
                    case FIVE:
                        playerScore = playerScore + 5;
                        break;
                    case SIX:
                        playerScore = playerScore + 6;
                        break;
                    case SEVEN:
                        playerScore = playerScore + 7;
                        break;
                    case EIGHT:
                        playerScore = playerScore + 8;
                        break;
                    case NINE:
                        playerScore = playerScore + 9;
                        break;
                    case TEN, JACK, QUEEN, KING:
                        playerScore = playerScore + 10;
                        break;
                    case ACE:
                        if (playerScore < 21) {
                            playerScore = playerScore + 11;
                        } else {
                            playerScore = playerScore + 1;
                        }
                        break;
                }
                System.out.println("The dealer gives you a card form the Deck.");
                System.out.println("Your hand looks like this: ");
                for (int j = 0; j < playerHand.deckSize(); j++) {
                    System.out.println(playerHand.getCard(j));
                }
                System.out.println("Your value: " + playerScore);
//              check dealerScore and make dealer moves
            }
        } else if (userMove == 2) {

            while (dealerScore < 17) {
                dealerHand.addCard(playingDeck.getCard(0));
                playingDeck.removeCard(0);
                for (int i = 0; i < 1; i++) {
                    Values cardValue;
                    cardValue = playerHand.getCard(i).getValue();
                    switch (cardValue) {
                        case TWO:
                            playerScore = playerScore + 2;
                            break;
                        case THREE:
                            playerScore = playerScore + 3;
                            break;
                        case FOUR:
                            playerScore = playerScore + 4;
                            break;
                        case FIVE:
                            playerScore = playerScore + 5;
                            break;
                        case SIX:
                            playerScore = playerScore + 6;
                            break;
                        case SEVEN:
                            playerScore = playerScore + 7;
                            break;
                        case EIGHT:
                            playerScore = playerScore + 8;
                            break;
                        case NINE:
                            playerScore = playerScore + 9;
                            break;
                        case TEN, JACK, QUEEN, KING:
                            playerScore = playerScore + 10;
                            break;
                        case ACE:
                            if (playerScore < 21) {
                                playerScore = playerScore + 11;
                            } else {
                                playerScore = playerScore + 1;
                            }
                            break;
                    }
                }


//                Write code that pulls until dealer score  >=17

            }

            if (dealerScore == 21) {
                System.out.println("Dealer has blackjack!");
                if (playerScore == 21) {
                    System.out.println("It is a tie! You also have blackjack!");
                    pushes = pushes +1;
                } else {
                    System.out.println("Dealer has blackjack. You lose.");
                loses = loses + 1;
                }
            }

            if (playerScore == 21) {
                System.out.println("You have BlackJack! You win!");
//                wins = wins + 1;
            } else if (playerScore < 21 && playerScore > dealerScore) {
                System.out.println("You have higher values. You win!");
//                wins = wins + 1;
            } else if (dealerScore < 21 && dealerScore > playerScore) {
                System.out.println("Dealer has higher values. You lose!");
//                loses = loses + 1;
            } else if (playerScore > 21 && dealerScore <= 21) {
                System.out.println("Your values have exceeded 21. You lose!");
//                loses = loses + 1;
            }

        }
//                 Game loops


    }
}


