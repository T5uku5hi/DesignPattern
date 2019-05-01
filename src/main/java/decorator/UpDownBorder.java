package decorator;

public class UpDownBorder extends Border {

    private char borderChar;

    UpDownBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getMaxWordCount() {
        return display.getMaxWordCount();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return makeLine(borderChar, display.getMaxWordCount());
        } else if (row == (display.getRows() + 1)) {
            return makeLine(borderChar, display.getMaxWordCount());
        } else {
            return display.getRowText(row - 1);
        }
    }

    private String makeLine(char ch, int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(ch);
        }
        return builder.toString();
    }
}
