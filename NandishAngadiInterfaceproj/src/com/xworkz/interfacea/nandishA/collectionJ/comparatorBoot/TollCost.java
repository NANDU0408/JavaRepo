package com.xworkz.interfacea.nandishA.collectionJ.comparatorBoot;

import java.util.Comparator;

public class TollCost implements Comparator<Double> {

    @Override
    public int compare(Double o1, Double o2) {
        int tollCostNo= o2.compareTo(o1);
        return tollCostNo;
    }
}
