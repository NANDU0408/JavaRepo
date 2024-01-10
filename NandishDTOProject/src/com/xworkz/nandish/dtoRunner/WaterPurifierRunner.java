package com.xworkz.nandish.dtoRunner;


import com.xworkz.nandish.dto.WaterPurifierDTO;
import com.xworkz.nandish.dtoImpl.waterPurifierImpl.*;
import com.xworkz.nandish.dtoImpl.waterPurifierImpl.BrandAscImpl;
import com.xworkz.nandish.dtoImpl.waterPurifierImpl.BrandDescImpl;
import com.xworkz.nandish.dtoImpl.waterPurifierImpl.CostAscImpl;
import com.xworkz.nandish.dtoImpl.waterPurifierImpl.CostDescImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WaterPurifierRunner {
    public static void main(String[] args) {
        WaterPurifierDTO waterPurifierDTO = new WaterPurifierDTO("Usha", "Dehli", 7500, 10);
        WaterPurifierDTO waterPurifierDTO1 = new WaterPurifierDTO("Aquagaurd", "Mumbai",9500, 15);
        WaterPurifierDTO waterPurifierDTO2 = new WaterPurifierDTO("Hitech", "Kollapur", 11000, 8);
        WaterPurifierDTO waterPurifierDTO3 = new WaterPurifierDTO("Barley", "Chennai" , 9000, 12);
        WaterPurifierDTO waterPurifierDTO4 = new WaterPurifierDTO("Mitas", "Bangalore", 6500,17);

        List<WaterPurifierDTO> list = new ArrayList<>();
        list.add(waterPurifierDTO);
        list.add(waterPurifierDTO1);
        list.add(waterPurifierDTO2);
        list.add(waterPurifierDTO3);
        list.add(waterPurifierDTO4);

        // Brand Name Comparator
        Comparator<WaterPurifierDTO> comparator = new BrandAscImpl();

        Collections.sort(list,comparator);
        System.out.println("Brand Name Ascending Order");
        for (WaterPurifierDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<WaterPurifierDTO> comparator1 = new BrandDescImpl();

        Collections.sort(list,comparator1);
        System.out.println("Brand Name Descending Order");
        for (WaterPurifierDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Location Comparator
        Comparator<WaterPurifierDTO> comparator2 = new LocationAscImpl();

        Collections.sort(list,comparator2);
        System.out.println("Location  Ascending Order");
        for (WaterPurifierDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<WaterPurifierDTO> comparator3 = new LocationDescImpl();

        Collections.sort(list,comparator3);
        System.out.println("Location Descending Order");
        for (WaterPurifierDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Cost Comparator
        Comparator<WaterPurifierDTO> comparator4 = new CostAscImpl();

        Collections.sort(list,comparator4);
        System.out.println("Cost Ascending Order");
        for (WaterPurifierDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<WaterPurifierDTO> comparator5 = new CostDescImpl();

        Collections.sort(list,comparator5);
        System.out.println("Cost Descending Order");
        for (WaterPurifierDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Quantity Comparator
        Comparator<WaterPurifierDTO> comparator6 = new QuantityAscImpl();

        Collections.sort(list,comparator6);
        System.out.println("Quantity Ascending Order");
        for (WaterPurifierDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<WaterPurifierDTO> comparator7 = new QuantityDescImpl();

        Collections.sort(list,comparator7);
        System.out.println("Quantity Descending Order");
        for (WaterPurifierDTO a: list){
            System.out.println(a);
        }
        System.out.println();
    }
}
