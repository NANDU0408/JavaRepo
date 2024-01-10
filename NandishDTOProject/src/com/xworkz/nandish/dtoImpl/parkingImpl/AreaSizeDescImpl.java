package com.xworkz.nandish.dtoImpl.parkingImpl;

import com.xworkz.nandish.dto.ParkingDTO;

import java.util.Comparator;

public class AreaSizeDescImpl implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        int f1 = o1.getAreaSize();
        int f2 = o2.getAreaSize();
        return Integer.compare(f2,f1);
    }
}
