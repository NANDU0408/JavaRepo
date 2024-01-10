package com.xworkz.nandish.dtoImpl.beltImpl;

import com.xworkz.nandish.dto.BeltDTO;

import java.util.Comparator;

public class CostDescImpl implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        Double f1 = o1.getCost();
        Double f2 = o2.getCost();
        return Double.compare(f2,f1);
    }
}
