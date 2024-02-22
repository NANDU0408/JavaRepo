package com.xworkz.nandish.comparable.set.setDTO.godbirthDTO;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor

public class GodDTO {
    private String name;
    private String incarnation;
    private String motherName;

    @Override
    public boolean equals(Object o) {
        System.out.println("Running Equals");
        if (this == o) return true;
        if (!(o instanceof GodDTO)) return false;
        GodDTO godDTO = (GodDTO) o;
        return Objects.equals(getIncarnation(), godDTO.getIncarnation());
    }

    @Override
    public int hashCode() {
        System.out.println("Running hashCode");
        return Objects.hash(getIncarnation());
    }
}
