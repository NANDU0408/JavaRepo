package com.xworkz.nandish.dtoImpl.charcoalImpl;

import com.xworkz.nandish.dto.CharcoalDTO;

import java.util.Comparator;

public class LocationAscImpl implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        String f1 = o1.getLocation();
        String f2 = o2.getLocation();
        return f1.compareTo(f2);
    }
}
