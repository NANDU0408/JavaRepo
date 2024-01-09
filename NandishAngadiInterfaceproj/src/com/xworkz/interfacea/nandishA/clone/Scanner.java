package com.xworkz.interfacea.nandishA.clone;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Generated
@Setter
@ToString

public class Scanner implements Cloneable {
    private String documentName;
    private int noOfPages;
    private String details;
    private int noOfHours;


    @Override
    public Scanner clone() throws CloneNotSupportedException {
        return (Scanner) super.clone();
    }
}
