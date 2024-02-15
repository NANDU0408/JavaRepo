package com.xworkz.nandish.comparable.dtoRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.SplittableRandom;

public class ShoeBrandRunner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Nike");
        list.add("Lancer");
        list.add("Adidas");
        list.add("Puma");
        list.add("Rebook");
        list.add("Skechers");
        list.add("Vans");
        list.add("Brooks");
        list.add("Merrell");
        list.add("Fila");

        ListIterator<String> listIterator = list.listIterator();

        System.out.println("Forward Direction");
        while (listIterator.hasNext()){
            String ele = listIterator.next();
            System.out.println(ele);
        }
        System.out.println();

        listIterator = list.listIterator(list.size());
        System.out.println("Backward Direction");
        while (listIterator.hasPrevious()){
            String ele1 = listIterator.previous();
            System.out.println(ele1);
        }
        System.out.println();

        listIterator = list.listIterator(list.size()/2);
        System.out.println("Between Forward");
        while (listIterator.hasNext()){
            String ele2 = listIterator.next();
            System.out.println(ele2);
        }
        System.out.println();

        listIterator = list.listIterator(list.size()/2);
        System.out.println("Between Backward");
        while (listIterator.hasPrevious()){
            String ele3 = listIterator.previous();
            System.out.println(ele3);
        }
        System.out.println();

        listIterator = list.listIterator();
        System.out.println("Add Function");
        while (listIterator.hasNext()){
            if (listIterator.next().equals("Nike"))
            listIterator.add("Under Armour");
        }
        System.out.println(list);
        System.out.println();

        listIterator = list.listIterator();
        String elementToRemove = "Vans";
        System.out.println("Remove Function");
        while (listIterator.hasNext()){
            if (listIterator.next().equals(elementToRemove)){
                listIterator.remove();
            }
        }
        System.out.println(list);
        System.out.println();


        list.sort((w1, w2) -> w2.compareTo(w1));
        list.forEach(System.out::println);
    }
}
