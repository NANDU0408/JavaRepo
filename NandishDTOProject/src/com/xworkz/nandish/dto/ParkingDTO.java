package com.xworkz.nandish.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ParkingDTO implements Serializable {
    private String contractor;
    private String location;
    private double cost;
    private int areaSize;
}
