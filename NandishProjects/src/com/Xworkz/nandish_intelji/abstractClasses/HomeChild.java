package com.Xworkz.nandish_intelji.abstractClasses;

public class HomeChild extends Home{
    @Override
    public void pillar(double plotNo, double floorSize, double budget) {
        System.out.println("HomeChild:-First floor can be constructed");
    }

    @Override
    public void budget() {
        super.budget();
        System.out.println("HomeChild:-Budget is sufficient");
    }
}
