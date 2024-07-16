package org.example.P13Visitor;

import java.util.Iterator;

/**
 * 访问数据结构并显示元素一览
 */
public class ListVisitor extends Visitor{

    private String currentDir = "";

    /**
     * 实现了要对File类的处理，所有对File类的visit都转到这里
     * @param file File类实例
     */
    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }

    /**
     * 实现了要对Directory类的处理
     * @param directory Directory类实例
     */
    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
