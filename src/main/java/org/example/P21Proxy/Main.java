package org.example.P21Proxy;

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice", "org.example.P21Proxy.Printer");
        System.out.println("Now name is: " + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("Now name is: " + p.getPrinterName());

        // 实例生成
        p.print("MSG");
    }
}
