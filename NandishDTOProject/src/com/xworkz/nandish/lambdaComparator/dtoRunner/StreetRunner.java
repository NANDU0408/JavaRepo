package com.xworkz.nandish.lambdaComparator.dtoRunner;


import com.xworkz.nandish.lambdaComparator.dto.StreetDTO;

import java.util.ArrayList;
import java.util.List;

public class StreetRunner {
    public static void main(String[] args) {

        StreetDTO streetDTO = new StreetDTO("WhiteField", "Dehli", 75, 15);
        StreetDTO streetDTO1 = new StreetDTO("Annanagar", "Chennai",51, 25);
        StreetDTO streetDTO2 = new StreetDTO("Saidapur", "Dharwad", 15, 52);
        StreetDTO streetDTO3 = new StreetDTO("Gandhinagar", "Hubli" , 19, 15);
        StreetDTO streetDTO4 = new StreetDTO("Marine Drive", "Mumbai", 65,7);

        List<StreetDTO> list = new ArrayList<>();
        list.add(streetDTO);
        list.add(streetDTO1);
        list.add(streetDTO2);
        list.add(streetDTO3);
        list.add(streetDTO4);


        // Name Comparator
        list.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("Name Ascending Order");
        list.forEach(System.out::println);

        System.out.println();

        list.sort((s1, s2) -> s2.getName().compareTo(s1.getName()));
        System.out.println("Name Descending Order");
        list.forEach(System.out::println);

        System.out.println();

        //Location Comparator
        list.sort((s1, s2)-> s1.getLocation().compareTo(s2.getLocation()));
        System.out.println("Location Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->s2.getLocation().compareTo(s1.getLocation()));
        System.out.println("Location Descending Order");
        list.forEach(System.out::println);
        System.out.println();

        //Distance Comparator
        list.sort((s1, s2)-> Double.compare(s1.getDistance(), s2.getDistance()));
        System.out.println("Distance Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->Double.compare(s2.getDistance(), s1.getDistance()));
        System.out.println("Distance Descending Order");
        list.forEach(System.out::println);
        System.out.println();

        //Area Size Comparator
        list.sort((s1, s2)-> Double.compare(s1.getAreaSize(), s2.getAreaSize()));
        System.out.println("Area Size Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->Double.compare(s2.getAreaSize(), s1.getAreaSize()));
        System.out.println("Area Size Descending Order");
        list.forEach(System.out::println);
        System.out.println();

    }
}
