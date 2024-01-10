package com.xworkz.nandish.dtoImpl.refillImpl;

import com.xworkz.nandish.dto.RefillDTO;
import com.xworkz.nandish.dtoRunner.RefillRunner;

import java.util.Comparator;

public class QuantityDescImpl implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        int f1 = o1.getQuantity();
        int f2 = o2.getQuantity();
        return Integer.compare(f2,f1);
    }
}
