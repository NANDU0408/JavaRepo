package com.xworkz.interfacea.nandishA.interfaceMultipleInheritance;

public class Contractor extends AbstractSewageRule implements BBMPRule{
    @Override
    public boolean cityDevelopment() {
        System.out.println("Developed");
        return false;
    }

    @Override
    public String developmentOfficer() {
        System.out.println("Yes");
        return null;
    }

    @Override
    public boolean areaDeveloped() {
        System.out.println("DEVELOPED");
        return false;
    }

    @Override
    public String inchargeOfficer() {
        System.out.println("Yes");
        return null;
    }

    @Override
    public boolean investigated() {
        System.out.println("Investigated");
        return false;
    }

    @Override
    public String investigationOfficer() {
        System.out.println("Yes");
        return null;
    }
}
