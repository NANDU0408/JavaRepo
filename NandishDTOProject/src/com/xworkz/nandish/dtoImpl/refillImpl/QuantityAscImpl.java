package com.xworkz.nandish.dtoImpl.refillImpl;

import com.xworkz.nandish.dto.RefillDTO;

import java.util.Comparator;

public class QuantityAscImpl implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        int f1 = o1.getQuantity();
        int f2 = o2.getQuantity();
        return Integer.compare(f1,f2);
    }
}
