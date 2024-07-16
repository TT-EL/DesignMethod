package org.example.P15Facade.pagemaker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Database {
    // 防治外部实例化
    private Database() {

    }

    public static Properties getProperties(String dbname) {
        String filename = "/Users/yson/code/DesignMethod/src/main/java/org/example/P15Facade/"+ dbname +".txt";
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(filename));
        } catch (FileNotFoundException e) {
            System.out.println("File not found: "+ dbname);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties;
    }
}
