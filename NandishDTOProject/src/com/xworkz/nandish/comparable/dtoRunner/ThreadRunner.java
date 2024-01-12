package com.xworkz.nandish.comparable.dtoRunner;

import com.xworkz.nandish.comparable.dto.ThreadDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadRunner {
    public static void main(String[] args) {

        ThreadDTO threadDTO = new ThreadDTO("Twisted Thread", "black", 150);
        ThreadDTO threadDTO1 = new ThreadDTO("Braided Thread", "green", 510);
        ThreadDTO threadDTO2 = new ThreadDTO("Static Thread", "red", 500);
        ThreadDTO threadDTO3 = new ThreadDTO("Dynamic Thread", "brown", 90);
        ThreadDTO threadDTO4 = new ThreadDTO("Nylon Thread", "white", 150);

        List<ThreadDTO> list = new ArrayList<>();
        list.add(threadDTO);
        list.add(threadDTO1);
        list.add(threadDTO2);
        list.add(threadDTO3);
        list.add(threadDTO4);

        Collections.sort(list);
        for (ThreadDTO dto:list){
            System.out.println(dto);
        }

    }
}
