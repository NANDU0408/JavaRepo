package com.xworkz.nandish.dtoImpl.coverImpl;

import com.xworkz.nandish.dto.CoverDTO;

import java.util.Comparator;

public class RatingAscImpl implements Comparator<CoverDTO> {
    @Override
    public int compare(CoverDTO o1, CoverDTO o2) {
        int f1 = o1.getRating();
        int f2 = o2.getRating();
        return Integer.compare(f1,f2);
    }
}
