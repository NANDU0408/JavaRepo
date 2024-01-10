package com.xworkz.nandish.dtoImpl.SpeakerImpl;

import com.xworkz.nandish.dto.SpeakerDTO;

import java.util.Comparator;

public class CostAscImpl implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        double f1 = o1.getCost();
        double f2 = o2.getCost();
        return Double.compare(f1,f2);
    }
}
