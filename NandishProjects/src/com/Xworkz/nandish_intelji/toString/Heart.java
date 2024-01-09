package com.Xworkz.nandish_intelji.toString;

public class Heart {
    String heartType;
    String heartFunction;
    int noOfAtria;
    int noOfVentricle;

    public Heart(){
        System.out.println("Accessing heart");
    }

    public void displayHeart(String heartType, String heartFunction, int noOfAtria, int noOfVentricle){
        this.heartType=heartType;
        this.heartFunction=heartFunction;
        this.noOfAtria=noOfAtria;
        this.noOfVentricle=noOfVentricle;
        System.out.println("Running displayHeart in Heart");
    }
    @Override
    public String toString(){
        return "Heart type is:"+this.heartType+",functions:"+this.heartFunction+",number of atria:"+this.noOfAtria+",number of ventricles:"+this.noOfVentricle;
    }
}
