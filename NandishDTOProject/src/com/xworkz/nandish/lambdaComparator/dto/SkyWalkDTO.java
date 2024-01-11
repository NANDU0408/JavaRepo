package com.xworkz.nandish.lambdaComparator.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SkyWalkDTO implements Serializable {
    private String location;
    private String type;
    private double height;
    private  int length;
}
