package com.xworkz.nandish.dtoImpl.charcoalImpl;

import com.xworkz.nandish.dto.CharcoalDTO;

import java.util.Comparator;

public class CostAscImpl implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        double f1 = o1.getCost();
        double f2 = o2.getCost();
        return Double.compare(f1,f2);
    }
}
