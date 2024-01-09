package com.Xworkz.nandish_intelji.abstractClasses;

import java.util.Date;

public abstract class BulletTrain {
    public abstract void tender(String location, double tenderQuoted);

    public void  dateOfExecution(Boolean tender, String tenderOfferedTo){
        System.err.println("BulletTrainParent:-Not executed");
    }
}
