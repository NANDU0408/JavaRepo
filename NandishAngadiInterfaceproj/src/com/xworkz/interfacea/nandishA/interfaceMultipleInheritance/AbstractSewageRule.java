package com.xworkz.interfacea.nandishA.interfaceMultipleInheritance;

public abstract class AbstractSewageRule implements SewageRule{
    @Override
    public boolean sewageCleaningTruck() {
        return false;
    }

    @Override
    public String cleaningContractor() {
        return null;
    }
}
