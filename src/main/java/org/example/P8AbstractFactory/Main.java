package org.example.P8AbstractFactory;

import org.example.P8AbstractFactory.factory.Factory;
import org.example.P8AbstractFactory.factory.Link;
import org.example.P8AbstractFactory.factory.Page;
import org.example.P8AbstractFactory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        // 根据类名获取具体工厂，赋值给抽象工厂类型
        // Factory factory = Factory.getFactory("org.example.P8AbstractFactory.listFactory.ListFactory");
        Factory factory = Factory.getFactory("org.example.P8AbstractFactory.tableFactory.TableFactory");

        // 以下为面向抽象工厂API编程，在没有具体工厂实现之前也不会有报错

        Link people = factory.createLink("人民日报", "http://www.people.com.cn");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Link usYahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
        Link jpYahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.com.jp");
        Tray trayYahoo = factory.createTray("Yahoo");
        trayYahoo.add(usYahoo);
        trayYahoo.add(jpYahoo);

        Link excite = factory.createLink("Excite", "http://www.excite.com");
        Link google = factory.createLink("Google", "http://www.google.com");
        Tray traySearch = factory.createTray("Search");
        traySearch.add(trayYahoo); // Tray 内嵌 Tray
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("TablePage", "Tom");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}
