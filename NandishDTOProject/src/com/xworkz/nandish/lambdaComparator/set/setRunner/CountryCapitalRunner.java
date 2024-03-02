package com.xworkz.nandish.comparable.set.setRunner;

import com.xworkz.nandish.comparable.set.setDTO.countrycapitalDTO.CapitalDTO;
import com.xworkz.nandish.comparable.set.setDTO.countrycapitalDTO.CountryDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountryCapitalRunner {
    public static void main(String[] args) {
        CountryDTO country1 = new CountryDTO("USA", 331000000, "North America");
        CountryDTO country2 = new CountryDTO("India", 1393000000, "Asia");
        CountryDTO country3 = new CountryDTO("Brazil", 213993437, "South America");
        CountryDTO country4 = new CountryDTO("China", 1444216107, "Asia");
        CountryDTO country5 = new CountryDTO("Australia", 25499884, "Oceania");


        CapitalDTO capital1 = new CapitalDTO("Washington, D.C.", 705749, "White House");
        CapitalDTO capital2 = new CapitalDTO("New Delhi", 29400000, "India Gate");
        CapitalDTO capital3 = new CapitalDTO("Brasília", 4791896, "National Congress Building");
        CapitalDTO capital4 = new CapitalDTO("Beijing", 21542000, "Forbidden City");
        CapitalDTO capital5 = new CapitalDTO("Canberra", 431200, "Parliament House");

        Map<CountryDTO, CapitalDTO> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put(country1, capital1);
        countryCapitalMap.put(country2, capital2);
        countryCapitalMap.put(country3, capital3);
        countryCapitalMap.put(country4, capital4);
        countryCapitalMap.put(country5, capital5);

        CountryDTO country6 = new CountryDTO("USA", 37742154, "North America");
        CapitalDTO capital6 = new CapitalDTO("Ottawa", 994837, "Parliament Hill");

        System.out.println("Country6 is existing: " + countryCapitalMap.containsKey(country6));
        System.out.println();

        countryCapitalMap.put(country6, capital6);

        countryCapitalMap.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("===================");

        System.out.println();
        System.out.println("Printing both key and value");
        Set<Map.Entry<CountryDTO, CapitalDTO>> entrySet = countryCapitalMap.entrySet();
        for (Map.Entry<CountryDTO, CapitalDTO> entry : entrySet) {
            CountryDTO key1 = entry.getKey();
            CapitalDTO value1 = entry.getValue();
            System.out.println("Country: " + key1 + ", Capital: " + value1);
        }
    }
}
