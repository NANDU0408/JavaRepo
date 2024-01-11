package com.xworkz.nandish.lambdaComparator.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class StreetDTO implements Serializable {
    private String name;
    private String location;
    private double distance;
    private int areaSize;
}
