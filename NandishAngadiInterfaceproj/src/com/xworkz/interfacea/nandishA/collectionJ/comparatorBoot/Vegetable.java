package com.xworkz.interfacea.nandishA.collectionJ.comparatorBoot;

import java.util.Comparator;

public class Vegetable implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int vegetableNo = o2.compareTo(o1);
        return vegetableNo;
    }
}
