package com.Xworkz.nandish_intelji.toString;

public class Spoon {
    String spoonType;
    String spoonFunction;
    double size;
    double cost;

    public Spoon(){
        System.out.println("Accessing spoon");
    }

    public void displaySpoon(String spoonType, String spoonFunction, double size, double cost){
        this.spoonType=spoonType;
        this.spoonFunction=spoonFunction;
        this.size=size;
        this.cost=cost;
        System.out.println("Running displaySpoon in Spoon");
    }
    @Override
    public String toString(){
        return "Spoon type is:"+this.spoonType+",functions:"+this.spoonFunction+",size is:"+this.size+",cost is:"+this.cost;
    }
}
