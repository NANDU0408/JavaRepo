package com.Xworkz.nandish_intelji.toString;

public class Lens {
    int lensWidth;
    String lensType;
    String brand;
    double cost;

    public Lens(){
        System.out.println("Lens help to correct abnormal eyes");
    }

    public void displayLens(int lensWidth, String lensType, String brand, double cost){
        this.lensWidth= lensWidth;
        this.lensType= lensType;
        this.brand=brand;
        this.cost= cost;
        System.out.println("Running displayLens");
    }

    @Override
    public String toString(){
        return "lens brand :"+this.brand+",   lensType: "+this.lensType+", cost is: "+this.cost;
    }

    @Override
    public int hashCode(){
        return 100;
    }
}
