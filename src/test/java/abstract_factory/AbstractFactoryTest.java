package abstract_factory;

import abstract_factory.factory.Factory;
import abstract_factory.factory.Link;
import abstract_factory.factory.Page;
import abstract_factory.factory.Tray;
import org.junit.jupiter.api.Test;

class AbstractFactoryTest {

    @Test
    void ListFactoryTest() {
        Factory factory = Factory.getFactory("abstract_factory.list_factory.ListFactory");
        Link asahi = factory.createLink("朝日新聞", "https://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞", "https://www.yomiuri.co.jp/");
        Link usYahoo = factory.createLink("Yahoo!", "https://www.yahoo.com/");
        Link jpYahoo = factory.createLink("Yahoo!Japan", "https://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "https://www.excite.co.jp/");
        Link google = factory.createLink("Google", "https://www.google.com/");

        Tray trayNews = factory.createTray("新聞");
        trayNews.add(asahi);
        trayNews.add(yomiuri);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(usYahoo);
        trayYahoo.add(jpYahoo);

        Tray traySearch = factory.createTray("検索エンジン");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "tsukushi");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }

    @Test
    void TableFactoryTest() {
        Factory factory = Factory.getFactory("abstract_factory.table_factory.TableFactory");
        Link asahi = factory.createLink("朝日新聞", "https://www.asahi.com/");
        Link yomiuri = factory.createLink("読売新聞", "https://www.yomiuri.co.jp/");
        Link usYahoo = factory.createLink("Yahoo!", "https://www.yahoo.com/");
        Link jpYahoo = factory.createLink("Yahoo!Japan", "https://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "https://www.excite.co.jp/");
        Link google = factory.createLink("Google", "https://www.google.com/");

        Tray trayNews = factory.createTray("新聞");
        trayNews.add(asahi);
        trayNews.add(yomiuri);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(usYahoo);
        trayYahoo.add(jpYahoo);

        Tray traySearch = factory.createTray("検索エンジン");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("TablePage", "tsukushi");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}
