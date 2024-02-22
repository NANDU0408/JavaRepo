package com.xworkz.nandish.comparable.set.setDTO.countrycapitalDTO;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class CountryDTO {
    private String name;
    private int population;
    private String continent;

    @Override
    public boolean equals(Object o) {
        System.out.println("Running Equals");
        if (this == o) return true;
        if (!(o instanceof CountryDTO)) return false;
        CountryDTO that = (CountryDTO) o;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        System.out.println("Running HashCode");
        return Objects.hash(getName());
    }
}
