package com.xworkz.nandish.dtoImpl.sparkPlugImpl;

import com.xworkz.nandish.dto.SparkPlugDTO;

import java.util.Comparator;

public class CostAscImpl implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        double f1 = o1.getCost();
        double f2 = o2.getCost();
        return Double.compare(f1,f2);
    }
}
