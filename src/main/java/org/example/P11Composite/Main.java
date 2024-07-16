package org.example.P11Composite;

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
            rootDir.printList("");

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
            rootDir.printList("");

            System.out.println();
            rootDir.printFullPath("");

        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
