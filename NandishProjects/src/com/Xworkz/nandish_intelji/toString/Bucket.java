package com.Xworkz.nandish_intelji.toString;

public class Bucket {
    String bucketType;
    String bucketFunction;
    double size;
    double cost;

    public Bucket(){
        System.out.println("Accessing bucket");
    }

    public void displayBucket(String bucketType, String bucketFunction, double size, double cost){
        this.bucketType=bucketType;
        this.bucketFunction=bucketFunction;
        this.size=size;
        this.cost=cost;
        System.out.println("Running displayBucket in Bucket");
    }
    @Override
    public String toString(){
        return "Bucket type is:"+this.bucketType+",functions:"+this.bucketFunction+",size is:"+this.size+",cost is:"+this.cost;
    }
}
