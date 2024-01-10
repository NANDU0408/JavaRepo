package com.xworkz.nandish.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SparkPlugDTO implements Serializable {
    private String brand;
    private String companyName;
    private double cost;
    private  int warranty;
}
