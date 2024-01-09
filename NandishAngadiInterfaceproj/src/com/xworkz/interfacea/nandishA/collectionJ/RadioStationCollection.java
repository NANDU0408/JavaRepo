package com.xworkz.interfacea.nandishA.collectionJ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RadioStationCollection {
    public static void main(String[] args) {
        Collection<String> radioStationCollection = new ArrayList<>();
        radioStationCollection.add("VividBharathi");
        radioStationCollection.add("Akashwani");
        radioStationCollection.add("FM-98.3");
        radioStationCollection.add("FM-98.7");
        radioStationCollection.add("Red-FM");

        Iterator<String> itr = radioStationCollection.iterator();

        while (itr.hasNext()) {
            String station = itr.next();
            if (station.endsWith("i")) {
                System.out.println("The radio station ending with 'i': " + station);
            }
        }
    }
}

