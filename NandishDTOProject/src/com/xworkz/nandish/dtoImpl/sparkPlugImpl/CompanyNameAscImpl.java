package com.xworkz.nandish.dtoImpl.sparkPlugImpl;

import com.xworkz.nandish.dto.SparkPlugDTO;

import java.util.Comparator;

public class CompanyNameAscImpl implements Comparator<SparkPlugDTO> {
    @Override
    public int compare(SparkPlugDTO o1, SparkPlugDTO o2) {
        String f1 = o1.getCompanyName();
        String f2 = o2.getCompanyName();
        return f1.compareTo(f2);
    }
}
