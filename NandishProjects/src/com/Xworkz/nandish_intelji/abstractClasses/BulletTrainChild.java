package com.Xworkz.nandish_intelji.abstractClasses;

import java.util.Date;

public class BulletTrainChild extends BulletTrain{
    @Override
    public void tender(String location, double tenderQuoted) {
        System.out.println("BulletTrainChild:-Implemented Successfully");
    }

    @Override
    public void dateOfExecution(Boolean tender, String tenderOfferedTo) {
        super.dateOfExecution(tender, tenderOfferedTo);
        System.out.println("BulletTrainChild:-Successful");
    }
}
