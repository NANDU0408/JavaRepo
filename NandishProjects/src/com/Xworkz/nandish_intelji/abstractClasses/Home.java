package com.Xworkz.nandish_intelji.abstractClasses;

public abstract class Home {
    public abstract void pillar(double plotNo, double floorSize, double budget);

    public void budget(){
        System.err.println("HomeParent:-Budget is not sufficient");
    }
}
