package com.Xworkz2.abstractKey.NandishA;

public class MuseumPalace extends Palace {
    public MuseumPalace(String location, String propertyOwnerName, double areaSize) {
        super(location, propertyOwnerName, areaSize);
    }

    public MuseumPalace(String location, double areaSize) {
        super(location,areaSize);
    }

    @Override
    public void drainage(String controlor, boolean checkOnce) {
        System.out.println("Drainage system is good");
    }
}
