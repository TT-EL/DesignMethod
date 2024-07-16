package org.example.P13Visitor;

import java.util.Iterator;

/**
 * 习题13-1
 */
public class FileFindVisitor extends Visitor{

    private String currentDir = "";

    private final String suffix;

    public FileFindVisitor(String suffix) {
        this.suffix = suffix;
    }

    @Override
    public void visit(File file) {
        // 配合suffix作为处理条件
        if(file.getName().endsWith(suffix)) {
            System.out.println(currentDir + "/" + file);
        }
    }

    @Override
    public void visit(Directory directory) {
        String saveDir = currentDir; // 暂存 递归压栈
        currentDir = currentDir + "/" + directory.getName();
        Iterator<Entry> it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = it.next();
            entry.accept(this);
        }
        currentDir = saveDir; // 退栈 恢复
    }
}
