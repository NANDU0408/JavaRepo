package com.Xworkz.nandish_intelji.abstractClasses;

public class IndiaDubaiHighwayChild extends IndiaDubaiHighway{
    @Override
    public void highWay(String name, String tenderOwner) {
        System.out.println("IndiaDubaiHighwayChild:-Highway is ready to use");
    }

    @Override
    public void tenderPassed(boolean tenderPassed, String highWayName) {
        super.tenderPassed(tenderPassed, highWayName);
        System.out.println("IndiaDubaiHighwayChild:-Tender passed");
    }
}
