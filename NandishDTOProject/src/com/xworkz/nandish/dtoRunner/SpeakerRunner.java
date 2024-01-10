package com.xworkz.nandish.dtoRunner;

import com.xworkz.nandish.dto.SpeakerDTO;
import com.xworkz.nandish.dtoImpl.SpeakerImpl.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SpeakerRunner {
    public static void main(String[] args) {
        SpeakerDTO speakerDTO = new SpeakerDTO("Auhuja", "Bajantri", 7500, 400);
        SpeakerDTO speakerDTO1 = new SpeakerDTO("Buhuja", "Vanashree",9500, 650);
        SpeakerDTO speakerDTO2 = new SpeakerDTO("JBL", "Ganapathi", 11000, 700);
        SpeakerDTO speakerDTO3 = new SpeakerDTO("Sony", "Syndria" , 9000, 556);
        SpeakerDTO speakerDTO4 = new SpeakerDTO("Boat", "Bism", 6500,690);

        List<SpeakerDTO> list = new ArrayList<>();
        list.add(speakerDTO);
        list.add(speakerDTO1);
        list.add(speakerDTO2);
        list.add(speakerDTO3);
        list.add(speakerDTO4);

        // Brand Name Comparator
        Comparator<SpeakerDTO> comparator = new BrandAscImpl();

        Collections.sort(list,comparator);
        System.out.println("Brand Name Ascending Order");
        for (SpeakerDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<SpeakerDTO> comparator1 = new BrandDescImpl();

        Collections.sort(list,comparator1);
        System.out.println("Brand Name Descending Order");
        for (SpeakerDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Company Name Comparator
        Comparator<SpeakerDTO> comparator2 = new CompanyAscImpl();

        Collections.sort(list,comparator2);
        System.out.println("Company Name Ascending Order");
        for (SpeakerDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<SpeakerDTO> comparator3 = new CompanyDescImpl();

        Collections.sort(list,comparator3);
        System.out.println("Company Name Descending Order");
        for (SpeakerDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Cost Comparator
        Comparator<SpeakerDTO> comparator4 = new CostAscImpl();

        Collections.sort(list,comparator4);
        System.out.println("Cost Ascending Order");
        for (SpeakerDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<SpeakerDTO> comparator5 = new CostDescImpl();

        Collections.sort(list,comparator5);
        System.out.println("Cost Descending Order");
        for (SpeakerDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        // Decibles Comparator
        Comparator<SpeakerDTO> comparator6 = new DecibleAscImpl();

        Collections.sort(list,comparator6);
        System.out.println("Decibles Ascending Order");
        for (SpeakerDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<SpeakerDTO> comparator7 = new DecibleDescImpl();

        Collections.sort(list,comparator7);
        System.out.println("Decibles Descending Order");
        for (SpeakerDTO a: list){
            System.out.println(a);
        }
        System.out.println();
    }
}
