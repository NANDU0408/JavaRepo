package com.xworkz.nandish.lambdaComparator.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class WatchDTO implements Serializable {
    private String brand;
    private String company;
    private double cost;
    private int warranty;
}
