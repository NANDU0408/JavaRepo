package com.xworkz.nandish.dtoImpl.parkingImpl;

import com.xworkz.nandish.dto.ParkingDTO;

import java.util.Comparator;

public class ContractorDescImpl implements Comparator<ParkingDTO> {
    @Override
    public int compare(ParkingDTO o1, ParkingDTO o2) {
        String f1 = o1.getContractor();
        String f2 = o2.getContractor();
        return f2.compareTo(f1);
    }
}
