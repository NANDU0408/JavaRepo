package com.Xworkz.nandish_intelji.abstractClasses.Runner;

import com.Xworkz.nandish_intelji.abstractClasses.*;

public class HomeRunner {
    public static void main(String[] nnn){
        Home home =new HomeChild();
        home.pillar(234,500,4000000);
        home.budget();
        home.pillar(828,600,892789);
        home.budget();

        Chandrayan4 chandrayan4 = new Chandrayan4Child();
        chandrayan4.architecture(true, "Krishna");
        chandrayan4.Rocket("Blue","Sudarshan");
        chandrayan4.Rocket("White","Virat");
        chandrayan4.architecture(false,"V5");

        BengaloreChennaiExpressHighway bengaloreChennaiExpressHighway= new BengaloreChennaiExpressHighwayChild();
        bengaloreChennaiExpressHighway.bluePrint("Naman", 827838922);
        bengaloreChennaiExpressHighway.highway("Vijay","Anant");

        BulletTrain bulletTrain= new BulletTrainChild();
        bulletTrain.tender("Bangalore",7567766);
        bulletTrain.dateOfExecution(true, "Ratan");

        IndiaDubaiHighway indiaDubaiHighway= new IndiaDubaiHighwayChild();
        indiaDubaiHighway.highWay("Atal","Vijay");
        indiaDubaiHighway.tenderPassed(true,"Atal");
    }
}
