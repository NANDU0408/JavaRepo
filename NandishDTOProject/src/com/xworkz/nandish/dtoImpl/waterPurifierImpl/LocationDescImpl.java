package com.xworkz.nandish.dtoImpl.waterPurifierImpl;

import com.xworkz.nandish.dto.WaterPurifierDTO;

import java.util.Comparator;

public class LocationDescImpl implements Comparator<WaterPurifierDTO> {
    @Override
    public int compare(WaterPurifierDTO o1, WaterPurifierDTO o2) {
        String f1 = o1.getLocation();
        String f2 = o2.getLocation();
        return f2.compareTo(f1);
    }
}
