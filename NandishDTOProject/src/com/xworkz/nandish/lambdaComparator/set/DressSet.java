package com.xworkz.nandish.lambdaComparator.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DressSet {
    public static void main(String[] args) {
        Map<String, String> dressSet = new HashMap<>();
        dressSet.put("Crew Neck T-shirt", "Nike");
        dressSet.put("V-neck T-shirt", "Adidas");
        dressSet.put("Henley T-shirt", "Under Armour");
        dressSet.put("Polo Shirt", "Levi's");
        dressSet.put("Ringer T-shirt", "Levi's");
        dressSet.put("Long Sleeve T-shirt", "Levi's");

        System.out.println("Printing Set of keys");
        Set<String> key = dressSet.keySet();
        key.forEach(System.out::println);

        System.out.println();
        System.out.println("Printing Collection of values");
        Collection<String> value = dressSet.values();
        value.forEach(System.out::println);

        System.out.println();
        System.out.println("Printing both key and value");
        Set<Map.Entry<String, String>> entrySet = dressSet.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key1 = entry.getKey();
            String value1 = entry.getValue();
            System.out.println("Shirt: " + key1 + ", Brand: " + value1);
        }
    }
}
