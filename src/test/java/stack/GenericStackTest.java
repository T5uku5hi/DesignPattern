package stack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenericStackTest {

    @Test
    void strTest() {
        GenericStack<String> strStack = new GenericStack<>();
        String lastPushStr = "Java";
        strStack.push("Scala");
        strStack.push("Groovy");
        strStack.push(lastPushStr);
        String popElement = strStack.pop();

        assertNotNull(popElement);
        assertEquals(lastPushStr, popElement);
    }

    @Test
    void intTest() {
        GenericStack<Integer> intStack = new GenericStack<>();
        Integer lastPushInt = 300;
        intStack.push(100);
        intStack.push(200);
        intStack.push(lastPushInt);
        Integer popElement = intStack.pop();

        assertNotNull(popElement);
        assertEquals(lastPushInt, popElement);
    }
}
