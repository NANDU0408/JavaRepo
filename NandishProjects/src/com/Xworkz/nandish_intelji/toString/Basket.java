package com.Xworkz.nandish_intelji.toString;

public class Basket {
    String basketType;
    String basketFunction;
    double size;
    double cost;

    public Basket(){
        System.out.println("Accessing basket");
    }

    public void displayBasket(String basketType, String basketFunction, double size, double cost){
        this.basketType=basketType;
        this.basketFunction=basketFunction;
        this.size=size;
        this.cost=cost;
        System.out.println("Running displayBasket in Basket");
    }
    @Override
    public String toString(){
        return "Basket type is:"+this.basketType+",functions:"+this.basketFunction+",size is:"+this.size+",cost is:"+this.cost;
    }
}
