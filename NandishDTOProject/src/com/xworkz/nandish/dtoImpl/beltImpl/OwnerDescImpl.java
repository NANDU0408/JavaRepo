package com.xworkz.nandish.dtoImpl.beltImpl;

import com.xworkz.nandish.dto.BeltDTO;

import java.util.Comparator;

public class OwnerDescImpl implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        String f1 = o1.getOwner();
        String f2 = o2.getOwner();
        return f2.compareTo(f1);
    }
}
