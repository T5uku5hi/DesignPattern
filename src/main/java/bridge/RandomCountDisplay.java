package bridge;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay {

    private Random random = new Random();

    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    @Override
    public void multiDisplay(int times) {
        super.multiDisplay(random.nextInt(times));
    }
}
