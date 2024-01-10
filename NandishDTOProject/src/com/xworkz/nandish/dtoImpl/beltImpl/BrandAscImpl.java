package com.xworkz.nandish.dtoImpl.beltImpl;

import com.xworkz.nandish.dto.BeltDTO;

import java.util.Comparator;

public class BrandAscImpl implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        String f1 = o1.getBrand();
        String f2 = o2.getBrand();
        return f1.compareTo(f2);
    }
}
