package com.Xworkz.nandish_intelji.toString;

public class Bandli {
    String bandliType;
    String bandliFunction;
    double size;
    double cost;

    public Bandli(){
        System.out.println("Accessing bandli");
    }

    public void displayBandli(String bandliType, String bandliFunction, double size, double cost){
        this.bandliType=bandliType;
        this.bandliFunction=bandliFunction;
        this.size=size;
        this.cost=cost;
        System.out.println("Running displayBandli in Bandli");
    }
    @Override
    public String toString(){
        return "Bandli type is:"+this.bandliType+",functions:"+this.bandliFunction+",size is:"+this.size+",cost is:"+this.cost;
    }
}
