package com.xworkz.nandish.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class WaterPurifierDTO implements Serializable {
    private String brandName;
    private  String location;
    private  double cost;
    private  int quantityInLtrs;
}
