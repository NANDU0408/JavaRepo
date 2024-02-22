package com.xworkz.nandish.comparable.set.setDTO.carlicenceDTO;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class CarDTO {
    private String CarName;
    private String company;
    private int model;

    @Override
    public boolean equals(Object o) {
        System.out.println("Running Equals");
        if (this == o) return true;
        if (!(o instanceof CarDTO)) return false;
        CarDTO carDTO = (CarDTO) o;
        return Objects.equals(getCompany(), carDTO.getCompany());
    }

    @Override
    public int hashCode() {
        System.out.println("Running HashCode");
        return Objects.hash(getCompany());
    }
}
