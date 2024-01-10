package com.xworkz.nandish.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BeltDTO implements Serializable {
    private String brand;
    private String owner;
    private double cost;
    private int size;
}
