package com.Xworkz.nandish_intelji.toString;

public class Locker {
    int lockerNo;
    String brand;
    String lockerType;
    int Capacity;

    public Locker(){
        System.out.println("Locker is given to keep the valuable things");
    }

    public void displayLocker(int lockerNo, String brand, String lockerType, int Capacity){
        this.lockerNo=lockerNo;
        this.brand =brand;
        this.lockerType=lockerType;
        this.Capacity=Capacity;
        System.out.println("Running displayLocker in Locker");
    }

    @Override
    public String toString(){
        return  "Locker number is:"+this.lockerNo+",locker brand is:"+this.brand+",Capacity is:"+this.Capacity;
    }
}
