package com.xworkz.nandish.dtoImpl.waterPurifierImpl;

import com.xworkz.nandish.dto.WaterPurifierDTO;

import java.util.Comparator;

public class LocationAscImpl implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        String f1 = o1.getLocation();
        String f2 = o2.getLocation();
        return f1.compareTo(f2);
    }
}
