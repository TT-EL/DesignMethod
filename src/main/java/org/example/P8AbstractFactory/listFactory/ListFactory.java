package org.example.P8AbstractFactory.listFactory;

import org.example.P8AbstractFactory.factory.Factory;
import org.example.P8AbstractFactory.factory.Link;
import org.example.P8AbstractFactory.factory.Page;
import org.example.P8AbstractFactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
