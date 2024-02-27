package com.xworkz.nandish.comparable.set.complexsimple.complexsimpleDTO.countrycapitalDTO2;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class CountryDTO2 {
    private String name;
    private int population;
    private String continent;

    @Override
    public boolean equals(Object o) {
        System.out.println("Running Equals");
        if (this == o) return true;
        if (!(o instanceof CountryDTO2)) return false;
        CountryDTO2 that = (CountryDTO2) o;
        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        System.out.println("Running HashCode");
        return Objects.hash(getName());
    }
}
