package com.xworkz.nandish.lambdaComparator.dtoRunner;

import com.xworkz.nandish.dto.BeltDTO;
import com.xworkz.nandish.dtoImpl.beltImpl.*;
import com.xworkz.nandish.lambdaComparator.dto.SkyWalkDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SkyWalkRunner {
    public static void main(String[] args) {

            SkyWalkDTO skyWalkDTO = new SkyWalkDTO("Pedestrian Overpass/Sky Bridge", "Hubli", 75, 10);
            SkyWalkDTO skyWalkDTO1 = new SkyWalkDTO("Urban Skywalk", "Pune",95, 15);
            SkyWalkDTO skyWalkDTO2 = new SkyWalkDTO("Tourist Skywalks", "Kollapur", 51, 8);
            SkyWalkDTO skyWalkDTO3 = new SkyWalkDTO("Shopping Mall Skywalks", "Chennai" , 90, 12);
            SkyWalkDTO skyWalkDTO4 = new SkyWalkDTO("Corporate Campus Skywalks", "Bangalore", 65,17);

            List<SkyWalkDTO> list = new ArrayList<>();
            list.add(skyWalkDTO);
            list.add(skyWalkDTO1);
            list.add(skyWalkDTO2);
            list.add(skyWalkDTO3);
            list.add(skyWalkDTO4);


            // Location Comparator
            list.sort((s1, s2) -> s1.getLocation().compareTo(s2.getLocation()));
            System.out.println("Location Ascending Order");
            list.forEach(System.out::println);


//            Comparator<SkyWalkDTO> comparator =(S1, S2)->{
//                return S1.getLocation().compareTo(S2.getLocation());
//            };
//
//            Collections.sort(list,comparator);
//            System.out.println("Location Ascending Order");
//            for (SkyWalkDTO a: list){
//                System.out.println(a);
//            }
            System.out.println();

            list.sort((s1, s2) -> s2.getLocation().compareTo(s1.getLocation()));
            System.out.println("Location Descending Order");
            list.forEach(System.out::println);

//            Comparator<SkyWalkDTO> comparator1 =(S1, S2)->{
//                    return S2.getLocation().compareTo(S1.getLocation());
//            };
//
//            Collections.sort(list,comparator1);
//            System.out.println("Location Descending Order");
//            for (SkyWalkDTO a: list){
//                    System.out.println(a);
//            }
            System.out.println();

            //Type Comparator
            list.sort((s1, s2)-> s1.getType().compareTo(s2.getType()));
            System.out.println("Type Ascending Order");
            list.forEach(System.out::println);
            System.out.println();

            list.sort((s1, s2)->s2.getType().compareTo(s1.getType()));
            System.out.println("Type Descending Order");
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

//            Comparator<SkyWalkDTO> comparator1 =(S1, S2)->{
//                    return Double.compare(S1.getHeight(), S2.getHeight());
//            };
//
//            Collections.sort(list,comparator1);
//            System.out.println("Location General Ascending Order");
//            for (SkyWalkDTO a: list){
//                    System.out.println(a);
//            }
//
//            System.out.println();
//
//            Comparator<SkyWalkDTO> comparator2 =(S1, S2)->{
//                    return Double.compare(S2.getHeight(), S1.getHeight());
//            };
//
//            Collections.sort(list,comparator2);
//            System.out.println("Location General Descending Order");
//            for (SkyWalkDTO a: list){
//                    System.out.println(a);
//            }

            //Length Comparator
            list.sort((s1, s2)-> Double.compare(s1.getLength(), s2.getLength()));
            System.out.println("Length Ascending Order");
            list.forEach(System.out::println);
            System.out.println();

            list.sort((s1, s2)->Double.compare(s2.getLength(), s1.getLength()));
            System.out.println("Length Descending Order");
            list.forEach(System.out::println);
            System.out.println();

    }
}
