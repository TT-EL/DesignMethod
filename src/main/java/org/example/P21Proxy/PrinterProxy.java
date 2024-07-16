package org.example.P21Proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PrinterProxy implements Printable {

    private String name;

    // 代理的对象(根据21-1习题有修改)
    private Printable printer;

    private String printerName;

    public PrinterProxy(String name, String printerName) {
        this.name = name;
        this.printerName = printerName;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (printer != null) {
            printer.setPrinterName(name);
        }

        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    /**
     * 代理的print方法，在实例化代理的对象之后，调用代理的对象的print方法
     *
     * @param msg 消息
     */
    @Override
    public void print(String msg) {
        realize(); // 先实例化
        printer.print(msg);
    }

    /**
     * 实例化代理的对象
     */
    private synchronized void realize() {
        if (printer == null) {
            try {
                // 在没有写出Printer的无参的构造函数时，先生成Constructor对象，再newInstance
                Constructor c = Class.forName(printerName).getConstructor(String.class);
                printer = (Printable) c.newInstance(name);
            } catch (ClassNotFoundException e) {
                System.out.println("Class not found " + e);
            } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                     InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
