package com.xworkz.nandish.dtoImpl.parkingImpl;

import com.xworkz.nandish.dto.ParkingDTO;

import java.util.Comparator;

public class LocationAscImpl implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        String f1 = o1.getLocation();
        String f2 = o2.getLocation();
        return f1.compareTo(f2);
    }
}
