package BlackJack;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    int playerScore;
    int startingMoney;
    int betAmount;

    public Player(int playerScore, int startingMoney, int betAmount) {
        this.playerScore = playerScore;
        this.startingMoney = startingMoney;
        this.betAmount = betAmount;
    }
    public int getPlayerScore() {
        return playerScore;
    }

    public int getStartingMoney() {
        return startingMoney;
    }

    public int getBetAmount() {
        return betAmount;
    }


}


