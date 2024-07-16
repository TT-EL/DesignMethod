package org.example.P15Facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 面对复杂的Database、HtmlWriter类，PageMaker提供了一个窗口来给外部使用
 */
public class PageMaker {
    // 防止外部生成实例
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailAddress, String filename) {
        try {
            Properties mailProp = Database.getProperties("maildata");
            String username = mailProp.getProperty(mailAddress);
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(filename));
            htmlWriter.title("Welcome to " + username + "'s page!");
            htmlWriter.paragraph("Waiting for you email");
            htmlWriter.mailto(mailAddress, username);
            htmlWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
