package com.xworkz.nandish.dtoRunner;

import com.xworkz.nandish.dto.RefillDTO;
import com.xworkz.nandish.dtoImpl.refillImpl.*;
import com.xworkz.nandish.dtoImpl.refillImpl.BrandAscImpl;
import com.xworkz.nandish.dtoImpl.refillImpl.BrandDescImpl;
import com.xworkz.nandish.dtoImpl.refillImpl.QuantityAscImpl;
import com.xworkz.nandish.dtoImpl.refillImpl.QuantityDescImpl;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RefillRunner {
    public static void main(String[] args) {
        RefillDTO refillDTO = new RefillDTO("Renolds", "Dehli", 7500, 10);
        RefillDTO refillDTO1 = new RefillDTO("WonderGel", "Mumbai",9500, 15);
        RefillDTO refillDTO2 = new RefillDTO("Rorito", "Kollapur", 11000, 8);
        RefillDTO refillDTO3 = new RefillDTO("Parker", "Chennai" , 9000, 12);
        RefillDTO refillDTO4 = new RefillDTO("Hero", "Bangalore", 6500,17);

        List<RefillDTO> list = new ArrayList<>();
        list.add(refillDTO);
        list.add(refillDTO1);
        list.add(refillDTO2);
        list.add(refillDTO3);
        list.add(refillDTO4);

        // Brand Comparator
        Comparator<RefillDTO> comparator = new BrandAscImpl();

        Collections.sort(list,comparator);
        System.out.println("Brand Ascending Order");
        for (RefillDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<RefillDTO> comparator1 = new BrandDescImpl();

        Collections.sort(list,comparator1);
        System.out.println("Brand Descending Order");
        for (RefillDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Company Location Comparator
        Comparator<RefillDTO> comparator2 = new CompanyLocationAscImpl();

        Collections.sort(list,comparator2);
        System.out.println("Company Location  Ascending Order");
        for (RefillDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<RefillDTO> comparator3 = new CompanyLocationDescImpl();

        Collections.sort(list,comparator3);
        System.out.println("Company Location Descending Order");
        for (RefillDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Price Comparator
        Comparator<RefillDTO> comparator4 = new PriceAscImpl();

        Collections.sort(list,comparator4);
        System.out.println("Price Ascending Order");
        for (RefillDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<RefillDTO> comparator5 = new PriceDescImpl();

        Collections.sort(list,comparator5);
        System.out.println("Price Descending Order");
        for (RefillDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Quantity Comparator
        Comparator<RefillDTO> comparator6 = new QuantityAscImpl();

        Collections.sort(list,comparator6);
        System.out.println("Quantity Ascending Order");
        for (RefillDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<RefillDTO> comparator7 = new QuantityDescImpl();

        Collections.sort(list,comparator7);
        System.out.println("Quantity Descending Order");
        for (RefillDTO a: list){
            System.out.println(a);
        }
        System.out.println();
    }
}
