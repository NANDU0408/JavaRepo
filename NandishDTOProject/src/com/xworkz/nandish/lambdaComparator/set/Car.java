package com.xworkz.nandish.lambdaComparator.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Car {
    public static void main(String[] args) {
        Map<String,Integer> car = new HashMap<>();
        car.put("G-Wagon",2019);
        car.put("Skoda",2016);
        car.put("Ferrari",2019);
        car.put("Lamborghini",2011);
        car.put("Swift",2016);
        car.put("Maruthi",2009);

        System.out.println("Printing Set of Key");
        Set<String> key = car.keySet();
        key.forEach(System.out::println);

        System.out.println();
        System.out.println("Printing Collection of Value");
        Collection<Integer> value = car.values();
        value.forEach(System.out::println);

        System.out.println();
        System.out.println("Printing both keys and values");
        Set<Map.Entry<String,Integer>> entrySet = car.entrySet();
        for (Map.Entry<String,Integer> entry : entrySet){
            String key1 = entry.getKey();
            Integer value1 = entry.getValue();
            System.out.println("Car :" + key1 + ", Model :" + value1);
        }
    }
}
