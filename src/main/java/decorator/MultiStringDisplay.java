package decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {

    // 複数のストリングを持つ
    private List<String> messageList = new ArrayList<>();
    // 最大文字数
    private int maxWordCount = 0;

    @Override
    public int getMaxWordCount() {
        return maxWordCount;
    }

    @Override
    public int getRows() {
        return messageList.size();
    }

    @Override
    public String getRowText(int row) {
        return messageList.get(row);
    }

    public void add(String msg) {
        messageList.add(msg);
        updateColumn(msg);
    }

    private void updateColumn(String msg) {
        if (msg.getBytes().length > maxWordCount) {
            maxWordCount = msg.getBytes().length;
        }
        for (int row = 0; row < messageList.size(); row++) {
            int fills = maxWordCount - messageList.get(row).getBytes().length;
            if (fills > 0) {
                messageList.set(row, messageList.get(row) + spaces(fills));
            }
        }
    }

    private String spaces(int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append(' ');
        }
        return builder.toString();
    }
}
