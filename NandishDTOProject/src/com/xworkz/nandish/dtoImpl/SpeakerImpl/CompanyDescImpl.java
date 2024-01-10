package com.xworkz.nandish.dtoImpl.SpeakerImpl;

import com.xworkz.nandish.dto.SpeakerDTO;

import java.util.Comparator;

public class CompanyDescImpl implements Comparator<SpeakerDTO> {
    @Override
    public int compare(SpeakerDTO o1, SpeakerDTO o2) {
        String f1 = o1.getCompanyName();
        String f2 = o2.getCompanyName();
        return f2.compareTo(f1);
    }
}
