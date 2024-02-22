package com.xworkz.nandish.comparable.set.setDTO;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class PersonDTO {
    private String name;
    private String email;


    @Override
    public boolean equals(Object o) {
        System.out.println("running equals in person");
//        if (this == o) return true;
        if (!(o instanceof PersonDTO)) return false;
        PersonDTO personDTO = (PersonDTO) o;
        return Objects.equals(getEmail(), personDTO.getEmail());
    }

    @Override
    public int hashCode() {
        System.out.println("running hashcode in person");
        return Objects.hash(getEmail());
    }
}
