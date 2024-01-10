package com.xworkz.nandish.dto;

import lombok.*;

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CoverDTO {
    private String type;
    private String company;
    private  double price;
    private  int rating;
}
