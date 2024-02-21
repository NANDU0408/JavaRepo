package com.xworkz.nandish.comparable.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Land {
    public static void main(String[] args) {
        Map<String,String> land = new HashMap<>();
        land.put("Residential Land","Vikas");
        land.put("Commercial Land","Ram");
        land.put("Industrial Land","Seetha");
        land.put("Agricultural Land","Radha");
        land.put("Commercial Residential Mixed-Use Land","Krishna");
        land.put("Recreational Land","Lakshmi");

        System.out.println("Printing Set Of Keys");
        Set<String> key = land.keySet();
        key.forEach(System.out::println);

        System.out.println();
        System.out.println("Printing Collection Of Values");
        Collection<String> value = land.values();
        value.forEach(System.out::println);

        System.out.println();
        System.out.println("Printing both key and value");
        Set<Map.Entry<String,String>> entrySet = land.entrySet();
        for (Map.Entry<String,String> entry : entrySet){
            String key1 = entry.getKey();
            String value1 = entry.getValue();
            System.out.println("Land: " + key1 + ", Owner: " + value1);
        }
    }
}
