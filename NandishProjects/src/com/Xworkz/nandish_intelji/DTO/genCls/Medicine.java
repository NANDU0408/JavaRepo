package com.Xworkz.nandish_intelji.DTO.genCls;

public class Medicine {
    private String medicineName;
    private String medicineMedicalName;
    private boolean sideEffect;
    private boolean sleepingDrug;
    private String companyName;
    private double noOfTabInStrip;
    private double amountOfSleepingDrug;
    private double consumableAge;
    private double noOfDozePrescribed;
    private String productionLocation;

    public  Medicine(){
        System.out.println("Running Medicine");
    }

    public Medicine(String medicineName, String medicineMedicalName, boolean sideEffect, boolean sleepingDrug, String companyName, double noOfTabInStrip,double amountOfSleepingDrug, double consumableAge, double noOfDozePrescribed, String productionLocation){
        this.medicineName=medicineName;
        this.medicineMedicalName=medicineMedicalName;
        this.sideEffect=sideEffect;
        this.sleepingDrug=sleepingDrug;
        this.companyName=companyName;
        this.noOfTabInStrip=noOfTabInStrip;
        this.amountOfSleepingDrug=amountOfSleepingDrug;
        this.consumableAge=consumableAge;
        this.noOfDozePrescribed=noOfDozePrescribed;
        this.productionLocation=productionLocation;
        System.out.println("Medicine Running");
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getMedicineMedicalName() {
        return medicineMedicalName;
    }

    public boolean isSideEffect() {
        return sideEffect;
    }

    public boolean isSleepingDrug() {
        return sleepingDrug;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getNoOfTabInStrip() {
        return noOfTabInStrip;
    }

    public double getAmountOfSleepingDrug() {
        return amountOfSleepingDrug;
    }

    public double getConsumableAge() {
        return consumableAge;
    }

    public double getNoOfDozePrescribed() {
        return noOfDozePrescribed;
    }

    public String getProductionLocation() {
        return productionLocation;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setMedicineMedicalName(String medicineMedicalName) {
        this.medicineMedicalName = medicineMedicalName;
    }

    public void setSideEffect(boolean sideEffect) {
        this.sideEffect = sideEffect;
    }

    public void setSleepingDrug(boolean sleepingDrug) {
        this.sleepingDrug = sleepingDrug;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setNoOfTabInStrip(double noOfTabInStrip) {
        this.noOfTabInStrip = noOfTabInStrip;
    }

    public void setAmountOfSleepingDrug(double amountOfSleepingDrug) {
        this.amountOfSleepingDrug = amountOfSleepingDrug;
    }

    public void setConsumableAge(double consumableAge) {
        this.consumableAge = consumableAge;
    }

    public void setNoOfDozePrescribed(double noOfDozePrescribed) {
        this.noOfDozePrescribed = noOfDozePrescribed;
    }

    public void setProductionLocation(String productionLocation) {
        this.productionLocation = productionLocation;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineName='" + medicineName + '\'' +
                ", medicineMedicalName='" + medicineMedicalName + '\'' +
                ", sideEffect=" + sideEffect +
                ", sleepingDrug=" + sleepingDrug +
                ", companyName='" + companyName + '\'' +
                ", noOfTabInStrip=" + noOfTabInStrip +
                ", amountOfSleepingDrug=" + amountOfSleepingDrug +
                ", consumableAge=" + consumableAge +
                ", noOfDozePrescribed=" + noOfDozePrescribed +
                ", productionLocation='" + productionLocation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        Medicine LeftRef= this;
        if (obj!=null){
            if (obj instanceof Medicine){
                Medicine RightRef=(Medicine) obj;
                if (LeftRef.medicineName.equals(RightRef.medicineName) && LeftRef.medicineMedicalName.equals(RightRef.medicineMedicalName) && LeftRef.sideEffect==RightRef.sideEffect && LeftRef.sleepingDrug==RightRef.sleepingDrug && LeftRef.companyName.equals(RightRef.companyName) && LeftRef.noOfTabInStrip==RightRef.noOfTabInStrip && LeftRef.amountOfSleepingDrug==RightRef.amountOfSleepingDrug && LeftRef.consumableAge==RightRef.consumableAge && LeftRef.noOfDozePrescribed==RightRef.noOfDozePrescribed && LeftRef.productionLocation.equals(RightRef.productionLocation)){
                    System.out.println("Medicine:-Both references are same when compared with properties");
                    return true;
                }
                else {
                    System.err.println("Medicine:-Both references are different when compared");
                }
            }
        }
        else {
            System.err.println("Object not found");
        }
        return false;

    }
}
