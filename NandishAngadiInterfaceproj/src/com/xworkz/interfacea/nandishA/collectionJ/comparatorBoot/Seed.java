package com.xworkz.interfacea.nandishA.collectionJ.comparatorBoot;

import java.util.Comparator;

public class Seed implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int varNo = o2.compareTo(o1);
        return varNo;
    }
}
