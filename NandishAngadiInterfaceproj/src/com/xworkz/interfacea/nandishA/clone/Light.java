package com.xworkz.interfacea.nandishA.clone;

import lombok.*;

@ToString
@Setter
@Getter
@Generated
@NoArgsConstructor
@AllArgsConstructor
public class Light implements Cloneable{
    private String operatorName;
    private String supplierCompantName;
    private int noOfUnits;
    private int costPerUnit;

    @Override
    public Light clone() throws CloneNotSupportedException {
        return (Light) super.clone();
    }
}
