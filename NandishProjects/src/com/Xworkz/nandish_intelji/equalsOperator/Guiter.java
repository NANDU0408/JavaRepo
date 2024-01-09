package com.Xworkz.nandish_intelji.equalsOperator;

import java.util.Objects;

public class Guiter {
    double id;
    double price;
    String material;

    public Guiter(double id, double price, String material){
        this.id=id;
        this.price=price;
        this.material=material;
        System.out.println("Running Guiter");
    }

    @Override
    public boolean equals(Object obj){
        Guiter LeftRef= this;
        if(obj!=null) {
            if (obj instanceof Guiter) {
                Guiter RightRef = (Guiter) obj;
                if (LeftRef.id == RightRef.id && LeftRef.price == RightRef.price) {
                    System.out.println("Guiter and Guiter1 are same when compared with id and price");
                    return true;
                } else {
                    System.err.println("Guiter and Guiter1 are not same when compared with id and price ");
                }
            }
        }
            else{
                System.err.println("Object not present");
            }
            return false;
        }


    }
