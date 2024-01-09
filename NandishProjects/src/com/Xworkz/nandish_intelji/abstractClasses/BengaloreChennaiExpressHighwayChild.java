package com.Xworkz.nandish_intelji.abstractClasses;

public class BengaloreChennaiExpressHighwayChild extends BengaloreChennaiExpressHighway{
    @Override
    public void highway(String name, String constructorName) {
        System.out.println("BengaloreChennaiExpressHighwayChild:-Highway is ready for use");
    }

    @Override
    public void bluePrint(String engineerName, double budget) {
        super.bluePrint(engineerName, budget);
        System.out.println("BengaloreChennaiExpressHighwayChild:-BluePrint is accurate");
    }
}
