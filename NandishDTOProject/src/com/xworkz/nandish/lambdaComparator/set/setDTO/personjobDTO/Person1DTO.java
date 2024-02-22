package com.xworkz.nandish.comparable.set.setDTO.personjobDTO;

import lombok.*;

import java.util.*;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class Person1DTO {
    private String name;
    private String email;

    @Override
    public boolean equals(Object o) {
        System.out.println("Running Equals");
        if (this == o) return true;
        if (!(o instanceof Person1DTO)) return false;
        Person1DTO personDTO = (Person1DTO) o;
        return Objects.equals(getEmail(), personDTO.getEmail());
    }

    @Override
    public int hashCode() {
        System.out.println("Running HashCode");
        return Objects.hash(getEmail());
    }
}
