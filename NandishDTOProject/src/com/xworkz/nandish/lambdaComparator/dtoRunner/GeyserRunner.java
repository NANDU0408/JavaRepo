package com.xworkz.nandish.lambdaComparator.dtoRunner;

import com.xworkz.nandish.lambdaComparator.dto.GeyserDTO;
import com.xworkz.nandish.lambdaComparator.dto.VentilatorDTO;

import java.util.ArrayList;
import java.util.List;

public class GeyserRunner {
    public static void main(String[] args) {

        GeyserDTO geyserDTO = new GeyserDTO("RamVijay", "Jaydev", 7500, 1);
        GeyserDTO geyserDTO1 = new GeyserDTO("SaiVijay", "Rishi",9500, 5);
        GeyserDTO geyserDTO2 = new GeyserDTO("KrishnaArjun", "Vikas", 5100, 4);
        GeyserDTO geyserDTO3 = new GeyserDTO("Vijaypeet", "Janatha" , 9000, 2);
        GeyserDTO geyserDTO4 = new GeyserDTO("VinodhaMurthy", "Anandam", 6500,3);

        List<GeyserDTO> list = new ArrayList<>();
        list.add(geyserDTO);
        list.add(geyserDTO1);
        list.add(geyserDTO2);
        list.add(geyserDTO3);
        list.add(geyserDTO4);


        // Brand Comparator
        list.sort((s1, s2) -> s1.getBrand().compareTo(s2.getBrand()));
        System.out.println("Brand Ascending Order");
        list.forEach(System.out::println);

        System.out.println();

        list.sort((s1, s2) -> s2.getBrand().compareTo(s1.getBrand()));
        System.out.println("Company Descending Order");
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

        //Warranty Comparator
        list.sort((s1, s2)-> Double.compare(s1.getWarranty(), s2.getWarranty()));
        System.out.println("Warranty Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->Double.compare(s2.getWarranty(), s1.getWarranty()));
        System.out.println("Warranty Descending Order");
        list.forEach(System.out::println);
        System.out.println();

    }
}
