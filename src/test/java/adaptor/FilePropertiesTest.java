package adaptor;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilePropertiesTest {

    @Test
    void test() {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("file.txt");
            String getValue = f.getValue("year");
            assertEquals("2019", getValue);
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}