package org.example.P12Decorator;

import java.util.ArrayList;
import java.util.List;

public class MultipleStringDisplay extends Display{

    private List<String> contents;

    private int maxLength;

    public MultipleStringDisplay() {
        contents = new ArrayList<>();
    }

    public void add(String text) {
        maxLength = Math.max(maxLength, text.length());
        contents.add(text);
    }

    @Override
    public int getColumns() {
        return maxLength;
    }

    @Override
    public int getRows() {
        return contents.size();
    }

    @Override
    public String getRowText(int row) {
        if(row >=0 && row < contents.size()) {
            StringBuilder stringBuilder = new StringBuilder(contents.get(row));
            for (int i = stringBuilder.length(); i < maxLength; i++) {
                stringBuilder.append(" ");
            }
            return stringBuilder.toString();
        } else {
            return null;
        }
    }
}
