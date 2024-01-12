package com.xworkz.nandish.comparable.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PinDTO implements Serializable,Comparable<PinDTO> {
    private String type;
    private int size;
    private double cost;
    @Override
    public int compareTo(PinDTO o) {
        return this.getType().compareTo(o.getType());
    }
}
