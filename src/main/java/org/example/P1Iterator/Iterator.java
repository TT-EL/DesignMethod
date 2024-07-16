package org.example.P1Iterator;

public interface Iterator {
    /**
     * Is there a next element
     *
     * @return exist state
     */
    public boolean haveNext();

    public Object next();
}
