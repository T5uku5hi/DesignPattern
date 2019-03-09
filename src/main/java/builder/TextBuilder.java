package builder;

public class TextBuilder extends Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    protected void buildTitle(String title) {
        buffer.append("==============================\n");
        buffer.append("『 ").append(title).append(" 』\n");
        buffer.append("\n");
    }

    @Override
    protected void buildString(String str) {
        buffer.append("■ ").append(str).append("\n");
        buffer.append("\n");
    }

    @Override
    protected void buildItems(String[] items) {
        for (String item : items) {
            buffer.append(" ・").append(item).append("\n");
        }
        buffer.append("\n");
    }

    @Override
    protected void buildDone() {
        buffer.append("==============================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
