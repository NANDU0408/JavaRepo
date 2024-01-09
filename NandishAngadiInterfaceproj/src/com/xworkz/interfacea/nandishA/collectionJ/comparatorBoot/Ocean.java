package com.xworkz.interfacea.nandishA.collectionJ.comparatorBoot;

import java.util.Comparator;

public class Ocean implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int oceanNo = o2.compareTo(o1);
        return oceanNo;
    }
}
