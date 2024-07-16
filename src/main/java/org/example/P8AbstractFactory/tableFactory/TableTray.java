package org.example.P8AbstractFactory.tableFactory;

import org.example.P8AbstractFactory.factory.Tray;

public class TableTray extends Tray {

    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();

        builder.append("<td>");
        builder.append("<table width=\"100%\" border=\"1\"><tr>");
        builder.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"").append(trays.size());
        builder.append("\"><b>").append(caption).append("</b></td>");
        builder.append("</tr>\n");
        builder.append("<tr>\n");

        trays.forEach(tray -> builder.append(tray.makeHTML()));

        builder.append("</tr></table>");
        builder.append("</td>");

        return builder.toString();
    }
}
