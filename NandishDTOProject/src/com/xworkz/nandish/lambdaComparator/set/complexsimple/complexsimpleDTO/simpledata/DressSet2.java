package com.xworkz.nandish.comparable.set.complexsimple.complexsimpleDTO.simpledata;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DressSet2 {
    public static void main(String[] args) {
        Map<String, String> dressSet = new HashMap<>();
        dressSet.put("Crew Neck T-shirt", "Nike");
        dressSet.put("V-neck T-shirt", "Adidas");
        dressSet.put("Henley T-shirt", "Under Armour");
        dressSet.put("Polo Shirt", "Levi's");
        dressSet.put("Ringer T-shirt", "Levi's");
        dressSet.put("Long Sleeve T-shirt", "Levi's");

        // 1. size
        System.out.println("Map Size: " + dressSet.size());
        System.out.println("===================");

        // 2. isEmpty
        System.out.println("Is Map Empty? " + dressSet.isEmpty());
        System.out.println("===================");

        // 3. containsKey
        String keyToCheck = "Polo Shirt";
        System.out.println("Does Map contain key '" + keyToCheck + "'? " + dressSet.containsKey(keyToCheck));
        System.out.println("===================");

        // 4. containsValue
        String valueToCheck = "Adidas";
        System.out.println("Does Map contain value '" + valueToCheck + "'? " + dressSet.containsValue(valueToCheck));
        System.out.println("===================");

        // 5. get
        String brandOfShirt = dressSet.get("V-neck T-shirt");
        System.out.println("Brand of 'V-neck T-shirt': " + brandOfShirt);
        System.out.println("===================");

        // 6. put
        dressSet.put("Sleeveless Shirt", "Puma");
        System.out.println("Map after adding a new entry: " + dressSet);
        System.out.println("===================");

        // 7. remove
        String shirtToRemove = "Ringer T-shirt";
        String removedBrand = dressSet.remove(shirtToRemove);
        System.out.println("Removed Shirt: " + shirtToRemove + ", Removed Brand: " + removedBrand);
        System.out.println("Map after removing entry: " + dressSet);
        System.out.println("===================");

        // 8. putAll
        Map<String, String> additionalDressSet = new HashMap<>();
        additionalDressSet.put("Sweatshirt", "Gap");
        additionalDressSet.put("Hoodie", "H&M");
        dressSet.putAll(additionalDressSet);
        System.out.println("Map after adding all entries from additional map: " + dressSet);
        System.out.println("===================");

        // 9. keySet
        Set<String> keys = dressSet.keySet();
        System.out.println("All Keys in the Map: " + keys);
        System.out.println("===================");

        // 10. values
        Collection<String> values = dressSet.values();
        System.out.println("All Values in the Map: " + values);
        System.out.println("===================");

        // 11. entrySet
        Set<Map.Entry<String, String>> entrySet = dressSet.entrySet();
        System.out.println("Printing both key and value using entrySet");
        for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Shirt: " + key + ", Brand: " + value);
        }
        System.out.println("===================");

        // 12. clear
        dressSet.clear();
        System.out.println("Map after clearing all entries: " + dressSet);
        System.out.println("===================");
    }
}
