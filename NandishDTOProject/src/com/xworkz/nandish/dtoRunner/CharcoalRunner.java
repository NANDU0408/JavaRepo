package com.xworkz.nandish.dtoRunner;

import com.xworkz.nandish.dto.CharcoalDTO;
import com.xworkz.nandish.dtoImpl.charcoalImpl.*;
import com.xworkz.nandish.dtoImpl.charcoalImpl.CostAscImpl;
import com.xworkz.nandish.dtoImpl.charcoalImpl.CostDescImpl;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CharcoalRunner {
    public static void main(String[] args) {
        CharcoalDTO charcoalDTO = new CharcoalDTO("Wood Charcoal", "Rajasthan", 7500, 10);
        CharcoalDTO charcoalDTO1 = new CharcoalDTO("Activated Charcoal", "Pune",9500, 15);
        CharcoalDTO charcoalDTO2 = new CharcoalDTO("Charcoal Briquettes", "Kollapur", 11000, 8);
        CharcoalDTO charcoalDTO3 = new CharcoalDTO("Binchotan Charcoal", "Chennai" , 9000, 12);
        CharcoalDTO charcoalDTO4 = new CharcoalDTO("Sugar Charcoal", "Bangalore", 6500,17);

        List<CharcoalDTO> list = new ArrayList<>();
        list.add(charcoalDTO);
        list.add(charcoalDTO1);
        list.add(charcoalDTO2);
        list.add(charcoalDTO3);
        list.add(charcoalDTO4);

        // Type Comparator
        Comparator<CharcoalDTO> comparator = new TypeAscImpl();

        Collections.sort(list,comparator);
        System.out.println("Type Ascending Order");
        for (CharcoalDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<CharcoalDTO> comparator1 = new TypeDescImpl();

        Collections.sort(list,comparator1);
        System.out.println("Type Descending Order");
        for (CharcoalDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Location Comparator
        Comparator<CharcoalDTO> comparator2 = new LocationAscImpl();

        Collections.sort(list,comparator2);
        System.out.println("Location Ascending Order");
        for (CharcoalDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<CharcoalDTO> comparator3 = new LocationDescImpl();

        Collections.sort(list,comparator3);
        System.out.println("Location Descending Order");
        for (CharcoalDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Cost Comparator
        Comparator<CharcoalDTO> comparator4 = new CostAscImpl();

        Collections.sort(list,comparator4);
        System.out.println("Cost Ascending Order");
        for (CharcoalDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<CharcoalDTO> comparator5 = new CostDescImpl();

        Collections.sort(list,comparator5);
        System.out.println("Cost Descending Order");
        for (CharcoalDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Quantity Comparator
        Comparator<CharcoalDTO> comparator6 = new QuantityAscImpl();

        Collections.sort(list,comparator6);
        System.out.println("Quantity Ascending Order");
        for (CharcoalDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<CharcoalDTO> comparator7 = new QuantityDescImpl();

        Collections.sort(list,comparator7);
        System.out.println("Quantity Descending Order");
        for (CharcoalDTO a: list){
            System.out.println(a);
        }
        System.out.println();
    }
}
