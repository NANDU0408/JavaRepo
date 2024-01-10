package com.xworkz.nandish.dtoImpl.paperImpl;

import com.xworkz.nandish.dto.PaperDTO;

import java.util.Comparator;

public class QuantityDescImpl implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        int f1 = o1.getQuantity();
        int f2 = o2.getQuantity();
        return Integer.compare(f2,f1);
    }
}
