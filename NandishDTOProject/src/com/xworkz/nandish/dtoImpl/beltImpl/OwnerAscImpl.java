package com.xworkz.nandish.dtoImpl.beltImpl;

import com.xworkz.nandish.dto.BeltDTO;
import com.xworkz.nandish.dtoRunner.BeltRunner;

import java.util.Comparator;

public class OwnerAscImpl implements Comparator<BeltDTO> {
    @Override
    public int compare(BeltDTO o1, BeltDTO o2) {
        String f1 = o1.getOwner();
        String f2 = o2.getOwner();
        return f1.compareTo(f2);
    }
}
