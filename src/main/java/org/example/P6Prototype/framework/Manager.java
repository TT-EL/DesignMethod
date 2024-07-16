package org.example.P6Prototype.framework;

import java.util.HashMap;

public class Manager {
    private HashMap<String, Product> showcase = new HashMap<>();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    // 通过已有的进行复制
    public Product create(String name) {
        Product p = showcase.get(name);
        return p.createClone();
    }
}
