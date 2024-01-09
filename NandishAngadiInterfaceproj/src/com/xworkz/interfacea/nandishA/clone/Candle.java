package com.xworkz.interfacea.nandishA.clone;

import lombok.*;

@ToString
@Setter
@Getter
@Generated
@NoArgsConstructor
@AllArgsConstructor
public class Candle implements Cloneable{
    private String supplierName;
    private String companyLabel;
    private  int noOfPiecesPerPack;
    private int cost;

    @Override
    public Candle clone() throws CloneNotSupportedException {
        return (Candle) super.clone();
    }
}
