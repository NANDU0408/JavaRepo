package com.xworkz.nandish.comparable.dtoRunner;

import com.xworkz.nandish.comparable.dto.FireCrackerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FireCrackerRunner {
    public static void main(String[] args) {

        FireCrackerDTO fireCrackerDTO = new FireCrackerDTO("Flower Pot", "Red", 150);
        FireCrackerDTO fireCrackerDTO1 = new FireCrackerDTO("Ground Spinners", "Yellow", 510);
        FireCrackerDTO fireCrackerDTO2 = new FireCrackerDTO("Bottle Rockets", "Orange", 500);
        FireCrackerDTO fireCrackerDTO3 = new FireCrackerDTO("Flashlight Crackers", "Green", 90);
        FireCrackerDTO fireCrackerDTO4 = new FireCrackerDTO("Aerial Shells", "Blue", 150);

        List<FireCrackerDTO> list = new ArrayList<>();
        list.add(fireCrackerDTO);
        list.add(fireCrackerDTO1);
        list.add(fireCrackerDTO2);
        list.add(fireCrackerDTO3);
        list.add(fireCrackerDTO4);

        Collections.sort(list);
        for (FireCrackerDTO dto:list){
            System.out.println(dto);
        }

    }
}
