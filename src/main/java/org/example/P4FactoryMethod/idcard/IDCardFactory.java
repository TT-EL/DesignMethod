package org.example.P4FactoryMethod.idcard;

import org.example.P4FactoryMethod.Main;
import org.example.P4FactoryMethod.framework.Factory;
import org.example.P4FactoryMethod.framework.Product;

import java.util.*;

public class IDCardFactory extends Factory {

    private final Map<String, Integer> owners = new HashMap<>();

    @Override
    public Product createProduct(String owner) {
        Random random = new Random();
        int id = random.nextInt(100);
        System.out.printf("[%d] %s: Create Card\n", id, owner);
        return new IDCard(owner, id);
    }

    @Override
    public void registerProduct(Product p) {
        IDCard card = (IDCard) p;
        owners.put(card.getOwner(), card.getId());
    }
}
