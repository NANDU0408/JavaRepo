package com.xworkz.interfacea.nandishA.abstracti;

public class Traveller implements AirPortRule {
    @Override
    public boolean rulesObeyed() {
        return true;
    }

    @Override
    public String chiefAdmin() {
        System.out.println("IN");
        return "IN";
    }

    @Override
    public String checkID() {
        String name= "Vikas";
        String id="1089";
        System.out.println("Checked");
        return id;
    }
}
