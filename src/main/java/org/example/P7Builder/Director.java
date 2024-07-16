package org.example.P7Builder;

public class Director {

    private final Builder builder;

    // 抽象类Builder不能实例化，所以这里传入的都是实现了Builder方法的子类
    // 习题6-1将抽象类更改成了接口类型
    public Director(Builder builder) {
        this.builder = builder;
    }

    // 实现一系列使用builder构造文档的流程
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("Morning to Afternoon");
        builder.makeItems(new String[]{
                "Good Morning",
                "Good Afternoon"
        });
        builder.makeString("Night");
        builder.makeItems(new String[]{
                "Good Night"
        });

        builder.close();
    }
}
