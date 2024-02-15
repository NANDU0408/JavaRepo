package com.xworkz.nandish.comparable.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static javafx.scene.input.KeyCode.T;

public class OutdoorCampingItemsRunner {
    public static void main(String[] args) {
        List<String> outingItems = new ArrayList<>();
        outingItems.add("Tent");
        outingItems.add("TentPins");
        outingItems.add("campingBed");
        outingItems.add("waterBottle");
        outingItems.add("dineItems");
        outingItems.add("map");
        outingItems.add("shoes");
        outingItems.add("fishingRod");
        outingItems.add("firstAidKit");
        outingItems.add("surfer");

        //Finding all items which has 't' in it, and print it
       outingItems.stream().filter((e)->{
           return e.contains("t");
       }).forEach(System.out::println);
        System.out.println();

       //Sort all items in desc order
       List<String> sortedItem = outingItems.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
       sortedItem.forEach(System.out::println);
        System.out.println();

       //Find all items which has at least 5 characters, sort by desc order and print on console
        List<String> itemsWithAtLeast5Chars = outingItems.stream().filter(e->e.length()>=5).collect(Collectors.toList());
        System.out.println("Items with at least 5 characters:");
        itemsWithAtLeast5Chars.forEach(System.out::println);

        //Sorting filtered items in descending order
        List<String> sortedItem1 = itemsWithAtLeast5Chars.stream().sorted((s1,s2)-> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println("Sorted items in descending order (at least 5 characters):");
        sortedItem1.forEach(System.out::println);
        System.out.println();

        //Convert all items to upperCase and filter only which has 'a' and collect it

        List<String> upperCase = outingItems.stream().map(String::toUpperCase).filter(e->e.contains("A")).collect(Collectors.toList());
        System.out.println("Items in upperCase containing A:");
        upperCase.forEach(System.out::println);
        System.out.println();

        //find all items which has t and print the count

        double countEle = outingItems.stream().filter((e)-> e.contains("t")).count();
        System.out.println("Number of elements containing 't': "+countEle);
        System.out.println();

        //Find all items which has a and o and collect by sorting in asc order

        List<String> itemsWithAO = outingItems.stream().filter(e -> e.contains("a") && e.contains("o")).sorted().collect(Collectors.toList());
        System.out.println("Items containing 'a' and 'o', sorted in ascending order:");
        itemsWithAO.forEach(System.out::println);
    }
}
