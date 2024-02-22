package com.xworkz.nandish.comparable.set.setDTO.productvendorDTO;

import lombok.*;

import java.util.Objects;

import static java.lang.Character.getName;

@AllArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class ProductDTO {
    private String name;
    private double price;
    private int quantity;

    @Override
    public boolean equals(Object o) {
        System.out.println("Running Equals");
        if (this == o) return true;
        if (!(o instanceof ProductDTO)) return false;
        ProductDTO productDTO = (ProductDTO) o;
        return Objects.equals(getName(), productDTO.getName());
    }



    @Override
    public int hashCode() {
        System.out.println("Running HashCode");
        return Objects.hash(getName());
    }
}
