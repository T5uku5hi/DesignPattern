package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberStackTest {

    @Test
    void test() {
        NumberStack<Integer> intStack = new NumberStack<>();
        NumberStack<Long> longStack = new NumberStack<>();
        // NumberStack<String> ... コンパイルエラー

        Integer lastPushInt = 300;
        intStack.push(100);
        intStack.push(200);
        intStack.push(300);
        longStack.push(100L);

        Integer popElement = intStack.pop();

        assertNotNull(popElement);
        assertEquals(lastPushInt, popElement);
    }
}