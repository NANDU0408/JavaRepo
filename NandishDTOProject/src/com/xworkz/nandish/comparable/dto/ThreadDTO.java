package com.xworkz.nandish.comparable.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ThreadDTO implements Serializable,Comparable<ThreadDTO> {
    private String type;
    private String color;
    private  double length;
    @Override
    public int compareTo(ThreadDTO o) {
        return Double.compare(this.getLength(),o.getLength());
    }
}
