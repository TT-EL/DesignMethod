package org.example.P2Adapter.BaseExtend.Train2a2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * 扮演 adapter 角色 连接需求FileIO <--> java.util.Properties(被适配)
 */
public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String filename) throws IOException {
        InputStream is = Files.newInputStream(Paths.get(filename));
        load(is); // 使用 Properties 类的load方法，可以从一个流内读取并解析
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        OutputStream os = Files.newOutputStream(Paths.get(filename));

        // 使用 Properties 类的 store 方法，可以将属性集合写入OutputStream
        store(os, "Written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
