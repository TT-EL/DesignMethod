package org.example.P21Proxy;

public class Printer implements Printable{

    private String name;

    public Printer() {
        heavyJob();
    }

    public Printer(String name) {
        this.name = name;
        heavyJob();
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String msg) {
        System.out.println("==== " + name + " ====");
        System.out.println(msg);
    }

    private void heavyJob() {
        System.out.println("Instance Generating...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Instance Created");
    }
}
