package org.example.P8AbstractFactory.tableFactory;

import org.example.P8AbstractFactory.factory.Factory;
import org.example.P8AbstractFactory.factory.Link;
import org.example.P8AbstractFactory.factory.Page;
import org.example.P8AbstractFactory.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
