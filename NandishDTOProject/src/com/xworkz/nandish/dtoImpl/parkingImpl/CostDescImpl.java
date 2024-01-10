package com.xworkz.nandish.dtoImpl.parkingImpl;

import com.xworkz.nandish.dto.ParkingDTO;

import java.util.Comparator;

public class CostDescImpl implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        double f1 = o1.getCost();
        double f2 = o2.getCost();
        return Double.compare(f2,f1);
    }
}
