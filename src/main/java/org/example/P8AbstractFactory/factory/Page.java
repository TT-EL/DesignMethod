package org.example.P8AbstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

// Page 是抽象的“产品”类
public abstract class Page {

    protected String title;

    protected String author;

    /**
     * 存放页面中的元素
     */
    protected List<Item> content = new ArrayList<>();

    /**
     * 页面产品构造函数
     *
     * @param title  页面标题
     * @param author 页面作者
     */
    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    /**
     * 增加元素
     *
     * @param item HTML元素
     */
    public void add(Item item) {
        content.add(item);
    }

    /**
     * 实现默认的结果输出方法
     */
    public void output() {
        try {
            String filename = "/Users/yson/code/DesignMethod/src/main/java/org/example/P8AbstractFactory/" + title + ".html";
            Writer writer = new FileWriter(filename);
            writer.write(this.makeHTML()); // 这里调用makeHTML方法，将内容写入文件
            writer.close();
            System.out.println("Compile Done.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
