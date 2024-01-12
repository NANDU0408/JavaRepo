package com.xworkz.nandish.comparable.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class NeedleDTO implements Serializable,Comparable<NeedleDTO> {
    private String type;
    private int size;
    private double cost;
    @Override
    public int compareTo(NeedleDTO o) {
        return Integer.compare(this.getSize(),o.getSize());
    }
}
