package org.example.P2Adapter.BaseExtend.Train2a2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO fileIO = new FileProperties();

        try {
            fileIO.readFromFile("/Users/yson/code/DesignMethod/src/main/java/org/example/P2Adapter/BaseExtend/Train2a2/origin.txt");
            fileIO.setValue("year", "2004");
            fileIO.setValue("month", "7");
            fileIO.setValue("day", "4");
            fileIO.writeToFile("/Users/yson/code/DesignMethod/src/main/java/org/example/P2Adapter/BaseExtend/Train2a2/result.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
