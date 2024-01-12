package com.xworkz.nandish.comparable.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JoyStickDTO implements Serializable,Comparable<JoyStickDTO> {
    private String type;
    private String color;
    private double cost;
    @Override
    public int compareTo(JoyStickDTO o) {
        return this.getColor().compareTo(o.getColor());
    }
}
