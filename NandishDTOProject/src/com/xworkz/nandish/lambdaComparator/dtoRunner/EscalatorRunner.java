package com.xworkz.nandish.lambdaComparator.dtoRunner;

import com.xworkz.nandish.lambdaComparator.dto.EscalatorDTO;


import java.util.ArrayList;
import java.util.List;

public class EscalatorRunner {
    public static void main(String[] args) {

        EscalatorDTO escalatorDTO = new EscalatorDTO("Straight Escalators", "Otis Elevator Company", 75, 35);
        EscalatorDTO escalatorDTO1 = new EscalatorDTO("Curved Escalators", "Schindler Group",51, 25);
        EscalatorDTO escalatorDTO2 = new EscalatorDTO("Spiral Escalators", "Thyssenkrupp Elevato", 15, 52);
        EscalatorDTO escalatorDTO3 = new EscalatorDTO("Inclined (Ramp) Escalators", "Mitsubishi Electric Corporation" , 19, 15);
        EscalatorDTO escalatorDTO4 = new EscalatorDTO("Parallel Escalators", "Fujitec", 65,7);

        List<EscalatorDTO> list = new ArrayList<>();
        list.add(escalatorDTO);
        list.add(escalatorDTO1);
        list.add(escalatorDTO2);
        list.add(escalatorDTO3);
        list.add(escalatorDTO4);


        // Type Comparator
        list.sort((s1, s2) -> s1.getType().compareTo(s2.getType()));
        System.out.println("Type Ascending Order");
        list.forEach(System.out::println);

        System.out.println();

        list.sort((s1, s2) -> s2.getType().compareTo(s1.getType()));
        System.out.println("Type Descending Order");
        list.forEach(System.out::println);

        System.out.println();

        //Company Comparator
        list.sort((s1, s2)-> s1.getCompany().compareTo(s2.getCompany()));
        System.out.println("Company Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->s2.getCompany().compareTo(s1.getCompany()));
        System.out.println("Company Descending Order");
        list.forEach(System.out::println);
        System.out.println();

        //Height Comparator
        list.sort((s1, s2)-> Double.compare(s1.getHeight(), s2.getHeight()));
        System.out.println("Height Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->Double.compare(s2.getHeight(), s1.getHeight()));
        System.out.println("Height Descending Order");
        list.forEach(System.out::println);
        System.out.println();

        //Capacity Size Comparator
        list.sort((s1, s2)-> Double.compare(s1.getCapacity(), s2.getCapacity()));
        System.out.println("Capacity Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->Double.compare(s2.getCapacity(), s1.getCapacity()));
        System.out.println("Capacity Descending Order");
        list.forEach(System.out::println);
        System.out.println();

    }
}
