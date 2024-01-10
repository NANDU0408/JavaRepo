package com.xworkz.nandish.dtoImpl.SpeakerImpl;

import com.xworkz.nandish.dto.SpeakerDTO;

import java.util.Comparator;

public class BrandDescImpl implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        String f1 = o1.getBrandName();
        String f2 = o2.getBrandName();
        return f2.compareTo(f1);
    }
}
