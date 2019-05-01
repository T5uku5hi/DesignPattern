package decorator;

import org.junit.jupiter.api.Test;

class DisplayTest {

    @Test
    void test() {
        Display d1 = new StringDisplay("Hello, world");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
        Display d4 = new SideBorder(
                        new FullBorder(
                            new FullBorder(
                                new SideBorder(
                                    new FullBorder(
                                        new StringDisplay("こんにちは。")
                                    ),
                                    '*'
                                )
                            )
                        ),
                    '/'
                    );
        d4.show();
    }

    @Test
    void upDownBorderTest() {
        Display d1 = new StringDisplay("Hello, world");
        Display d2 = new UpDownBorder(d1, '-');
        Display d3 = new SideBorder(d2, '*');
        d1.show();
        d2.show();
        d3.show();
        Display d4 = new FullBorder(
                new UpDownBorder(
                        new SideBorder(
                                new UpDownBorder(
                                        new SideBorder(
                                                new StringDisplay("こんにちは。"),
                                                '*'
                                        ),
                                        '='
                                ),
                                '|'
                        ),
                        '/'
                )
        );
        d4.show();
    }

    @Test
    void multiStringDisplayTest() {
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("おはようございます。");
        md.add("こんにちは。");
        md.add("おやすみなさい、また明日。");
        md.show();

        Display d1 = new SideBorder(md, '#');
        d1.show();

        Display d2 = new FullBorder(md);
        d2.show();
    }
}