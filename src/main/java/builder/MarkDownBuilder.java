package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MarkDownBuilder extends Builder {

    private String filename;
    private PrintWriter writer;

    @Override
    protected void buildTitle(String title) {
        filename = title + ".md";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("# " + title);
    }

    @Override
    protected void buildString(String str) {
        writer.println("### " + str);
    }

    @Override
    protected void buildItems(String[] items) {
        for (String item : items) {
            writer.println("- " + item);
        }
    }

    @Override
    protected void buildDone() {
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
