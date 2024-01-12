package com.xworkz.nandish.comparable.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WingDTO implements Serializable,Comparable<WingDTO> {
    private String birdName;
    private String type;
    private double efficiency;

    @Override
    public int compareTo(WingDTO o) {
        return Double.compare(this.getEfficiency(),o.getEfficiency());
    }
}
