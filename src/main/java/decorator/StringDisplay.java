package decorator;

public class StringDisplay extends Display {

    private String string;

    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getMaxWordCount() {
        return string.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1; // 行数は1
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
