package com.xworkz.nandish.dtoRunner;


import com.xworkz.nandish.dto.SparkPlugDTO;
import com.xworkz.nandish.dtoImpl.sparkPlugImpl.*;
import com.xworkz.nandish.dtoImpl.sparkPlugImpl.BrandAscImpl;
import com.xworkz.nandish.dtoImpl.sparkPlugImpl.BrandDescImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SparkPlugRunner {
    public static void main(String[] args) {
        SparkPlugDTO sparkPlugDTO = new SparkPlugDTO("Renolds", "Dehli", 7500, 10);
        SparkPlugDTO sparkPlugDTO1 = new SparkPlugDTO("WonderGel", "Mumbai",9500, 15);
        SparkPlugDTO sparkPlugDTO2 = new SparkPlugDTO("Rorito", "Kollapur", 11000, 8);
        SparkPlugDTO sparkPlugDTO3 = new SparkPlugDTO("Parker", "Chennai" , 9000, 12);
        SparkPlugDTO sparkPlugDTO4 = new SparkPlugDTO("Hero", "Bangalore", 6500,17);

        List<SparkPlugDTO> list = new ArrayList<>();
        list.add(sparkPlugDTO);
        list.add(sparkPlugDTO1);
        list.add(sparkPlugDTO2);
        list.add(sparkPlugDTO3);
        list.add(sparkPlugDTO4);

        // Brand Comparator
        Comparator<SparkPlugDTO> comparator = new BrandAscImpl();

        Collections.sort(list,comparator);
        System.out.println("Brand Ascending Order");
        for (SparkPlugDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<SparkPlugDTO> comparator1 = new BrandDescImpl();

        Collections.sort(list,comparator1);
        System.out.println("Brand Descending Order");
        for (SparkPlugDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Company Name Comparator
        Comparator<SparkPlugDTO> comparator2 = new CompanyNameAscImpl();

        Collections.sort(list,comparator2);
        System.out.println("Company Name  Ascending Order");
        for (SparkPlugDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<SparkPlugDTO> comparator3 = new CompanyNameDescImpl();

        Collections.sort(list,comparator3);
        System.out.println("Company Name Descending Order");
        for (SparkPlugDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Cost Comparator
        Comparator<SparkPlugDTO> comparator4 = new CostAscImpl();

        Collections.sort(list,comparator4);
        System.out.println("Cost Ascending Order");
        for (SparkPlugDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<SparkPlugDTO> comparator5 = new CostDescImpl();

        Collections.sort(list,comparator5);
        System.out.println("Cost Descending Order");
        for (SparkPlugDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Warranty Comparator
        Comparator<SparkPlugDTO> comparator6 = new WarrantyAscImpl();

        Collections.sort(list,comparator6);
        System.out.println("Warranty Ascending Order");
        for (SparkPlugDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<SparkPlugDTO> comparator7 = new WarrantyDescImpl();

        Collections.sort(list,comparator7);
        System.out.println("Warranty Descending Order");
        for (SparkPlugDTO a: list){
            System.out.println(a);
        }
        System.out.println();
    }
}
