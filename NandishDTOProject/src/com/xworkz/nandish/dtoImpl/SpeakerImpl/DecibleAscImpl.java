package com.xworkz.nandish.dtoImpl.SpeakerImpl;

import com.xworkz.nandish.dto.SpeakerDTO;

import java.util.Comparator;

public class DecibleAscImpl implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        int f1 = o1.getDecibles();
        int f2 = o2.getDecibles();
        return Integer.compare(f1,f2);
    }
}
