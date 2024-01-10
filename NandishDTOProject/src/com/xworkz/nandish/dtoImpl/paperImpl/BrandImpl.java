package com.xworkz.nandish.dtoImpl.paperImpl;

import com.xworkz.nandish.dto.PaperDTO;
import com.xworkz.nandish.dto.SensorDTO;

import java.util.Comparator;

public class BrandImpl implements Comparator<PaperDTO> {
    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        String f1 = o1.getBrandName();
        String f2 = o2.getBrandName();
        return f1.compareTo(f2);
    }
}
