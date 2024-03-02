package com.xworkz.nandish.lambdaComparator.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Television {
    public static void main(String[] args) {
        Map<String,String> tv = new HashMap<>();
        tv.put("Cathode Ray Tube (CRT) TVs","Onida");
        tv.put("LCD (Liquid Crystal Display) TVs","Samsung");
        tv.put("LED (Light Emitting Diode) TVs","Samsung");
        tv.put("OLED (Organic Light Emitting Diode) TVs","Onida");
        tv.put("Curved TVs","LG");
        tv.put("Smart TVs","MI");

        System.out.println("Printing Set of keys");
        Set<String> key = tv.keySet();
        key.forEach(System.out::println);

        System.out.println();
        System.out.println("Printing Collection of values");
        Collection<String> value = tv.values();
        value.forEach(System.out::println);

        System.out.println();
        System.out.println("Printing both key and value");
        Set<Map.Entry<String, String>> entrySet = tv.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            String key1 = entry.getKey();
            String value1 = entry.getValue();
            System.out.println("Television: " + key1 + ", Brand: " + value1);
        }
    }
}
