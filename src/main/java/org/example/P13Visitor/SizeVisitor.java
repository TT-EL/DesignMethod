package org.example.P13Visitor;

import java.util.Iterator;

/**
 * 习题13-2
 */
public class SizeVisitor extends Visitor {

    private int size = 0;

    public int getSize() {
        return size;
    }

    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    /**
     * 在遍历时计算文件夹的大小
     *
     * @param directory 文件夹对象
     */
    @Override
    public void visit(Directory directory) {
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
    }
}
