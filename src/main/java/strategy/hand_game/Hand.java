package strategy.hand_game;

public class Hand {

    private static final int HANDVALUE_GUU = 0;
    private static final int HANDVALUE_CHO = 1;
    private static final int HANDVALUE_PAA = 2;

    private static final Hand[] hand = {
        new Hand(HANDVALUE_GUU),
        new Hand(HANDVALUE_CHO),
        new Hand(HANDVALUE_PAA),
    };

    private static final String[] name = {
        "グー", "チョキ", "パー",
    };

    private int handValue;

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    static Hand getHand(int handValue) { // 値からインスタンスを得る
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    private int fight(Hand h) { // 引き分けは0, thisの勝ちなら1, hの勝ちなら-1
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return name[handValue];
    }
}
