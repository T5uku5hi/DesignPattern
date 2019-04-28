package abstract_factory.list_factory;

import abstract_factory.factory.Link;

public class ListLink extends Link {

    ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <li><a href =\"" + url + "\">" + caption + "</a></li>\n";
    }
}
