package com.xworkz.nandish.comparable.dtoRunner;

import com.xworkz.nandish.comparable.dto.PinDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PinRunner {
    public static void main(String[] args) {

        PinDTO pinDTO = new PinDTO("Safety Pin", 1, 150);
        PinDTO pinDTO1 = new PinDTO("Straight Pin", 2, 510);
        PinDTO pinDTO2 = new PinDTO("Hairpin", 3, 500);
        PinDTO pinDTO3 = new PinDTO("Roll Pin", 4, 90);
        PinDTO pinDTO4 = new PinDTO("Tie Pin", 5, 150);

        List<PinDTO> list = new ArrayList<>();
        list.add(pinDTO);
        list.add(pinDTO1);
        list.add(pinDTO2);
        list.add(pinDTO3);
        list.add(pinDTO4);

        Collections.sort(list);
        for (PinDTO dto:list){
            System.out.println(dto);
        }

    }
}
