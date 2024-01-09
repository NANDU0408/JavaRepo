package com.xworkz.nandish.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class SensorDTO implements Serializable {
    private String name;
    private String type;
    private double cost;
    private int distance;
}
