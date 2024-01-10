package com.xworkz.nandish.dto;

import lombok.*;

import java.io.Serializable;
@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class SpeakerDTO implements Serializable {
    private  String brandName;
    private  String companyName;
    private  double cost;
    private  int  decibles;
}
