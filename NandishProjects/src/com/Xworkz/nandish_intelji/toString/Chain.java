package com.Xworkz.nandish_intelji.toString;

public class Chain {
    String chainType;
    String storeName;
    double size;
    double cost;

    public Chain(){
        System.out.println("Accessing chain");
    }

    public void displayChain(String chainType, String storeName, double size, double cost){
        this.chainType=chainType;
        this.storeName=storeName;
        this.size=size;
        this.cost=cost;
        System.out.println("Running displayChain in Chain");
    }
    @Override
    public String toString(){
        return "Chain type is:"+this.chainType+",storeName:"+this.storeName+",size:"+this.size+",cost:"+this.cost;
    }
}
