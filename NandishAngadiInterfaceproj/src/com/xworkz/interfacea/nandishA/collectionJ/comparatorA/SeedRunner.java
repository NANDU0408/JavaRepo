package com.xworkz.interfacea.nandishA.collectionJ.comparatorA;

import com.xworkz.interfacea.nandishA.collectionJ.comparatorBoot.Seed;

import java.util.*;


public class SeedRunner {
    public static void main(String[] args) {

            List<String> seed = new ArrayList<>();
            seed.add("Sunflower seeds");
            seed.add("Pumpkin seeds");
            seed.add("Tomato seeds");
            seed.add("Watermelon seeds");
            seed.add("Basil seeds");
            seed.add("Mustard seeds");
            seed.add("Pea seeds");
            seed.add("Chia seeds");
            seed.add("Poppy seeds");
            seed.add("Quinoa seeds");
            Collections.sort(seed);
            System.out.println("Seed names in ascending order");
            for(String ref: seed){
                System.out.println(ref);
            }
        System.out.println();

            Comparator<String> comparator = new Seed();
            Collections.sort(seed,comparator);
            System.out.println("Seed names in descending order");
            for (String ref: seed ){
                System.out.println(ref);
            }
    }
}
