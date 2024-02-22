package com.xworkz.nandish.comparable.set.setDTO;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor

public class AddressDTO implements Serializable, Comparable<AddressDTO> {
    private double number;
    private  long pincode;
    private  String Street;

    @Override
    public int compareTo(AddressDTO o) {
        return 0;
    }
}
