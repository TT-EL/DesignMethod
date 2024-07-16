package org.example.P13Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {

    private final List<Entry> entryList;

    public Directory(String name) {
        super(name);
        this.entryList = new ArrayList<>();
    }

    @Override
    public Integer getSize() {
//        Integer sum = 0;
//        for (Entry entry: entryList) {
//            sum += entry.getSize();
//        }
//
//        return sum;

        // 习题13-2
        SizeVisitor visitor = new SizeVisitor();
        accept(visitor); // 递归调用，遇到File就求和size，遇到Dir就简单用迭代器遍历文件夹下面的目录条目
        return visitor.getSize();
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+ "/" + this);
        for (Entry entry: entryList) {
            entry.printList(prefix + "/" + getName());
        }
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        entryList.add(entry);
        return this;
    }

    @Override
    protected void printFullPath(String prefix) {
        System.out.println(prefix + "/" + getName());
        for (Entry entry : entryList) {
            entry.printFullPath(prefix + "/" + getName());
        }
    }

    /**
     * 重写父类的iterator方法
     * @return 迭代器
     * @throws FileTreatmentException
     */
    @Override
    public Iterator<Entry> iterator() throws FileTreatmentException {
        return entryList.iterator();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
