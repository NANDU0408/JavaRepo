package com.xworkz.nandish.comparable.dtoRunner;

import com.xworkz.nandish.comparable.dto.RopeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RopeRunner {
    public static void main(String[] args) {

        RopeDTO ropeDTO = new RopeDTO("Twisted Rope", "black", 150);
        RopeDTO ropeDTO1 = new RopeDTO("Braided Rope", "green", 510);
        RopeDTO ropeDTO2 = new RopeDTO("Static Rope", "red", 500);
        RopeDTO ropeDTO3 = new RopeDTO("Dynamic Rope", "brown", 90);
        RopeDTO ropeDTO4 = new RopeDTO("Nylon Rope", "white", 150);

        List<RopeDTO> list = new ArrayList<>();
        list.add(ropeDTO);
        list.add(ropeDTO1);
        list.add(ropeDTO2);
        list.add(ropeDTO3);
        list.add(ropeDTO4);

        Collections.sort(list);
        for (RopeDTO dto:list){
            System.out.println(dto);
        }

    }
}
