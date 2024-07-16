package org.example.P9Brige;

import java.io.*;

/**
 * 习题9-2
 */
public class FileDisplayImpl extends DisplayImpl{

    private final String filepath;

    private BufferedReader reader;

    public FileDisplayImpl(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void rawOpen() {
        File file = new File(filepath);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(
                    new FileInputStream(file));
            reader = new BufferedReader(inputStreamReader);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void rawPrint() {
        String line;
        try{
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void rawClose() {
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
