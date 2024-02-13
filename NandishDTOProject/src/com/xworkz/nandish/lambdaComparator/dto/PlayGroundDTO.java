package com.xworkz.nandish.lambdaComparator.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class PlayGroundDTO implements Serializable {
    private String name;
    private String location;
    private double area;
    private int capacity;
}
