package com.xworkz.nandish.dtoImpl.paperImpl;

import com.xworkz.nandish.dto.PaperDTO;

import java.util.Comparator;

public class PaperImpl implements Comparator<PaperDTO> {

    @Override
    public int compare(PaperDTO o1, PaperDTO o2) {
        String first = o1.getCompanyName();
        String f1 = o2.getCompanyName();
        return first.compareTo(f1);
    }
}
