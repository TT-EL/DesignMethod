package org.example.P11Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry{

    private final List<Entry> entryList;

    public Directory(String name) {
        super(name);
        this.entryList = new ArrayList<>();
    }

    @Override
    public Integer getSize() {
        Integer sum = 0;
        for (Entry entry: entryList) {
            sum += entry.getSize();
        }

        return sum;
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
}
