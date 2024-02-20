package com.xworkz.nandish.comparable.stream;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;


@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MedicineDTO implements Serializable, Comparable<MedicineDTO> {
    private int id;
    private String name;
    private String company;
    private LocalDate manufactureDate;
    private LocalDate expiryDate;
    private double cost;
    private String[] ingredients;

    @Override
    public int compareTo(MedicineDTO o) {
        return this.company.compareTo(o.company);
    }
}
