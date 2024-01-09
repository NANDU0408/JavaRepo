package com.Xworkz.nandish_intelji.equalsOperator;

public class WifiDongle {
    String brand;
    double transferRate;
    double itemWeight;

    public WifiDongle(String brand, double transferRate, double itemWeight){
        this.brand=brand;
        this.transferRate=transferRate;
        this.itemWeight=itemWeight;
        System.out.println("Running wifiDongle");
    }

    @Override
    public boolean equals(Object obj){
        WifiDongle wifiDongle=this;
        if(obj!=null){
            if(obj instanceof  WifiDongle){
                WifiDongle ref =(WifiDongle) obj;
                if(wifiDongle.transferRate==ref.transferRate && wifiDongle.itemWeight==ref.itemWeight){
                    System.out.println("WifiDongle and WifiDongle are same when compared with transferRate and batteryRequired");
                return true;
                }
                else{
                    System.err.println("WifiDongle and WifiDongle are not same when compared with transferRate and batteryRequired");
                }
            }
        }
        else{
            System.err.println("Object not found");
        }
        return false;
    }
}
