package com.xworkz.nandish.dtoImpl.waterPurifierImpl;

import com.xworkz.nandish.dto.WaterPurifierDTO;

import java.util.Comparator;

public class QuantityDescImpl implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        int f1 = o1.getQuantityInLtrs();
        int f2 = o2.getQuantityInLtrs();
        return Integer.compare(f2,f1);
    }
}
