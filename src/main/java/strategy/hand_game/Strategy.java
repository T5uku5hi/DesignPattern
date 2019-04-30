package strategy.hand_game;

public interface Strategy {

    Hand nextHand();
    void study(boolean win);
}
