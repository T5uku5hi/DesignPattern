package abstract_factory.table_factory;

import abstract_factory.factory.Item;
import abstract_factory.factory.Page;

public class TablePage extends Page {

    TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<!DOCTYPE html><html lang=\"ja\"><head><meta charset=\"utf-8\"><title>").append(title).append("</title></head>\n");
        builder.append("<body>\n");
        builder.append("<h1>").append(title).append("</h1>\n");
        builder.append("<table width=\"80\" border=\"3\">\n");
        for (Object o : content) {
            Item item = (Item) o;
            builder.append("<tr>").append(item.makeHTML()).append("</tr>");
        }
        builder.append("</table>\n");
        builder.append("<hr><address>").append(author).append("</address>");
        builder.append("</body></html>\n");
        return builder.toString();
    }
}
