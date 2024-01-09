package com.Xworkz.nandish_intelji.toString;

public class Seed {
    String seedType;
    String color;
    int size;
    int cost;

    public Seed(){
        System.out.println("Accessing seed");
    }

    public void displaySeed(String seedType, String color, int size, int cost){
        this.seedType=seedType;
        this.color=color;
        this.size=size;
        this.cost=cost;
        System.out.println("Running displaySeed in Seed");
    }
    @Override
    public String toString(){
        return "Seed type is:"+this.seedType+",color is:"+this.color+",size is:"+this.size+",cost is:"+this.cost;
    }
}
