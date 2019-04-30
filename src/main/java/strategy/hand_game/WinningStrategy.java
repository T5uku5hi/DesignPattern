package strategy.hand_game;

import java.util.Random;

public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3)); // 負けた場合はランダムに出す
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
