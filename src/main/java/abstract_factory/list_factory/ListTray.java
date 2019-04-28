package abstract_factory.list_factory;

import abstract_factory.factory.Item;
import abstract_factory.factory.Tray;

public class ListTray extends Tray {

    ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n");
        builder.append(caption).append("\n");
        builder.append("<ul>\n");
        for (Object o : tray) {
            Item item = (Item) o;
            builder.append(item.makeHTML());
        }
        builder.append("</ul>\n");
        builder.append("</li>\n");
        return builder.toString();
    }
}