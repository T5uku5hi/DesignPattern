package facade.pagemaker;

import org.junit.jupiter.api.Test;

class PageMakerTest {

    @Test
    void make_welcome_page_test() {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
    }

    @Test
    void make_link_page_test() {
        PageMaker.makeLinkPage("linkpage.html");
    }
}