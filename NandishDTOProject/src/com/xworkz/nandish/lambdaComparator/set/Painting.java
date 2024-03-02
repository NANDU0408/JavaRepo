package com.xworkz.nandish.lambdaComparator.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Painting {
    public static void main(String[] args) {
        Map<String, String> painting = new HashMap<>();
        painting.put("Load-Bearing Walls", "SkyBlue");
        painting.put("Non-Load-Bearing Walls", "Saffron");
        painting.put("Partition Walls", "SkyBlue");
        painting.put("Exterior Walls", "Red");
        painting.put("Interior Walls", "Violet");
        painting.put("Retaining Walls", "Blue");

        System.out.println("Printing Set of keys");
        Set<String> key = painting.keySet();
        key.forEach(System.out::println);


        System.out.println();
        System.out.println("Printing collection of values");
        Collection<String> values = painting.values();
        values.forEach(System.out::println);

        System.out.println();
        System.out.println("Printing both key and value");
        Set<Map.Entry<String, String>> entrySet = painting.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key1 = entry.getKey();
            String value1 = entry.getValue();
            System.out.println("Wall Type: " + key1 + ", Color: " + value1);

        }
    }
}
