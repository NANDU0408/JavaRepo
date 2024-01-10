package com.xworkz.nandish.dtoRunner;

import com.xworkz.nandish.dto.ParkingDTO;
import com.xworkz.nandish.dtoImpl.coverImpl.*;
import com.xworkz.nandish.dtoImpl.parkingImpl.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ParkingRunner {
    public static void main(String[] args) {
        ParkingDTO parkingDTO = new ParkingDTO("Ram", "Chennai", 40, 10);
        ParkingDTO parkingDTO1 = new ParkingDTO("Vijay", "Dharwad",20, 5);
        ParkingDTO parkingDTO2 = new ParkingDTO("Gourishankar", "Kollapur", 50, 8);
        ParkingDTO parkingDTO3 = new ParkingDTO("Anuj", "Thirumala" , 44, 4);
        ParkingDTO parkingDTO4 = new ParkingDTO("Jaydev", "Massuri", 65,7);

        List<ParkingDTO> list = new ArrayList<>();
        list.add(parkingDTO);
        list.add(parkingDTO1);
        list.add(parkingDTO2);
        list.add(parkingDTO3);
        list.add(parkingDTO4);

        // Contractor Comparator
        Comparator<ParkingDTO> comparator = new ContractorAscImpl();

        Collections.sort(list,comparator);
        System.out.println("Contractor Ascending Order");
        for (ParkingDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<ParkingDTO> comparator1 = new ContractorDescImpl();

        Collections.sort(list,comparator1);
        System.out.println("Type Descending Order");
        for (ParkingDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Location Comparator
        Comparator<ParkingDTO> comparator2 = new LocationAscImpl();

        Collections.sort(list,comparator2);
        System.out.println("Location Ascending Order");
        for (ParkingDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<ParkingDTO> comparator3 = new LocationDescImpl();

        Collections.sort(list,comparator3);
        System.out.println("Location Descending Order");
        for (ParkingDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Cost Comparator
        Comparator<ParkingDTO> comparator4 = new CostAscImpl();

        Collections.sort(list,comparator4);
        System.out.println("Cost Ascending Order");
        for (ParkingDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<ParkingDTO> comparator5 = new CostDescImpl();

        Collections.sort(list,comparator5);
        System.out.println("Cost Descending Order");
        for (ParkingDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Area Size Comparator
        Comparator<ParkingDTO> comparator6 = new AreaSizeAscImpl();

        Collections.sort(list,comparator6);
        System.out.println("Area Size Ascending Order");
        for (ParkingDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<ParkingDTO> comparator7 = new AreaSizeDescImpl();

        Collections.sort(list,comparator7);
        System.out.println("Area Size Descending Order");
        for (ParkingDTO a: list){
            System.out.println(a);
        }
        System.out.println();
    }
}
