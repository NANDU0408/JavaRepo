package com.xworkz.nandish.comparable.dtoRunner;

import com.xworkz.nandish.comparable.dto.NeedleDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NeedleRunner {
    public static void main(String[] args) {

        NeedleDTO needleDTO = new NeedleDTO("Twisted Thread", 10, 150);
        NeedleDTO needleDTO1 = new NeedleDTO("Braided Thread", 20, 510);
        NeedleDTO needleDTO2 = new NeedleDTO("Static Thread", 35, 500);
        NeedleDTO needleDTO3 = new NeedleDTO("Dynamic Thread", 11, 90);
        NeedleDTO needleDTO4 = new NeedleDTO("Nylon Thread", 15, 150);

        List<NeedleDTO> list = new ArrayList<>();
        list.add(needleDTO);
        list.add(needleDTO1);
        list.add(needleDTO2);
        list.add(needleDTO3);
        list.add(needleDTO4);

        Collections.sort(list);
        for (NeedleDTO dto:list){
            System.out.println(dto);
        }

    }
}
