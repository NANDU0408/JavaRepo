package com.xworkz.nandish.lambdaComparator.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Eatables {
    public static void main(String[] args) {
        Map<String,String[]> food = new HashMap<>();
        String[] samosaIngredients = {"Oil,","Maida,","potato,","pepper"};
        food.put("Samosa",samosaIngredients);
        String[] parotaIngredients = {"Oil,","Maida,","potato,","pepper"};
        food.put("Parota",parotaIngredients);
        String[] upmaIngredients = {"Oil,","Rava,","onion,","chilli"};
        food.put("Upma",upmaIngredients);
        String[] paneerChatIngredients = {"Paneer,","garamMasala,","Cabbage,","pepper"};
        food.put("PaneerChat",paneerChatIngredients);
        String[] jalebhiIngredients = {"Oil,","Maida,","jaggery,","sugerLime"};
        food.put("Jalebhi",jalebhiIngredients);
        String[] saladIngredients = {"MustardOil,","Vegitables,","chatMasala,","pepper"};
        food.put("Salad",saladIngredients);

        System.out.println();
        System.out.println("Printing Set of Keys");
        Set<String> key = food.keySet();
        key.forEach(System.out::println);

        System.out.println();
        System.out.println("Printing Collection of Values");
        Collection<String[]> values = food.values();
        for (String[] value : values) {
            for (String ingredient : value) {
                System.out.print(ingredient + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Printing both key and value");
        Set<Map.Entry<String, String[]>> entrySet = food.entrySet();
        for (Map.Entry<String, String[]> entry : entrySet) {
            String key1 = entry.getKey();
            String[] value1 = entry.getValue();
            System.out.print("Food: " + key1 + ", Ingredients: ");
            for (String ingredient : value1) {
                System.out.print(ingredient + " ");
            }
            System.out.println();
        }
    }
}
