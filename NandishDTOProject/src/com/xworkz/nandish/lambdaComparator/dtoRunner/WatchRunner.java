package com.xworkz.nandish.lambdaComparator.dtoRunner;

import com.xworkz.nandish.lambdaComparator.dto.WatchDTO;

import java.util.ArrayList;
import java.util.List;

public class WatchRunner {
    public static void main(String[] args) {

        WatchDTO watchDTO1 = new WatchDTO("Rolex", "SwissWatch", 15000, 2);
        WatchDTO watchDTO2 = new WatchDTO("Casio", "JapaneseWatch", 3000, 1);
        WatchDTO watchDTO3 = new WatchDTO("Tag Heuer", "SwissWatch", 10000, 3);
        WatchDTO watchDTO4 = new WatchDTO("Seiko", "JapaneseWatch", 5000, 2);
        WatchDTO watchDTO5 = new WatchDTO("Fossil", "AmericanWatch", 8000, 1);

        List<WatchDTO> watchList = new ArrayList<>();
        watchList.add(watchDTO1);
        watchList.add(watchDTO2);
        watchList.add(watchDTO3);
        watchList.add(watchDTO4);
        watchList.add(watchDTO5);

        // Brand Comparator
        watchList.sort((w1, w2) -> w1.getBrand().compareTo(w2.getBrand()));
        System.out.println("Brand Ascending Order");
        watchList.forEach(System.out::println);

        System.out.println();

        watchList.sort((w1, w2) -> w2.getBrand().compareTo(w1.getBrand()));
        System.out.println("Brand Descending Order");
        watchList.forEach(System.out::println);

        System.out.println();

        // Company Comparator
        watchList.sort((w1, w2) -> w1.getCompany().compareTo(w2.getCompany()));
        System.out.println("Company Ascending Order");
        watchList.forEach(System.out::println);
        System.out.println();

        watchList.sort((w1, w2) -> w2.getCompany().compareTo(w1.getCompany()));
        System.out.println("Company Descending Order");
        watchList.forEach(System.out::println);
        System.out.println();

        // Cost Comparator
        watchList.sort((w1, w2) -> Double.compare(w1.getCost(), w2.getCost()));
        System.out.println("Cost Ascending Order");
        watchList.forEach(System.out::println);
        System.out.println();

        watchList.sort((w1, w2) -> Double.compare(w2.getCost(), w1.getCost()));
        System.out.println("Cost Descending Order");
        watchList.forEach(System.out::println);
        System.out.println();

        // Warranty Comparator
        watchList.sort((w1, w2) -> Integer.compare(w1.getWarranty(), w2.getWarranty()));
        System.out.println("Warranty Ascending Order");
        watchList.forEach(System.out::println);
        System.out.println();

        watchList.sort((w1, w2) -> Integer.compare(w2.getWarranty(), w1.getWarranty()));
        System.out.println("Warranty Descending Order");
        watchList.forEach(System.out::println);
        System.out.println();
    }
}
