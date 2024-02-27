package com.xworkz.nandish.comparable.set.complexsimple.runner;

import com.xworkz.nandish.comparable.set.complexsimple.complexsimpleDTO.countrycapitalDTO2.CapitalDTO2;
import com.xworkz.nandish.comparable.set.complexsimple.complexsimpleDTO.countrycapitalDTO2.CountryDTO2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class CountryCapitalRunner2 {
    public static void main(String[] args) {
        // Creating CountryDTO and CapitalDTO objects
        CountryDTO2 country1 = new CountryDTO2("USA", 331000000, "North America");
        CountryDTO2 country2 = new CountryDTO2("India", 1393000000, "Asia");
        CountryDTO2 country3 = new CountryDTO2("Brazil", 213993437, "South America");
        CountryDTO2 country4 = new CountryDTO2("China", 1444216107, "Asia");
        CountryDTO2 country5 = new CountryDTO2("Australia", 25499884, "Oceania");

        CapitalDTO2 capital1 = new CapitalDTO2("Washington, D.C.", 705749, "White House");
        CapitalDTO2 capital2 = new CapitalDTO2("New Delhi", 29400000, "India Gate");
        CapitalDTO2 capital3 = new CapitalDTO2("Brasília", 4791896, "National Congress Building");
        CapitalDTO2 capital4 = new CapitalDTO2("Beijing", 21542000, "Forbidden City");
        CapitalDTO2 capital5 = new CapitalDTO2("Canberra", 431200, "Parliament House");

        // Creating the original map
        Map<CountryDTO2, CapitalDTO2> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put(country1, capital1);
        countryCapitalMap.put(country2, capital2);
        countryCapitalMap.put(country3, capital3);
        countryCapitalMap.put(country4, capital4);
        countryCapitalMap.put(country5, capital5);

        // Creating a new map for demonstration purposes
        Map<CountryDTO2, CapitalDTO2> newCountryCapitalMap = new HashMap<>();
        newCountryCapitalMap.putAll(countryCapitalMap);

        // Outputting the size of both maps
        System.out.println("Original Map Size: " + countryCapitalMap.size());
        System.out.println("New Map Size: " + newCountryCapitalMap.size());
        System.out.println("===================");

        // Removing an entry by key from the original map
        CountryDTO2 countryToRemove = country2;
        CapitalDTO2 removedCapital = countryCapitalMap.remove(countryToRemove);
        System.out.println("Removed Country: " + countryToRemove + ", Removed Capital: " + removedCapital);
        System.out.println("Updated Map Size: " + countryCapitalMap.size());
        System.out.println("===================");

        // Checking if a key exists in the map
        CountryDTO2 countryToCheck = country4;
        System.out.println("Is " + countryToCheck + " existing in the map? " + countryCapitalMap.containsKey(countryToCheck));
        System.out.println("===================");

        // Checking if a value exists in the map
        CapitalDTO2 capitalToCheck = capital3;
        System.out.println("Is " + capitalToCheck + " existing in the map? " + countryCapitalMap.containsValue(capitalToCheck));
        System.out.println("===================");

        // Getting all keys from the map
        Set<CountryDTO2> keys = countryCapitalMap.keySet();
        System.out.println("All Keys in the Map: " + keys);
        System.out.println("===================");

        // Getting all values from the map
        Collection<CapitalDTO2> values = countryCapitalMap.values();
        System.out.println("All Values in the Map: " + values);
        System.out.println("===================");

        // Clearing all entries in the map
        countryCapitalMap.clear();
        System.out.println("Map after clearing all entries: " + countryCapitalMap);

        // Other abstract methods
        System.out.println("Is the map empty? " + countryCapitalMap.isEmpty());
        System.out.println("New map contains all entries from the original map? " + newCountryCapitalMap.equals(countryCapitalMap));
        System.out.println("Hash code of the original map: " + countryCapitalMap.hashCode());
    }
}