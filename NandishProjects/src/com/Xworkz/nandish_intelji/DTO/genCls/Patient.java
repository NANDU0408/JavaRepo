package com.Xworkz.nandish_intelji.DTO.genCls;

public class Patient {
    private String patientName;
    private String ptDisease;
    private String ptAllergies;
    private String ptSymptoms;
    private String ptMedications;
    private double ptAge;
    private double medicationCost;
    private double noOfSurgeries;
    private double noOfBloodRequired;
    private String ptLocation;

    public  Patient(){
        System.out.println("Running Patient");
    }

    public Patient(String patientName, String ptDisease, String ptAllergies, String ptSymptoms, String ptMedications, double ptAge,double medicationCost, double noOfSurgeries, double noOfBloodRequired, String ptLocation){
        this.patientName=patientName;
        this.ptDisease=ptDisease;
        this.ptAllergies=ptAllergies;
        this.ptSymptoms=ptSymptoms;
        this.ptMedications=ptMedications;
        this.ptAge=ptAge;
        this.medicationCost=medicationCost;
        this.noOfSurgeries=noOfSurgeries;
        this.noOfBloodRequired=noOfBloodRequired;
        this.ptLocation=ptLocation;
        System.out.println("Patient Running");
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPtDisease() {
        return ptDisease;
    }

    public String getPtAllergies() {
        return ptAllergies;
    }

    public String getPtSymptoms() {
        return ptSymptoms;
    }

    public String getPtMedications() {
        return ptMedications;
    }

    public double getPtAge() {
        return ptAge;
    }

    public double getMedicationCost() {
        return medicationCost;
    }

    public double getNoOfSurgeries() {
        return noOfSurgeries;
    }

    public double getNoOfBloodRequired() {
        return noOfBloodRequired;
    }

    public String getPtLocation() {
        return ptLocation;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setPtDisease(String ptDisease) {
        this.ptDisease = ptDisease;
    }

    public void setPtAllergies(String ptAllergies) {
        this.ptAllergies = ptAllergies;
    }

    public void setPtSymptoms(String ptSymptoms) {
        this.ptSymptoms = ptSymptoms;
    }

    public void setPtMedications(String ptMedications) {
        this.ptMedications = ptMedications;
    }

    public void setPtAge(double ptAge) {
        this.ptAge = ptAge;
    }

    public void setMedicationCost(double medicationCost) {
        this.medicationCost = medicationCost;
    }

    public void setNoOfSurgeries(double noOfSurgeries) {
        this.noOfSurgeries = noOfSurgeries;
    }

    public void setNoOfBloodRequired(double noOfBloodRequired) {
        this.noOfBloodRequired = noOfBloodRequired;
    }

    public void setPtLocation(String ptLocation) {
        this.ptLocation = ptLocation;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +
                ", ptDisease='" + ptDisease + '\'' +
                ", ptAllergies='" + ptAllergies + '\'' +
                ", ptSymptoms='" + ptSymptoms + '\'' +
                ", ptMedications='" + ptMedications + '\'' +
                ", ptAge=" + ptAge +
                ", medicationCost=" + medicationCost +
                ", noOfSurgeries=" + noOfSurgeries +
                ", noOfBloodRequired=" + noOfBloodRequired +
                ", ptLocation='" + ptLocation + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        Patient LeftRef= this;
        if (obj!=null){
            if (obj instanceof Patient){
                Patient RightRef=(Patient) obj;
                if (LeftRef.patientName.equals(RightRef.patientName) && LeftRef.ptDisease.equals(RightRef.ptDisease) && LeftRef.ptAllergies.equals(RightRef.ptAllergies) && LeftRef.ptSymptoms.equals(RightRef.ptSymptoms) && LeftRef.ptMedications.equals(RightRef.ptMedications) && LeftRef.ptAge==RightRef.ptAge && LeftRef.medicationCost==RightRef.medicationCost && LeftRef.noOfSurgeries==RightRef.noOfSurgeries && LeftRef.noOfBloodRequired==RightRef.noOfBloodRequired && LeftRef.ptLocation.equals(RightRef.ptLocation)){
                    System.out.println("Patient:-Both references are same when compared with properties");
                    return true;
                }
                else {
                    System.err.println("Patient:-Both references are different when compared");
                }
            }
        }
        else {
            System.err.println("Object not found");
        }
       return false;

    }
}
