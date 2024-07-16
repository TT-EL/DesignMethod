package org.example.P7Builder;

public class TextBuilder implements Builder{

    private final StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        stringBuffer.append("==========================\n");
        stringBuffer.append("【").append(title).append("】\n");
        stringBuffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        stringBuffer.append('#').append(str).append("\n");
        stringBuffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String str : items) {
            stringBuffer.append(" -").append(str).append("\n");
        }
        stringBuffer.append("\n");
    }

    @Override
    public void close() {
        stringBuffer.append("======================");
    }

    public String getResult() {
        return stringBuffer.toString();
    }
}
