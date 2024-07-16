package org.example.P13Visitor;


public class Main {
    public static void main(String[] args) {
        try {
            Directory rootDir = new Directory("root");
            Directory binDir = new Directory("bin");
            Directory tmpDir = new Directory("tmp");
            Directory usrDir = new Directory("usr");
            rootDir.add(binDir);
            rootDir.add(tmpDir);
            rootDir.add(usrDir);
            binDir.add(new File("vi", 10000));
            binDir.add(new File("sed", 20000));
            // rootDir.printList("");
            rootDir.accept(new ListVisitor());

            System.out.println();

            Directory tom = new Directory("tom");
            Directory jerry = new Directory("jerry");
            Directory cook = new Directory("cook");
            tom.add(new File("diary.html", 394));
            tom.add(new File("a.java", 2303));
            jerry.add(new File("meat", 3000));
            cook.add(new File("tool", 20393));
            usrDir.add(tom);
            usrDir.add(jerry);
            usrDir.add(cook);
            // rootDir.printList("");
            rootDir.accept(new ListVisitor());

            // 习题13-1
            System.out.println();
            rootDir.accept(new FileFindVisitor(".html"));

            // 习题13-2
            System.out.println();
            rootDir.accept(new ListVisitor());

            // 习题13-3
            System.out.println("Excise13-3");
            ElementArrayList list = new ElementArrayList();
            list.add(rootDir);
            list.add(new File("nginx.conf", 123));
            list.accept(new ListVisitor());

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
