package com.xworkz.nandish.dtoRunner;

import com.xworkz.nandish.dto.BeltDTO;
import com.xworkz.nandish.dtoImpl.beltImpl.*;
import com.xworkz.nandish.dtoImpl.beltImpl.CostAscImpl;
import com.xworkz.nandish.dtoImpl.beltImpl.CostDescImpl;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BeltRunner {
    public static void main(String[] args) {
        BeltDTO beltDTO = new BeltDTO("Gucci", "Rajasthan", 750, 10);
        BeltDTO beltDTO1 = new BeltDTO("Louis Vuitton", "Pune",950, 15);
        BeltDTO beltDTO2 = new BeltDTO("Versace", "Kollapur", 1100, 8);
        BeltDTO beltDTO3 = new BeltDTO("Hermès", "Chennai" , 900, 12);
        BeltDTO beltDTO4 = new BeltDTO("Fendi", "Bangalore", 650,17);

        List<BeltDTO> list = new ArrayList<>();
        list.add(beltDTO);
        list.add(beltDTO1);
        list.add(beltDTO2);
        list.add(beltDTO3);
        list.add(beltDTO4);

        // Brand Comparator
        Comparator<BeltDTO> comparator = new BrandAscImpl();

        Collections.sort(list,comparator);
        System.out.println("Brand Ascending Order");
        for (BeltDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<BeltDTO> comparator1 = new BrandDescImpl();

        Collections.sort(list,comparator1);
        System.out.println("Brand Descending Order");
        for (BeltDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Owner Comparator
        Comparator<BeltDTO> comparator2 = new OwnerAscImpl();

        Collections.sort(list,comparator2);
        System.out.println("Owner Ascending Order");
        for (BeltDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<BeltDTO> comparator3 = new OwnerDescImpl();

        Collections.sort(list,comparator3);
        System.out.println("Owner Descending Order");
        for (BeltDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Cost Comparator
        Comparator<BeltDTO> comparator4 = new CostAscImpl();

        Collections.sort(list,comparator4);
        System.out.println("Cost Ascending Order");
        for (BeltDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<BeltDTO> comparator5 = new CostDescImpl();

        Collections.sort(list,comparator5);
        System.out.println("Cost Descending Order");
        for (BeltDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Size Comparator
        Comparator<BeltDTO> comparator6 = new SizeAscImpl();

        Collections.sort(list,comparator6);
        System.out.println("Size Ascending Order");
        for (BeltDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<BeltDTO> comparator7 = new SizeDescImpl();

        Collections.sort(list,comparator7);
        System.out.println("Size Descending Order");
        for (BeltDTO a: list){
            System.out.println(a);
        }
        System.out.println();
    }
}
