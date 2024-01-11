package com.xworkz.nandish.lambdaComparator.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ShipDTO implements Serializable {
    private String name;
    private String owner;
    private double ticketPrice;
    private int capacity;
}
