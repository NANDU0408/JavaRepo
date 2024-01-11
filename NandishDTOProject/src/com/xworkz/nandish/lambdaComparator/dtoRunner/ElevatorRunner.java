package com.xworkz.nandish.lambdaComparator.dtoRunner;

import com.xworkz.nandish.lambdaComparator.dto.ElevatorDTO;


import java.util.ArrayList;
import java.util.List;

public class ElevatorRunner {
    public static void main(String[] args) {

        ElevatorDTO elevatorDTO = new ElevatorDTO("Passenger Elevators", "Otis Elevator Company", 75, 35);
        ElevatorDTO elevatorDTO1 = new ElevatorDTO("Freight Elevators", "Schindler Group",51, 25);
        ElevatorDTO elevatorDTO2 = new ElevatorDTO("Home Elevators", "Thyssenkrupp Elevato", 15, 52);
        ElevatorDTO elevatorDTO3 = new ElevatorDTO("Glass Elevators", "Mitsubishi Electric Corporation" , 19, 15);
        ElevatorDTO elevatorDTO4 = new ElevatorDTO("Scenic Elevators", "Fujitec", 65,7);

        List<ElevatorDTO> list = new ArrayList<>();
        list.add(elevatorDTO);
        list.add(elevatorDTO1);
        list.add(elevatorDTO2);
        list.add(elevatorDTO3);
        list.add(elevatorDTO4);


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
