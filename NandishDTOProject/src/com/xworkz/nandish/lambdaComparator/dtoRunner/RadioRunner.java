package com.xworkz.nandish.lambdaComparator.dtoRunner;

import com.xworkz.nandish.lambdaComparator.dto.RadioDTO;
import com.xworkz.nandish.lambdaComparator.dto.ShipDTO;

import java.util.ArrayList;
import java.util.List;

public class RadioRunner {
    public static void main(String[] args) {

        RadioDTO radioDTO = new RadioDTO("Sony", "Dehli", 7500, 15);
        RadioDTO radioDTO1 = new RadioDTO("Philips", "Dharwad",9500, 26);
        RadioDTO radioDTO2 = new RadioDTO("Panasonic", "Chennai", 5100, 41);
        RadioDTO radioDTO3 = new RadioDTO("Sangean", "Bangalore" , 9000, 15);
        RadioDTO radioDTO4 = new RadioDTO("Pioneer", "Hydrabad", 6500,7);

        List<RadioDTO> list = new ArrayList<>();
        list.add(radioDTO);
        list.add(radioDTO1);
        list.add(radioDTO2);
        list.add(radioDTO3);
        list.add(radioDTO4);


        // Brand Comparator
        list.sort((s1, s2) -> s1.getBrand().compareTo(s2.getBrand()));
        System.out.println("Brand Ascending Order");
        list.forEach(System.out::println);

        System.out.println();

        list.sort((s1, s2) -> s2.getBrand().compareTo(s1.getBrand()));
        System.out.println("Brand Descending Order");
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

        //Cost Price Comparator
        list.sort((s1, s2)-> Double.compare(s1.getCost(), s2.getCost()));
        System.out.println("Cost Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->Double.compare(s2.getCost(), s1.getCost()));
        System.out.println("Cost Descending Order");
        list.forEach(System.out::println);
        System.out.println();

        //No. of Channels Comparator
        list.sort((s1, s2)-> Double.compare(s1.getNoOfChannels(), s2.getNoOfChannels()));
        System.out.println("No. of Channels Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->Double.compare(s2.getNoOfChannels(), s1.getNoOfChannels()));
        System.out.println("No. of Channels Descending Order");
        list.forEach(System.out::println);
        System.out.println();

    }
}
