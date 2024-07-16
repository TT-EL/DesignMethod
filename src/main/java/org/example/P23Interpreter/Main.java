package org.example.P23Interpreter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/yson/code/DesignMethod/src/main/java/org/example/P23Interpreter/miniprogram/program.txt"));
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                System.out.println("text=\"" + text +"\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node= "+node);
            }
        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
