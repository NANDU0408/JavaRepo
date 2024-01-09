package com.Xworkz.nandish_intelji.toString;

public class Bowl {
    String bowlType;
    String bowlFunction;
    double size;
    double cost;

    public Bowl(){
        System.out.println("Accessing bowl");
    }

    public void displayBowl(String bowlType, String bowlFunction, double size, double cost){
        this.bowlType=bowlType;
        this.bowlFunction=bowlFunction;
        this.size=size;
        this.cost=cost;
        System.out.println("Running displayBowl in Bowl");
    }
    @Override
    public String toString(){
        return "Bowl type is:"+this.bowlType+",functions:"+this.bowlFunction+",size is:"+this.size+",cost is:"+this.cost;
    }
}
