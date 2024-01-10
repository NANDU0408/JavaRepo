package com.xworkz.nandish.dtoImpl.paperImpl;

import com.xworkz.nandish.dto.PaperDTO;

import java.util.Comparator;

public class CostAscImpl implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        double f1 = o1.getCost();
        double f2 = o2.getCost();
        return Double.compare(f1,f2);
    }
}
