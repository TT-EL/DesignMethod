package org.example.P8AbstractFactory.listFactory;

import org.example.P8AbstractFactory.factory.Page;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();

        builder.append("<html><head><meta charset=\"UTF-8\"><title>").append(title).append("</title></head>\n");
        builder.append("<body>\n");
        builder.append("<h1>").append(title).append("</h1>\n");
        builder.append("<ul>\n");

        content.forEach(item -> builder.append(item.makeHTML()));

        builder.append("</ul>\n");
        builder.append("<hr><address>").append(author).append("</address>");
        builder.append("</body></html>\n");
        return builder.toString();
    }
}
