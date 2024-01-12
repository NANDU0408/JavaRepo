package com.xworkz.nandish.comparable.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CardBoardDTO implements Serializable,Comparable<CardBoardDTO> {

    private String type;
    private String shape;
    private  double cost;
    private int size;

    @Override
    public int compareTo(CardBoardDTO o) {
        return Double.compare(this.getCost(),o.getCost());
    }
}
