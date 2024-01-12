package com.xworkz.nandish.comparable.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RopeDTO implements Serializable,Comparable<RopeDTO> {
    private String type;
    private String color;
    private  double length;
    @Override
    public int compareTo(RopeDTO o) {
        return this.getType().compareTo(o.getType());
    }
}
