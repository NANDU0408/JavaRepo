package com.xworkz.interfacea.nandishA.collectionJ.comparatorA;

import com.xworkz.interfacea.nandishA.collectionJ.comparatorBoot.Vegetable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VegetableRunner {
    public static void main(String[] args) {
        List<String> vegetable = new ArrayList<>();
        vegetable.add("Carrot");
        vegetable.add("Cabbage");
        vegetable.add("Potato");
        vegetable.add("Radish");
        vegetable.add("Cucumber");
        vegetable.add("LadiesFinger");
        vegetable.add("Onion");
        vegetable.add("BeetRoot");
        vegetable.add("Brinjal");
        vegetable.add("DrumSticks");
        Collections.sort(vegetable);
        System.out.println("Vegetables name in ascending order: ");
        for (String ref : vegetable){
            System.out.println(ref);
        }
        System.out.println();

        Comparator<String> comparator = new Vegetable();
        Collections.sort(vegetable,comparator);
        System.out.println("Vegetables name in descending order: ");
        for (String ref : vegetable){
            System.out.println(ref);
        }
    }
}
