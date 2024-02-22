package com.xworkz.nandish.comparable.set.setRunner;

import com.xworkz.nandish.comparable.set.setDTO.AddressDTO;
import com.xworkz.nandish.comparable.set.setDTO.PersonDTO;
import com.xworkz.nandish.comparable.set.setDTO.godbirthDTO.BirthPlaceDTO;
import com.xworkz.nandish.comparable.set.setDTO.godbirthDTO.GodDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GodBirthRunner {
    public static void main(String[] args) {
        GodDTO godDTO = new GodDTO("Vishnu", "Ram","Kaushalya");
        GodDTO godDTO1 = new GodDTO("Vishnu","Krishna","Devaki");
        GodDTO godDTO2 = new GodDTO("Lakshmi","VaishnoDevi","Bhudevi");
        GodDTO godDTO3 = new GodDTO("Lakshmi","Seetha","Bhudevi");
        GodDTO godDTO4 = new GodDTO("Drakshaini","Parwathi","Mainavati");

        BirthPlaceDTO birthPlaceDTO = new BirthPlaceDTO("Ayodhya",7,"Ravan");
        BirthPlaceDTO birthPlaceDTO1 = new BirthPlaceDTO("Mathura",8,"Kamsa");
        BirthPlaceDTO birthPlaceDTO2 = new BirthPlaceDTO("SouthIndia",4,"Katra Bhairav");
        BirthPlaceDTO birthPlaceDTO3 = new BirthPlaceDTO("Mithila",5,"MahiRavan");
        BirthPlaceDTO birthPlaceDTO4 = new BirthPlaceDTO("Himalaya",2,"Andhakasura");

        Map<GodDTO,BirthPlaceDTO> god = new HashMap<>();
        god.put(godDTO,birthPlaceDTO);
        god.put(godDTO1,birthPlaceDTO1);
        god.put(godDTO2,birthPlaceDTO2);
        god.put(godDTO3,birthPlaceDTO3);
        god.put(godDTO4,birthPlaceDTO4);



        GodDTO godDTO5 = new GodDTO("Shiva","Ram","Anjana");
        BirthPlaceDTO birthPlaceDTO5= new BirthPlaceDTO("Anjanadri",7,"Pishachraj");

        System.out.println("God6 is existing: " +god.containsKey(godDTO5));
        System.out.println();
        god.put(godDTO5,birthPlaceDTO5);

        god.forEach((k,v)-> System.out.println(k +" : "+v));

        System.out.println("===================");

        System.out.println();
        System.out.println("Printing both key and value");
        Set<Map.Entry<GodDTO,BirthPlaceDTO>> entrySet = god.entrySet();
        for (Map.Entry<GodDTO,BirthPlaceDTO> entry : entrySet){
            GodDTO key1 = entry.getKey();
            BirthPlaceDTO value1 = entry.getValue();
            System.out.println("God: " + key1 + ", Birthplace: " + value1);
        }

    }
}
