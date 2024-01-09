package com.xworkz.interfacea.nandishA.collectionJ.comparatorA;

import com.xworkz.interfacea.nandishA.collectionJ.comparatorBoot.TollCost;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TollCostRunner {
    public static void main(String[] args) {
        List<Double> tollCost = new ArrayList<>();
        tollCost.add(51d);
        tollCost.add(67d);
        tollCost.add(110d);
        tollCost.add(45d);
        tollCost.add(71d);
        tollCost.add(65d);
        tollCost.add(44d);
        tollCost.add(77d);
        tollCost.add(75d);
        tollCost.add(41d);
        Collections.sort(tollCost);
        System.out.println("In ascending order: ");
        for (double ref: tollCost){
            System.out.println(ref);
        }

        System.out.println();

        Comparator<Double> comparator = new TollCost();
        Collections.sort(tollCost,comparator);
        System.out.println("In descending order");
        for (double ref: tollCost){
            System.out.println(ref);
        }
    }
}
