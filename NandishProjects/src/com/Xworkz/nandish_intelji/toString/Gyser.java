package com.Xworkz.nandish_intelji.toString;

public class Gyser {
    String gyserType;
    String brand;
    double weight;
    double cost;

    public Gyser(){
        System.out.println("Accessing gyser");
    }

    public void displayGyser(String gyserType, String brand, double weight, double cost){
        this.gyserType=gyserType;
        this.brand=brand;
        this.weight=weight;
        this.cost=cost;
        System.out.println("Running displayGyser in Gyser");
    }
    @Override
    public String toString(){
        return "Gyser type is:"+this.gyserType+",brand is:"+this.brand+",weight is:"+this.weight+",cost is:"+this.cost;
    }
}
