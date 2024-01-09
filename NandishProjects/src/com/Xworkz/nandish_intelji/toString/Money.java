package com.Xworkz.nandish_intelji.toString;

public class Money {
    String currencyType;
    String noteCondition;
    double size;
    double makingCost;

    public Money(){
        System.out.println("Accessing money");
    }

    public void displayMoney(String currencyType, String noteCondition, double size, double makingCost){
        this.currencyType=currencyType;
        this.noteCondition=noteCondition;
        this.size=size;
        this.makingCost=makingCost;
        System.out.println("Running displayMoney in Money");
    }
    @Override
    public String toString(){
        return "Currency type is:"+this.currencyType+",condition of note:"+this.noteCondition+",size of:"+this.size+",making cost is:"+this.makingCost;
    }
}
