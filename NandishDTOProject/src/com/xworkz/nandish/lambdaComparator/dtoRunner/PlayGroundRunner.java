package com.xworkz.nandish.lambdaComparator.dtoRunner;

import com.xworkz.nandish.lambdaComparator.dto.PlayGroundDTO;
import com.xworkz.nandish.lambdaComparator.dto.PlayGroundDTO;

import java.util.ArrayList;
import java.util.List;

public class PlayGroundRunner {
    public static void main(String[] args) {

        PlayGroundDTO playgroundDTO1 = new PlayGroundDTO("City Park", "Central Area", 2000, 500);
        PlayGroundDTO playgroundDTO2 = new PlayGroundDTO("Green Meadows", "Suburbia", 3000, 1000);
        PlayGroundDTO playgroundDTO3 = new PlayGroundDTO("Sports Haven", "Downtown", 1500, 300);
        PlayGroundDTO playgroundDTO4 = new PlayGroundDTO("Family Fun Zone", "Outskirts", 2500, 800);
        PlayGroundDTO playgroundDTO5 = new PlayGroundDTO("Kids Paradise", "Residential Area", 1800, 400);

        List<PlayGroundDTO> playgroundList = new ArrayList<>();
        playgroundList.add(playgroundDTO1);
        playgroundList.add(playgroundDTO2);
        playgroundList.add(playgroundDTO3);
        playgroundList.add(playgroundDTO4);
        playgroundList.add(playgroundDTO5);

        // Name Comparator
        playgroundList.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println("Name Ascending Order");
        playgroundList.forEach(System.out::println);

        System.out.println();

        playgroundList.sort((p1, p2) -> p2.getName().compareTo(p1.getName()));
        System.out.println("Name Descending Order");
        playgroundList.forEach(System.out::println);

        System.out.println();

        // Location Comparator
        playgroundList.sort((p1, p2) -> p1.getLocation().compareTo(p2.getLocation()));
        System.out.println("Location Ascending Order");
        playgroundList.forEach(System.out::println);
        System.out.println();

        playgroundList.sort((p1, p2) -> p2.getLocation().compareTo(p1.getLocation()));
        System.out.println("Location Descending Order");
        playgroundList.forEach(System.out::println);
        System.out.println();

        // Area Comparator
        playgroundList.sort((p1, p2) -> Double.compare(p1.getArea(), p2.getArea()));
        System.out.println("Area Ascending Order");
        playgroundList.forEach(System.out::println);
        System.out.println();

        playgroundList.sort((p1, p2) -> Double.compare(p2.getArea(), p1.getArea()));
        System.out.println("Area Descending Order");
        playgroundList.forEach(System.out::println);
        System.out.println();

        // Capacity Comparator
        playgroundList.sort((p1, p2) -> Integer.compare(p1.getCapacity(), p2.getCapacity()));
        System.out.println("Capacity Ascending Order");
        playgroundList.forEach(System.out::println);
        System.out.println();

        playgroundList.sort((p1, p2) -> Integer.compare(p2.getCapacity(), p1.getCapacity()));
        System.out.println("Capacity Descending Order");
        playgroundList.forEach(System.out::println);
        System.out.println();
    }
}
