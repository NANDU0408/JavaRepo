package com.xworkz.nandish.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CharcoalDTO implements Serializable {
    private String type;
    private String location;
    private double cost;
    private int  quantity;
}
