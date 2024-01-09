package com.xworkz.interfacea.nandishA.collectionJ;

import java.util.ArrayList;
import java.util.Collection;

public class ChariotCheck {
    public Collection<String> getChariots1() {

        Collection<String> chariot = new ArrayList<>();
        chariot.add("Nandighosa");
        chariot.add("Dwarapadalana");
        chariot.add("Kapi Dhwaja");
        chariot.add("Dharma Padha");
        chariot.add("Daruga");
        chariot.add("Matali");
        System.out.println("Before Removal: "+chariot);

        Collection<String> chariot1 = new ArrayList<>();
        chariot1.add("Nandighosa");
        chariot1.add("Matali");
        chariot1.add("Jam");

        System.out.println(chariot.removeAll(chariot1));
        System.out.println("After removing: "+chariot);
        System.out.println("After removal of jam: "+chariot1);
        return chariot;
    }
}
