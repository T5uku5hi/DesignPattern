package template_method;

import org.junit.jupiter.api.Test;

class TemplateMethodTest {

    @Test
    void test() {
        AbstractDisplay charDisplay = new CharDisplay('H');
        AbstractDisplay strDisplay1 = new StringDisplay("Hello, world.");
        AbstractDisplay strDisplay2 = new StringDisplay("こんにちは。");
        charDisplay.display();
        strDisplay1.display();
        strDisplay2.display();
    }
}