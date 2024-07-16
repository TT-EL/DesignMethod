package org.example.P8AbstractFactory.listFactory;

import org.example.P8AbstractFactory.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append("<li>\n");
        builder.append(caption).append("</li>");
        builder.append("<ul>\n");

        trays.forEach(tray -> builder.append(tray.makeHTML()));// 调用每个元素的makeHTML方法，如果List中的元素是Tray，则会继续向下调用makeHTML方法

        builder.append("</ul>\n");
        builder.append("</li>\n");
        return builder.toString();
    }
}
