package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringStackTest {

    @Test
    void test() {
        StringStack strStack = new StringStack();
        String lastPushStr = "Java";
        strStack.push("Scala");
        strStack.push("Groovy");
        strStack.push(lastPushStr);

        String popElement = strStack.pop();
        assertEquals(lastPushStr, popElement);
    }
}