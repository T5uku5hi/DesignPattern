package adaptor;

import org.junit.jupiter.api.Test;

class PrintBannerTest {

    @Test
    void test() {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }

}