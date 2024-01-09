package com.xworkz.interfacea.nandishA.clone;

import lombok.*;

@ToString
@Setter
@Getter
@Generated
@NoArgsConstructor
@AllArgsConstructor
public class Paint implements Cloneable{
    private  String companyName;
    private String shopName;
    private int netQuantity;
    private int cost;

    @Override
    public Paint clone() throws CloneNotSupportedException {
        return (Paint) super.clone();
    }
}
