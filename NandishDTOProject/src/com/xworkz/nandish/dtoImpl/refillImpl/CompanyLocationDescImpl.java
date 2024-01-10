package com.xworkz.nandish.dtoImpl.refillImpl;

import com.xworkz.nandish.dto.RefillDTO;

import java.util.Comparator;

public class CompanyLocationDescImpl implements Comparator<RefillDTO> {
    @Override
    public int compare(RefillDTO o1, RefillDTO o2) {
        String f1 = o1.getCompanyLocation();
        String f2 = o2.getCompanyLocation();
        return f2.compareTo(f1);
    }
}
