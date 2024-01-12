package com.xworkz.nandish.comparable.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ToyDTO implements Serializable, Comparable<ToyDTO> {
    private String name;
    private String material;
    private  double cost;
    @Override
    public int compareTo(ToyDTO o) {
        return this.getMaterial().compareTo(o.getMaterial());
    }
}
