package com.xworkz.nandish.dtoImpl.beltImpl;

import com.xworkz.nandish.dto.BeltDTO;

import java.util.Comparator;

public class CostAscImpl implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        double f1 = o1.getCost();
        double f2 = o2.getCost();
        return Double.compare(f1,f2);
    }
}
