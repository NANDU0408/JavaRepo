package com.xworkz.nandish.dtoImpl.refillImpl;

import com.xworkz.nandish.dto.RefillDTO;

import java.util.Comparator;

public class BrandDescImpl implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        String f1 = o1.getBrand();
        String f2 = o2.getBrand();
        return f2.compareTo(f1);
    }
}
