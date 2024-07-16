package org.example.P8AbstractFactory.tableFactory;

import org.example.P8AbstractFactory.factory.Page;

public class TablePage extends Page {

    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();

        builder.append("<html><head><meta charset=\"UTF-8\"><title>").append(title).append("</title></head>\n");
        builder.append("<body>\n");
        builder.append("<h2>").append(title).append("</h2>");
        builder.append("<table width=\"80%\" border=\"3\">\n");

        content.forEach(item -> builder.append(item.makeHTML()));

        builder.append("</table>\n");

        builder.append("<hr><address>").append(author).append("</address>");
        builder.append("</body></html>\n");
        return builder.toString();
    }
}
