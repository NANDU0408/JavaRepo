package com.xworkz.nandish.dtoImpl.charcoalImpl;

import com.xworkz.nandish.dto.CharcoalDTO;

import java.util.Comparator;

public class QuantityAscImpl implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        int f1 = o1.getQuantity();
        int f2 = o2.getQuantity();
        return Integer.compare(f1,f2);
    }
}

