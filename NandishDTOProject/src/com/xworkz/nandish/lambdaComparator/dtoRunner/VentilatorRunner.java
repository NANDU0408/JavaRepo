package com.xworkz.nandish.lambdaComparator.dtoRunner;

import com.xworkz.nandish.lambdaComparator.dto.SkyWalkDTO;
import com.xworkz.nandish.lambdaComparator.dto.VentilatorDTO;

import java.util.ArrayList;
import java.util.List;

public class VentilatorRunner {
    public static void main(String[] args) {

        VentilatorDTO ventilatorDTO = new VentilatorDTO("RamVijay", "Jaydev", 7500, 10);
        VentilatorDTO ventilatorDTO1 = new VentilatorDTO("SaiVijay", "Rishi",9500, 15);
        VentilatorDTO ventilatorDTO2 = new VentilatorDTO("KrishnaArjun", "Vikas", 5100, 8);
        VentilatorDTO ventilatorDTO3 = new VentilatorDTO("Vijaypeet", "Janatha" , 9000, 12);
        VentilatorDTO ventilatorDTO4 = new VentilatorDTO("VinodhaMurthy", "Apollo", 6500,17);

        List<VentilatorDTO> list = new ArrayList<>();
        list.add(ventilatorDTO);
        list.add(ventilatorDTO1);
        list.add(ventilatorDTO2);
        list.add(ventilatorDTO3);
        list.add(ventilatorDTO4);


        // Company Comparator
        list.sort((s1, s2) -> s1.getCompany().compareTo(s2.getCompany()));
        System.out.println("Company Ascending Order");
        list.forEach(System.out::println);

        System.out.println();

        list.sort((s1, s2) -> s2.getCompany().compareTo(s1.getCompany()));
        System.out.println("Company Descending Order");
        list.forEach(System.out::println);

        System.out.println();

        //Hospital Comparator
        list.sort((s1, s2)-> s1.getHospital().compareTo(s2.getHospital()));
        System.out.println("Hospital Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->s2.getHospital().compareTo(s1.getHospital()));
        System.out.println("Hospital Descending Order");
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

        //Capacity Comparator
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
