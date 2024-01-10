package com.xworkz.nandish.dtoImpl.sparkPlugImpl;

import com.xworkz.nandish.dto.SparkPlugDTO;

import java.util.Comparator;

public class WarrantyDescImpl implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        int f1 = o1.getWarranty();
        int f2 = o2.getWarranty();
        return Integer.compare(f2,f1);
    }
}
