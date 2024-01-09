package com.Xworkz.nandish_intelji.toString;

public class Rice {
    String riceType;
    String storageType;
    double quantity;
    double cost;

    public Rice(){
        System.out.println("Accessing rice");
    }

    public void displayRice(String riceType, String storageType, double quantity, double cost){
        this.riceType=riceType;
        this.storageType=storageType;
        this.quantity=quantity;
        this.cost=cost;
        System.out.println("Running displayRice in Rice");
    }
    @Override
    public String toString(){
        return "Rice type is:"+this.riceType+",storage type:"+this.storageType+",quantity:"+this.quantity+",cost is:"+this.cost;
    }
}
