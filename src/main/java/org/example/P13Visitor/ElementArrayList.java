package org.example.P13Visitor;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 习题13-3
 */
public class ElementArrayList extends ArrayList<Element> implements Element {

    /*
    没有必要定义add方法，直接使用父类的add方法
        public boolean add(Element element) {

    }
     */


    @Override
    public void accept(Visitor v) {
        Iterator<Element> it = iterator(); // 使用父类的iterator方法
        while (it.hasNext()) {
            Element element = it.next();
            element.accept(v);
        }
    }
}
