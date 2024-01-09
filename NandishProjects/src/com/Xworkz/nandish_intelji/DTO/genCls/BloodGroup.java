package com.Xworkz.nandish_intelji.DTO.genCls;

public class BloodGroup {
    private String donorName;
    private String receiverName;
    private boolean sugar;
    private boolean bloodPressure;
    private String bloodGroup;
    private double noOfUnits;
    private double noOfStoredUnits;
    private double donorAge;
    private double receiverAge;
    private String Location;

    public  BloodGroup(){
        System.out.println("Running BloodGroup");
    }

    public BloodGroup(String donorName, String receiverName, boolean sugar, boolean bloodPressure, String bloodGroup, double noOfUnits,double noOfStoredUnits, double donorAge, double receiverAge, String Location){
        this.donorName=donorName;
        this.receiverName=receiverName;
        this.sugar=sugar;
        this.bloodPressure=bloodPressure;
        this.bloodGroup=bloodGroup;
        this.noOfUnits=noOfUnits;
        this.noOfStoredUnits=noOfStoredUnits;
        this.donorAge=donorAge;
        this.receiverAge=receiverAge;
        this.Location=Location;
        System.out.println("BloodGroup Running");
    }

    public String getDonorName() {
        return donorName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public boolean isSugar() {
        return sugar;
    }

    public boolean isBloodPressure() {
        return bloodPressure;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public double getNoOfUnits() {
        return noOfUnits;
    }

    public double getNoOfStoredUnits() {
        return noOfStoredUnits;
    }

    public double getDonorAge() {
        return donorAge;
    }

    public double getReceiverAge() {
        return receiverAge;
    }

    public String getLocation() {
        return Location;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public void setBloodPressure(boolean bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setNoOfUnits(double noOfUnits) {
        this.noOfUnits = noOfUnits;
    }

    public void setNoOfStoredUnits(double noOfStoredUnits) {
        this.noOfStoredUnits = noOfStoredUnits;
    }

    public void setDonorAge(double donorAge) {
        this.donorAge = donorAge;
    }

    public void setReceiverAge(double receiverAge) {
        this.receiverAge = receiverAge;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString() {
        return "BloodGroup{" +
                "donorName='" + donorName + '\'' +
                ", receiverName='" + receiverName + '\'' +
                ", sugar=" + sugar +
                ", bloodPressure=" + bloodPressure +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", noOfUnits=" + noOfUnits +
                ", noOfStoredUnits=" + noOfStoredUnits +
                ", donorAge=" + donorAge +
                ", receiverAge=" + receiverAge +
                ", Location='" + Location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        BloodGroup LeftRef= this;
        if (obj!=null){
            if (obj instanceof BloodGroup){
                BloodGroup RightRef=(BloodGroup) obj;
                if (LeftRef.donorName.equals(RightRef.donorName) && LeftRef.receiverName.equals(RightRef.receiverName) && LeftRef.sugar==RightRef.sugar && LeftRef.bloodPressure==RightRef.bloodPressure && LeftRef.bloodGroup.equals(RightRef.bloodGroup) && LeftRef.noOfUnits==RightRef.noOfUnits && LeftRef.noOfStoredUnits==RightRef.noOfStoredUnits && LeftRef.donorAge==RightRef.donorAge && LeftRef.receiverAge==RightRef.receiverAge && LeftRef.Location.equals(RightRef.Location)){
                    System.out.println("BloodGroup:-Both references are same when compared with properties");
                    return true;
                }
                else {
                    System.err.println("BloodGroup:-Both references are different when compared");
                }
            }
        }
        else {
            System.err.println("Object not found");
        }
        return false;

    }
}
