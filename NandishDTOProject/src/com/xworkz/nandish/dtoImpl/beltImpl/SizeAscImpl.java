package com.xworkz.nandish.dtoImpl.beltImpl;

import com.xworkz.nandish.dto.BeltDTO;

import java.util.Comparator;

public class SizeAscImpl implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        int f1 = o1.getSize();
        int f2 = o2.getSize();
        return Integer.compare(f1,f2);
    }
}
