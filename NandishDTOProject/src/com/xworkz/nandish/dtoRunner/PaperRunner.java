package com.xworkz.nandish.dtoRunner;

import com.xworkz.nandish.dto.PaperDTO;
import com.xworkz.nandish.dtoImpl.paperImpl.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PaperRunner {
    public static void main(String[] args) {
        PaperDTO paperDTO = new PaperDTO("HighSchool","VikasPublications",250,500);
        PaperDTO paperDTO1 = new PaperDTO("College","GeneralPublications",180,450);
        PaperDTO paperDTO2 = new PaperDTO("KNN","VedhaPublications",240,600);
        PaperDTO paperDTO3 = new PaperDTO("Vijay","RamPublications",160,350);
        PaperDTO paperDTO4 = new PaperDTO("Janardhan","JaydevPublications",400,1000);

        List<PaperDTO> list = new ArrayList<>();
        list.add(paperDTO);
        list.add(paperDTO1);
        list.add(paperDTO2);
        list.add(paperDTO3);
        list.add(paperDTO4);

        //Company Name Comparator
        Comparator<PaperDTO> ref = new PaperImpl();

        Collections.sort(list,ref);
        System.out.println("Company Name Ascending Order");
        for (PaperDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<PaperDTO> ref1 = new NameDescImpl();

        Collections.sort(list,ref1);
        System.out.println("Company Name Descending Order");
        for (PaperDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        //Brand Name Comparator
        Comparator<PaperDTO> ref2 = new BrandImpl();

        Collections.sort(list,ref2);
        System.out.println("BrandName Ascending Order");
        for (PaperDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<PaperDTO> ref3 = new BrandDescImpl();

        Collections.sort(list,ref3);
        System.out.println("BrandName Descending Order");
        for (PaperDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        //Cost Comparator
        Comparator<PaperDTO> ref4 = new CostAscImpl();

        Collections.sort(list,ref4);
        System.out.println("Cost Ascending Order");
        for (PaperDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<PaperDTO> ref5 = new CostDescImpl();

        Collections.sort(list,ref5);
        System.out.println("Cost Descending Order");
        for (PaperDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        //Quantity Comparator
        Comparator<PaperDTO> ref6 = new QuantityAscImpl();

        Collections.sort(list,ref6);
        System.out.println("Quantity Ascending Order");
        for (PaperDTO a: list){
            System.out.println(a);
        }
        System.out.println();

        Comparator<PaperDTO> ref7 = new QuantityAscImpl();

        Collections.sort(list,ref7);
        System.out.println("Quantity Descending Order");
        for (PaperDTO a: list){
            System.out.println(a);
        }
        System.out.println();
    }
}
