package com.xworkz.nandish.lambdaComparator.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VentilatorDTO implements Serializable {
    private String company;
    private String hospital;
    private  double cost;
    private int capacity;
}
