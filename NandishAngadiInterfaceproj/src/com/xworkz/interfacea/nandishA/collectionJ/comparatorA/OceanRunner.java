package com.xworkz.interfacea.nandishA.collectionJ.comparatorA;

import com.xworkz.interfacea.nandishA.collectionJ.comparatorBoot.Ocean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OceanRunner {
    public static void main(String[] args) {
        List<String> ocean = new ArrayList<>();
        ocean.add("Dolphines");
        ocean.add("Golden Fishes");
        ocean.add("Jelly Fishes");
        ocean.add("Barmoda Triangle");
        ocean.add("Titanic Sink");
        ocean.add("High Depth");
        ocean.add("High Salt");
        ocean.add("Red Color");
        ocean.add("Black Color");
        ocean.add("Not Depth");
        Collections.sort(ocean);
        System.out.println("In ascending order: ");
        for (String ref:ocean){
            System.out.println(ref);
        }
        System.out.println();

        Comparator<String> comparator = new Ocean();
        Collections.sort(ocean,comparator);
        System.out.println("In descending order: ");
        for (String ref : ocean){
            System.out.println(ref);
        }
    }
}
