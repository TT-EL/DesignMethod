package org.example.P2Adapter.BaseDelegate;

public class PrintBanner extends Print {

    // 由于 extends 只能单继承，所以这里把 banner 作为一个内置的字段
    // 有了内置的 banner 之后，就将动作的执行委托给它
    private final Banner banner;

    public PrintBanner(String text) {
        this.banner = new Banner(text);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
