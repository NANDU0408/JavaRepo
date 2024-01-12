package com.xworkz.nandish.comparable.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FireCrackerDTO implements Serializable, Comparable<FireCrackerDTO> {
    private String name;
    private String Color;
    private double cost;
    @Override
    public int compareTo(FireCrackerDTO o) {
        return Double.compare(this.getCost(),o.getCost());
    }
}
