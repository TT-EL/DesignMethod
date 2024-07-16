package org.example.P11Composite;

/**
 * 表示目录条目的抽象类
 */
public abstract class Entry {

    private String name;

    public Entry(String name) {
        this.name = name;
    }

    /**
     * 向目录条目中增加条目，在Directory子类中将重写此方法，File子类直接调用将抛出错误
     *
     * @param entry 目录条目
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    // 默认方法

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }

    // 抽象方法
    public abstract Integer getSize();

    protected abstract void printList(String prefix);

    //习题11-2
    protected abstract void printFullPath(String prefix);
}
