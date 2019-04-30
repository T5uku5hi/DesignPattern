package bridge;

import org.junit.jupiter.api.Test;

class DisplayTest {

    @Test
    void test() {
        Display d1 = new Display(new StringDisplayImpl("Hello, Japan."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
    }

    @Test
    void countDisplayAndFileDisplayTest() {
        CountDisplay d = new CountDisplay(new FileDisplayImpl("star.txt"));
        d.multiDisplay(3);
    }

    @Test
    void increaseDisplayAndCharDisplayTest() {
        IncreaseDisplay d1 = new IncreaseDisplay(
            new CharDisplayImpl('<', '*', '>'), 1
        );
        IncreaseDisplay d2 = new IncreaseDisplay(
            new CharDisplayImpl('|', '#', '|'), 2
        );
        d1.increaseDisplay(4);
        d2.increaseDisplay(6);
    }
}