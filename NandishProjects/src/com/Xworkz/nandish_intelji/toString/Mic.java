package com.Xworkz.nandish_intelji.toString;

public class Mic {
    String micType;
    String brand;
    int noOfBatteries;
    int cost;

    public Mic(){
        System.out.println("Accessing Mic");
    }

    public void displayMic(String micType, String brand,int noOfBatteries,int cost){
        this.micType=micType;
        this.brand=brand;
        this.noOfBatteries=noOfBatteries;
        this.cost=cost;
        System.out.println("Running displayMic in Mic");
    }

    @Override
    public String toString(){
        return  "Mic type is:"+this.micType+",of brand:"+this.brand+",number of batteries:"+this.noOfBatteries+",cost is:"+this.cost;
    }
}
