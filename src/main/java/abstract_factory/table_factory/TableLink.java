package abstract_factory.table_factory;

import abstract_factory.factory.Link;

public class TableLink extends Link {

    TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
