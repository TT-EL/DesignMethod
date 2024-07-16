package org.example.P23Interpreter;

/**
 * 表示语法书的节点类
 */
public abstract class Node {

    public abstract void parse(Context context) throws ParseException;
}
