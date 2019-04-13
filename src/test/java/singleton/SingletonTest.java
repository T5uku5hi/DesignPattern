package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void test() {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        assertSame(obj1, obj2);
    }

    @Test
    void ticketMakerTest() {
        int nextTicketNumber = TicketMaker.getInstance().getNextTicketNumber();
        // Question: getNextTicketNumber()の返り値はなぜ1001ではないのか.
        assertEquals(1000, nextTicketNumber);
    }

    @Test
    void tripleTest() {
        System.out.println("Start.");
        for (int i = 0; i < 9; i++) {
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" + triple);
        }
        System.out.println("End.");
    }
}