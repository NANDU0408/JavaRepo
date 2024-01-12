package com.xworkz.nandish.comparable.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AlarmDTO implements Serializable, Comparable<AlarmDTO> {
    private String Shape;
    private String type;
    private int cost;
    private double time;

    @Override
    public int compareTo(AlarmDTO o){
        return this.getShape().compareTo(o.getShape());
    }
}
