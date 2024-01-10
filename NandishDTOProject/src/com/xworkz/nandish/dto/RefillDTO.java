package com.xworkz.nandish.dto;

import lombok.*;

import java.io.Serializable;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RefillDTO implements Serializable {
    private String brand;
    private String companyLocation;
    private  double price;
    private  int quantity;
}
