package com.xworkz.nandish.comparable.dtoRunner;

import com.xworkz.nandish.comparable.dto.WingDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WingRunner {
    public static void main(String[] args) {

        WingDTO wingDTO = new WingDTO("Eagle", "largeFeathered", 1500);
        WingDTO wingDTO1 = new WingDTO("Hymming Bird", "smallMussleFeathered", 510);
        WingDTO wingDTO2 = new WingDTO("Sparrow", "MediumFeathered", 500);
        WingDTO wingDTO3 = new WingDTO("Owl", "MuscularWoolenFeathered", 90);
        WingDTO wingDTO4 = new WingDTO("Parrot", "SoftFeathered", 150);

        List<WingDTO> list = new ArrayList<>();
        list.add(wingDTO);
        list.add(wingDTO1);
        list.add(wingDTO2);
        list.add(wingDTO3);
        list.add(wingDTO4);

        Collections.sort(list);
        for (WingDTO dto:list){
            System.out.println(dto);
        }

    }
}
