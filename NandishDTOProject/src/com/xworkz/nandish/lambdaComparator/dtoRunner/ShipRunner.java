package com.xworkz.nandish.lambdaComparator.dtoRunner;

import com.xworkz.nandish.lambdaComparator.dto.GeyserDTO;
import com.xworkz.nandish.lambdaComparator.dto.ShipDTO;

import java.util.ArrayList;
import java.util.List;

public class ShipRunner {
    public static void main(String[] args) {

        ShipDTO shipDTO = new ShipDTO("Mayflower", "John", 7500, 150);
        ShipDTO shipDTO1 = new ShipDTO("Santa Maria", "Christopher Columbus",9500, 265);
        ShipDTO shipDTO2 = new ShipDTO("HMS Victory", "Admiral Nelson", 5100, 410);
        ShipDTO shipDTO3 = new ShipDTO("Cutty Sark", "Captain James Cook" , 9000, 267);
        ShipDTO shipDTO4 = new ShipDTO("Queen Mary", "Adam", 6500,311);

        List<ShipDTO> list = new ArrayList<>();
        list.add(shipDTO);
        list.add(shipDTO1);
        list.add(shipDTO2);
        list.add(shipDTO3);
        list.add(shipDTO4);


        // Name Comparator
        list.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("Name Ascending Order");
        list.forEach(System.out::println);

        System.out.println();

        list.sort((s1, s2) -> s2.getName().compareTo(s1.getName()));
        System.out.println("Name Descending Order");
        list.forEach(System.out::println);

        System.out.println();

        //Owner Comparator
        list.sort((s1, s2)-> s1.getOwner().compareTo(s2.getOwner()));
        System.out.println("Owner Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->s2.getOwner().compareTo(s1.getOwner()));
        System.out.println("Owner Descending Order");
        list.forEach(System.out::println);
        System.out.println();

        //Ticket Price Comparator
        list.sort((s1, s2)-> Double.compare(s1.getTicketPrice(), s2.getTicketPrice()));
        System.out.println("Ticket Price Ascending Order");
        list.forEach(System.out::println);
        System.out.println();

        list.sort((s1, s2)->Double.compare(s2.getTicketPrice(), s1.getTicketPrice()));
        System.out.println("Ticket Price Descending Order");
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
