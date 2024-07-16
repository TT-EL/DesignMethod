package org.example.P2Adapter.BaseExtend;

public class PrintBanner extends Banner implements Print {

    // 这里直接继承了 banner 拥有变量和方法
    // 在构造函数直接使用父构造函数
    public PrintBanner(String text) {
        super(text);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
