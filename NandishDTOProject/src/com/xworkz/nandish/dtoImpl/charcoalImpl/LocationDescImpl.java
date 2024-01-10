package com.xworkz.nandish.dtoImpl.charcoalImpl;

import com.xworkz.nandish.dto.CharcoalDTO;

import java.util.Comparator;
import java.util.concurrent.CompletionService;

public class LocationDescImpl implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        String f1 = o1.getLocation();
        String f2 = o2.getLocation();
        return f2.compareTo(f1);
    }
}
