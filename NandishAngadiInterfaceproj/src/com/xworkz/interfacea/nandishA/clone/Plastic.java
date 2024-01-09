package com.xworkz.interfacea.nandishA.clone;

import lombok.*;

@ToString
@Setter
@Getter
@Generated
@NoArgsConstructor
@AllArgsConstructor

public class Plastic implements Cloneable{
    private String type;
    private String productionFactoryName;
    private int quantity;
    private int rating;

    @Override
    public Plastic clone() throws CloneNotSupportedException {
        return (Plastic) super.clone();
    }
}
