package facade.pagemaker;

import java.io.FileWriter;
import java.util.Properties;

public class PageMaker {

    private PageMaker() {}

    public static void makeWelcomePage(String mailAddr, String fileName) {
        try {
            Properties mailProp = Database.getProperties("maildata");
            String userName = mailProp.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Welcome to " + userName + "'s page!");
            writer.paragraph(userName + "のページへようこそ！");
            writer.paragraph("メール待っていますね");
            writer.mailTo(mailAddr, fileName);
            writer.close();
            System.out.println(fileName + " is created for " + mailAddr + "(" + userName + ")");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String fileName) {
        try {
            Properties mailProp = Database.getProperties("maildata");
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Link Page");
            mailProp.stringPropertyNames().forEach(StreamHelper.throwingConsumer(key -> {
                writer.mailTo(key, mailProp.getProperty(key));
            }));
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}