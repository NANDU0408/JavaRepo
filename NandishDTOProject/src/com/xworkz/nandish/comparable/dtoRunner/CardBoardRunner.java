package com.xworkz.nandish.comparable.dtoRunner;

import com.xworkz.nandish.comparable.dto.CardBoardDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardBoardRunner {
    public static void main(String[] args) {

        CardBoardDTO cardBoardDTO = new CardBoardDTO("Plastic", "Rectangle", 75, 5);
        CardBoardDTO cardBoardDTO1 = new CardBoardDTO("Fiber", "Square", 51, 7);
        CardBoardDTO cardBoardDTO2 = new CardBoardDTO("Wood", "Rectangle", 50, 11);
        CardBoardDTO cardBoardDTO3 = new CardBoardDTO("StainlessSteel", "Square", 90, 4);
        CardBoardDTO cardBoardDTO4 = new CardBoardDTO("Hard Plastic", "Square", 65, 12);

        List<CardBoardDTO> list = new ArrayList<>();
        list.add(cardBoardDTO);
        list.add(cardBoardDTO1);
        list.add(cardBoardDTO2);
        list.add(cardBoardDTO3);
        list.add(cardBoardDTO4);

        Collections.sort(list);
        for (CardBoardDTO dto:list){
            System.out.println(dto);
        }

    }
}
