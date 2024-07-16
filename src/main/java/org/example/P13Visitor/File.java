package org.example.P13Visitor;

public class File extends Entry {

    private Integer size;

    public File(String name, Integer size) {
        super(name);
        this.size = size;
    }

    @Override
    public Integer getSize() {
        return this.size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }

    @Override
    protected void printFullPath(String prefix) {
        System.out.println(prefix + "/" + getName());
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this); // 告诉Visitor正在访问的是File对象
    }
}
