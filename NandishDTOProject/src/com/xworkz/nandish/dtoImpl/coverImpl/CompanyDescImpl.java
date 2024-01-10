package com.xworkz.nandish.dtoImpl.coverImpl;

import com.xworkz.nandish.dto.CoverDTO;

import java.util.Comparator;

public class CompanyDescImpl implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        String f1 = o1.getCompany();
        String f2 = o2.getCompany();
        return f2.compareTo(f1);
    }
}
