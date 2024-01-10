package com.xworkz.nandish.dtoImpl.refillImpl;

import com.xworkz.nandish.dto.RefillDTO;

import java.util.Comparator;

public class PriceDescImpl implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        double f1 = o1.getPrice();
        double f2 = o2.getPrice();
        return Double.compare(f2,f1);
    }
}
