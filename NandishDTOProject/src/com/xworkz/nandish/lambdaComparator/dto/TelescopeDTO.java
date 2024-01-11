package com.xworkz.nandish.lambdaComparator.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TelescopeDTO implements Serializable {
    private String type;
    private String company;
    private double cost;
    private int visionCapacity;
}
