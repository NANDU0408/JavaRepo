package com.xworkz.nandish.lambdaComparator.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RadioDTO implements Serializable {
    private String brand;
    private String location;
    private double cost;
    private int noOfChannels;
}
