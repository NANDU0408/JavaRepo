package com.xworkz.interfacea.nandishA.collectionJ.comparatorBoot;

import java.util.Comparator;

public class Tree implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        int TreeAgeNo = o2.compareTo(o1);
        return TreeAgeNo;
    }
}
