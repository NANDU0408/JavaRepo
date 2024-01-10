package com.xworkz.nandish.dtoRunner;

import com.xworkz.nandish.dto.BeltDTO;
import com.xworkz.nandish.dto.CoverDTO;
import com.xworkz.nandish.dtoImpl.beltImpl.*;
import com.xworkz.nandish.dtoImpl.coverImpl.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CoverRunner {
    public static void main(String[] args) {
        CoverDTO coverDTO = new CoverDTO("Spigen", "Vimlapal", 75, 10);
        CoverDTO coverDTO1 = new CoverDTO("OtterBox", "Jadhoo",95, 5);
        CoverDTO coverDTO2 = new CoverDTO("Moshi", "Vijala", 11, 8);
        CoverDTO coverDTO3 = new CoverDTO("UAG", "Ramal" , 9, 4);
        CoverDTO coverDTO4 = new CoverDTO("Case-Mate", "Vioga", 65,7);

        List<CoverDTO> list = new ArrayList<>();
        list.add(coverDTO);
        list.add(coverDTO1);
        list.add(coverDTO2);
        list.add(coverDTO3);
        list.add(coverDTO4);

        // Type Comparator
        Comparator<CoverDTO> comparator = new TypeAscImpl();

        Collections.sort(list,comparator);
        System.out.println("Type Ascending Order");
        for (CoverDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<CoverDTO> comparator1 = new TypeDescImpl();

        Collections.sort(list,comparator1);
        System.out.println("Type Descending Order");
        for (CoverDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Company Comparator
        Comparator<CoverDTO> comparator2 = new CompanyAscImpl();

        Collections.sort(list,comparator2);
        System.out.println("Company Ascending Order");
        for (CoverDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<CoverDTO> comparator3 = new CompanyDescImpl();

        Collections.sort(list,comparator3);
        System.out.println("Company Descending Order");
        for (CoverDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Price Comparator
        Comparator<CoverDTO> comparator4 = new PriceAscImpl();

        Collections.sort(list,comparator4);
        System.out.println("Price Ascending Order");
        for (CoverDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<CoverDTO> comparator5 = new PriceDescImpl();

        Collections.sort(list,comparator5);
        System.out.println("Price Descending Order");
        for (CoverDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Rating Comparator
        Comparator<CoverDTO> comparator6 = new RatingAscImpl();

        Collections.sort(list,comparator6);
        System.out.println("Rating Ascending Order");
        for (CoverDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<CoverDTO> comparator7 = new RatingDescImpl();

        Collections.sort(list,comparator7);
        System.out.println("Rating Descending Order");
        for (CoverDTO a: list){
            System.out.println(a);
        }
        System.out.println();
    }
}
