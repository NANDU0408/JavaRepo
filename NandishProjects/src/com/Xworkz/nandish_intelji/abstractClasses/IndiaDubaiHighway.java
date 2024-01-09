package com.Xworkz.nandish_intelji.abstractClasses;

public abstract class IndiaDubaiHighway {
    public abstract void highWay(String name, String tenderOwner);
    public void tenderPassed(boolean tenderPassed, String highWayName){
        System.err.println("IndiaDubaiHighwayParent:-Tender Not Passed");
    }
}
