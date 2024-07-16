package org.example.P18Memento;

import org.example.P18Memento.game.Gamer;
import org.example.P18Memento.game.Memento;

import java.io.*;
import java.util.Objects;
import java.util.zip.DeflaterInputStream;
import java.util.zip.DeflaterOutputStream;

public class Main {

    private static final String FILE_PATH = "/Users/yson/code/DesignMethod/src/main/java/org/example/P18Memento/game/game.dat";

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);

        Memento memento = loadMemento();
        if(Objects.isNull(memento)) {
            memento = gamer.createMemento();
        }

        // Memento memento = gamer.createMemento(); // 保存初始的状态
        for (int i = 0; i < 100; i++) {
            System.out.println("===== " + i);
            System.out.println("Current state: " + gamer);

            gamer.bet(); // 投掷骰子

            // 金钱增加 保存快照
            if (gamer.getMoney() > memento.getMoney()) {
                memento = gamer.createMemento();
                saveMemento(memento);
                System.out.println("[Create]");
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                gamer.restoreMemento(memento);
                System.out.println("[Restore]");
            }
        }
    }

    public static Memento loadMemento() {
        Memento memento = null;
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new DeflaterInputStream(new FileInputStream(FILE_PATH)));
            memento = (Memento) inputStream.readObject();
            inputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return memento;
    }

    public static void saveMemento(Memento memento) {
        try {
            // DeflaterOutputStream 在输出时增加压缩
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new DeflaterOutputStream(new FileOutputStream(FILE_PATH)));
            objectOutputStream.writeObject(memento);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
