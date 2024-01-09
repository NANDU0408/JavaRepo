package com.xworkz.interfacea.nandishA.interfaceMultipleInheritance;

public class MetroContractor extends Contractor implements GarbageRule{
    @Override
    public boolean garbageCollected() {
        System.out.println("Collected");
        return false;
    }

    @Override
    public String garbageSeparation() {
        System.out.println("Separated");
        return null;
    }
}
