package org.example.P8AbstractFactory.tableFactory;

import org.example.P8AbstractFactory.factory.Link;

public class TableLink extends Link {

    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\""+ url + "\">" + caption +"</a></td>\n";
    }
}
