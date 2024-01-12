package com.xworkz.nandish.comparable.dtoRunner;

import com.xworkz.nandish.comparable.dto.ToyDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToyRunner {
    public static void main(String[] args) {

        ToyDTO toyDTO = new ToyDTO("Train", "Fiber", 750);
        ToyDTO toyDTO1 = new ToyDTO("WaterGun", "Plastic", 51);
        ToyDTO toyDTO2 = new ToyDTO("RemoteCar", "Hard Plastic", 500);
        ToyDTO toyDTO3 = new ToyDTO("Car Robot", "Fiber", 900);
        ToyDTO toyDTO4 = new ToyDTO("Remote Plane", "Fiber", 1500);

        List<ToyDTO> list = new ArrayList<>();
        list.add(toyDTO);
        list.add(toyDTO1);
        list.add(toyDTO2);
        list.add(toyDTO3);
        list.add(toyDTO4);

        Collections.sort(list);
        for (ToyDTO dto:list){
            System.out.println(dto);
        }

    }

}
