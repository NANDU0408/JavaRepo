package com.Xworkz.nandish_intelji.DTO.genCls;

public class MedicalStore {
    private String storeName;
    private String ownerName;
    private String managerName;
    private String storeRegisteredName;
    private String typeOfMedications;
    private double noOfStaff;
    private double income;
    private double distance;
    private double noOfMedications;
    private String storeLocation;

    public  MedicalStore(){
        System.out.println("Running MedicalStore");
    }

    public MedicalStore(String storeName, String ownerName, String managerName, String storeRegisteredName, String typeOfMedications, double noOfStaff,double income, double distance, double noOfMedications, String storeLocation){
        this.storeName=storeName;
        this.ownerName=ownerName;
        this.managerName=managerName;
        this.storeRegisteredName=storeRegisteredName;
        this.typeOfMedications=typeOfMedications;
        this.noOfStaff=noOfStaff;
        this.income=income;
        this.distance=distance;
        this.noOfMedications=noOfMedications;
        this.storeLocation=storeLocation;
        System.out.println("MedicalStore Running");
    }

    public String getStoreName() {
        return storeName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getManagerName() {
        return managerName;
    }

    public String getStoreRegisteredName() {
        return storeRegisteredName;
    }

    public String getTypeOfMedications() {
        return typeOfMedications;
    }

    public double getNoOfStaff() {
        return noOfStaff;
    }

    public double getIncome() {
        return income;
    }

    public double getDistance() {
        return distance;
    }

    public double getNoOfMedications() {
        return noOfMedications;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void setStoreRegisteredName(String storeRegisteredName) {
        this.storeRegisteredName = storeRegisteredName;
    }

    public void setTypeOfMedications(String typeOfMedications) {
        this.typeOfMedications = typeOfMedications;
    }

    public void setNoOfStaff(double noOfStaff) {
        this.noOfStaff = noOfStaff;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setNoOfMedications(double noOfMedications) {
        this.noOfMedications = noOfMedications;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    @Override
    public String toString() {
        return "MedicalStore{" +
                "storeName='" + storeName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", managerName='" + managerName + '\'' +
                ", storeRegisteredName='" + storeRegisteredName + '\'' +
                ", typeOfMedications='" + typeOfMedications + '\'' +
                ", noOfStaff=" + noOfStaff +
                ", income=" + income +
                ", distance=" + distance +
                ", noOfMedications=" + noOfMedications +
                ", storeLocation='" + storeLocation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj){
        MedicalStore LeftRef= this;
        if (obj!=null){
            if (obj instanceof MedicalStore){
                MedicalStore RightRef=(MedicalStore) obj;
                if (LeftRef.storeName.equals(RightRef.storeName) && LeftRef.ownerName.equals(RightRef.ownerName) && LeftRef.managerName.equals(RightRef.managerName) && LeftRef.storeRegisteredName.equals(RightRef.storeRegisteredName) && LeftRef.typeOfMedications.equals(RightRef.typeOfMedications) && LeftRef.noOfStaff==RightRef.noOfStaff && LeftRef.income==RightRef.income && LeftRef.distance==RightRef.distance && LeftRef.noOfMedications==RightRef.noOfMedications && LeftRef.storeLocation.equals(RightRef.storeLocation)){
                    System.out.println("MedicalStore:-Both references are same when compared with properties");
                    return true;
                }
                else {
                    System.err.println("MedicalStore:-Both references are different when compared");
                }
            }
        }
        else {
            System.err.println("Object not found");
        }
        return false;

    }
}
