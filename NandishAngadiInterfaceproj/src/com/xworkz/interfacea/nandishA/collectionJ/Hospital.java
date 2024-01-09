package com.xworkz.interfacea.nandishA.collectionJ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hospital {
    public static void main(String[] args) {
        Collection<String> hospital = new ArrayList<>();
        hospital.add("Ramdev");
        hospital.add("Jaydev");
        hospital.add("ApollO");
        hospital.add("Columbia Asia");
        hospital.add("JanamDevo");
        hospital.add("VidhyaShankar");
        hospital.add("Generic");
        hospital.add("Government");
        hospital.add("Civil");
        hospital.add("District");
        hospital.add("AIIMS");
        hospital.add("VijayShankar");
        hospital.add("Narayan Hrudayalaya");
        hospital.add("Vikas");
        hospital.add("Janardhan");
        hospital.add("Vedhavathi");
        hospital.add("JayShankar");
        hospital.add("Ovulo");
        hospital.add("GyanGanga");
        hospital.add("Jay");

        Iterator<String> Itr = hospital.iterator();

        while (Itr.hasNext()){
            String hosp = Itr.next();
            if (hosp.endsWith("o") || hosp.endsWith("O")){
                System.out.println("The hospital name ending with o: "+hosp);
            }
        }

    }
}
