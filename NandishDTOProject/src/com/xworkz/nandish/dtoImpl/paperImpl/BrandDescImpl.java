package com.xworkz.nandish.dtoImpl.paperImpl;

import com.xworkz.nandish.dto.PaperDTO;

import java.util.Comparator;

public class BrandDescImpl implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        String f1 = o1.getBrandName();
        String f2 = o2.getBrandName();
        return f2.compareTo(f1);
    }
}
