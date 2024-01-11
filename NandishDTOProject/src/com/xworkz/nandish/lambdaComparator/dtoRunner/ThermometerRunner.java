package com.xworkz.nandish.lambdaComparator.dtoRunner;

import com.xworkz.nandish.lambdaComparator.dto.ThermometerDTO;

import java.util.ArrayList;
import java.util.List;

public class ThermometerRunner {
    public static void main(String[] args) {

        ThermometerDTO thermometerDTO = new ThermometerDTO("Mercury Thermometer", "Fluke Corporation", 75, -115-78);
        ThermometerDTO thermometerDTO1 = new ThermometerDTO("Digital Thermometer", "Testo SE & Co. KGaA",51, -50-150);
        ThermometerDTO thermometerDTO2 = new ThermometerDTO("Infrared Thermometer", "OMEGA Engineering", 15, -45-1000);
        ThermometerDTO thermometerDTO3 = new ThermometerDTO("Thermocouple", "Cole-Parmer" , 19, -200-2300);
        ThermometerDTO thermometerDTO4 = new ThermometerDTO("Thermistor", "Thermo Fisher Scientific", 65,-30-300);

        List<ThermometerDTO> list = new ArrayList<>();
        list.add(thermometerDTO);
        list.add(thermometerDTO1);
        list.add(thermometerDTO2);
        list.add(thermometerDTO3);
        list.add(thermometerDTO4);


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

        //Measuring Capacity Size Comparator
        list.sort((s1, s2)-> Double.compare(s1.getMeasuringCapacity(), s2.getMeasuringCapacity()));
        System.out.println("Measuring Capacity Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->Double.compare(s2.getMeasuringCapacity(), s1.getMeasuringCapacity()));
        System.out.println("Measuring Capacity Descending Order");
        list.forEach(System.out::println);
        System.out.println();

    }
}
