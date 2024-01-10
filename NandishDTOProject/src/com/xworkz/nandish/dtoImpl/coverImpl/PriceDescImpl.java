package com.xworkz.nandish.dtoImpl.coverImpl;

import com.xworkz.nandish.dto.CoverDTO;

import java.util.Comparator;

public class PriceDescImpl implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        double f1 = o1.getPrice();
        double f2 = o2.getPrice();
        return Double.compare(f2,f1);
    }
}
