package com.Xworkz.nandish_intelji.toString;

public class Cotton {
    int quantity;
    String cottonType;
    String transportedCity;
    double cost;

    public Cotton(){
        System.out.println("Accessing Cotton");
    }

    public void displayCotton(int quantity, String cottonType, String transportedCity, double cost){
        this.quantity=quantity;
        this.cottonType=cottonType;
        this.transportedCity=transportedCity;
        this.cost=cost;
        System.out.println("Running displayCotton in Cotton");
    }

    @Override
    public String toString(){
        return  "Cotton Quantity:"+this.quantity+",cotton type is:"+this.cottonType+",transported city:"+this.transportedCity+",cost is:"+this.cost;
    }
}
