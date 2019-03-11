package stack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenericStackUtilTest {

    @Test
    void test() {
        List<String> strList = new ArrayList<>();
        String lastPushStr = "Groovy";
        strList.add("Java");
        strList.add(lastPushStr);

        GenericStack<String> genericStack = GenericStackUtil.as(strList);
        String popElement = genericStack.pop();
        assertEquals(lastPushStr, popElement);
    }
}