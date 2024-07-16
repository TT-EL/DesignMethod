package org.example.P7Builder;

public class Main {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder); // 这里传入的是实现了Builder抽象方法的子类/接口实现类
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);

        HTMLBuilder htmlBuilder = new HTMLBuilder("Greeting");
        Director director2 = new Director(htmlBuilder);
        director2.construct();
        String result2 = htmlBuilder.getResult();
        System.out.println(result2);
    }
}
