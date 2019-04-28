package abstract_factory.list_factory;

import abstract_factory.factory.Item;
import abstract_factory.factory.Page;

public class ListPage extends Page {

    ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<!DOCTYPE html><html lang=\"ja\"><head><meta charset=\"utf-8\"><title>").append(title).append("</title></head>\n");
        builder.append("<body>\n");
        builder.append("<h1>").append(title).append("</h1>\n");
        builder.append("<ul>\n");
        for (Object o : content) {
            Item item = (Item) o;
            builder.append(item.makeHTML());
        }
        builder.append("</ul>\n");
        builder.append("<hr><address>").append(author).append("</address>");
        builder.append("</body></html>\n");
        return builder.toString();
    }
}
