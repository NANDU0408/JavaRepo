package com.xworkz.nandish.lambdaComparator.dtoRunner;

import com.xworkz.nandish.lambdaComparator.dto.TelescopeDTO;

import java.util.ArrayList;
import java.util.List;

public class TelescopeRunner {
    public static void main(String[] args) {

        TelescopeDTO telescopeDTO = new TelescopeDTO("Refracting Telescope", "Celestron", 75000, 600);
        TelescopeDTO telescopeDTO1 = new TelescopeDTO("Reflecting Telescope", "Meade Instruments",51000, 700);
        TelescopeDTO telescopeDTO2 = new TelescopeDTO("Compound Telescope", "Orion Telescopes & Binoculars", 15000, 1000);
        TelescopeDTO telescopeDTO3 = new TelescopeDTO("Catoptric Telescope", "SkyWatcher" , 190000, 400);
        TelescopeDTO telescopeDTO4 = new TelescopeDTO("Radio Telescope", "Vixen Optics", 650000,350);

        List<TelescopeDTO> list = new ArrayList<>();
        list.add(telescopeDTO);
        list.add(telescopeDTO1);
        list.add(telescopeDTO2);
        list.add(telescopeDTO3);
        list.add(telescopeDTO4);


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

        //Cost Comparator
        list.sort((s1, s2)-> Double.compare(s1.getCost(), s2.getCost()));
        System.out.println("Cost Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->Double.compare(s2.getCost(), s1.getCost()));
        System.out.println("Cost Descending Order");
        list.forEach(System.out::println);
        System.out.println();

        //Vision Capacity Size Comparator
        list.sort((s1, s2)-> Double.compare(s1.getVisionCapacity(), s2.getVisionCapacity()));
        System.out.println("Vision Capacity Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->Double.compare(s2.getVisionCapacity(), s1.getVisionCapacity()));
        System.out.println("Vision Capacity Descending Order");
        list.forEach(System.out::println);
        System.out.println();

    }
}
