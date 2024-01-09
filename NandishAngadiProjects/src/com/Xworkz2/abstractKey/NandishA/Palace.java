package com.Xworkz2.abstractKey.NandishA;

public abstract class Palace {
    private String location;
   private String propertyOwnerName;
   private double areaSize;

   public Palace(String location, String propertyOwnerName, double areaSize){
       this.location=location;
       this.propertyOwnerName=propertyOwnerName;
       this.areaSize=areaSize;
   }

    public Palace(String location,double areaSize) {
        this.location = location;
        this.areaSize=areaSize;
    }

    @Override
    public String toString() {
        return "Palace{" +
                "location='" + location + '\'' +
                ", propertyOwnerName='" + propertyOwnerName + '\'' +
                ", areaSize=" + areaSize +
                '}';
    }

    public abstract void drainage(String controlor,boolean checkOnce);
}
