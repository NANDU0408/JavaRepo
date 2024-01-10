package com.xworkz.nandish.dtoImpl.charcoalImpl;

import com.xworkz.nandish.dto.CharcoalDTO;

import java.util.Comparator;

public class TypeDescImpl implements Comparator<CharcoalDTO> {
    @Override
    public int compare(CharcoalDTO o1, CharcoalDTO o2) {
        String f1 = o1.getType();
        String f2 = o2.getType();
        return f2.compareTo(f1);
    }
}
