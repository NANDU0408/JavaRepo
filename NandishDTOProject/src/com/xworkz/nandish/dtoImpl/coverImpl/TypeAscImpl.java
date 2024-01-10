package com.xworkz.nandish.dtoImpl.coverImpl;

import com.xworkz.nandish.dto.CoverDTO;

import java.util.Comparator;

public class TypeAscImpl implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        String f1 = o1.getType();
        String f2 = o2.getType();
        return f1.compareTo(f2);
    }
}
