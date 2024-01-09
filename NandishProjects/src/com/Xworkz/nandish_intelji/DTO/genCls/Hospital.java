package com.Xworkz.nandish_intelji.DTO.genCls;

import com.Xworkz.nandish_intelji.equalsOperator.Guiter;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Objects;

public class Hospital {
    private String hospitalName;
    private String deanName;
    private String location;
    private double noOfDoctors;
    private double noOfBeds;
    private double income;
    private double noOfNurses;
    private double noOfStaff;
    private double noOfEquipments;
    private String ownerName;

    public  Hospital(){
        System.out.println("Running Hospital");
    }

    public  Hospital(String hospitalName, String deanName, String location, double noOfDoctors, double noOfBeds, double income, double noOfNurses, double noOfStaff, double noOfEquipments, String ownerName){
        this.hospitalName=hospitalName;
        this.deanName=deanName;
        this.location=location;
        this.noOfDoctors=noOfDoctors;
        this.noOfBeds=noOfBeds;
        this.income=income;
        this.noOfNurses=noOfNurses;
        this.noOfStaff=noOfStaff;
        this.noOfEquipments=noOfEquipments;
        this.ownerName=ownerName;
        System.out.println("Hospital Running");
    }

    public String getHospitalName(){
        return  hospitalName;
    }

    public String getDeanName(){
        return deanName;
    }

    public String getLocation(){
        return location;
    }

    public double getNoOfDoctors(){
        return  noOfDoctors;
    }

    public  double getNoOfBeds(){
        return noOfBeds;
    }

    public double getIncome(){
        return  income;
    }

    public double getNoOfNurses(){
        return  noOfNurses;
    }

    public  double getNoOfStaff(){
        return  noOfStaff;
    }

    public  double getNoOfEquipments(){
        return noOfEquipments;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setHospital(String hospitalName, String deanName, String location, double noOfDoctors, double noOfBeds, double income, double noOfNurses, double noOfStaff, double noOfEquipments, String ownerName){
        this.hospitalName=hospitalName;
        this.deanName=deanName;
        this.location=location;
        this.noOfDoctors=noOfDoctors;
        this.noOfBeds=noOfBeds;
        this.income=income;
        this.noOfNurses=noOfNurses;
        this.noOfStaff=noOfStaff;
        this.noOfEquipments=noOfEquipments;
        this.ownerName=ownerName;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", deanName='" + deanName + '\'' +
                ", location='" + location + '\'' +
                ", noOfDoctors=" + noOfDoctors +
                ", noOfBeds=" + noOfBeds +
                ", income=" + income +
                ", noOfNurses=" + noOfNurses +
                ", noOfStaff=" + noOfStaff +
                ", noOfEquipments=" + noOfEquipments +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
    @Override
   public boolean equals(Object obj){
        Hospital LeftRef= this;
        if (obj!=null){
            if (obj instanceof Hospital) {
                Hospital RightRef = (Hospital) obj;
                if (LeftRef.hospitalName.equals(RightRef.hospitalName) && LeftRef.deanName.equals(RightRef.deanName) && LeftRef.location.equals(RightRef.location) && LeftRef.noOfDoctors == RightRef.noOfDoctors && LeftRef.noOfBeds == RightRef.noOfBeds && LeftRef.income == RightRef.income && LeftRef.noOfNurses == RightRef.noOfNurses && LeftRef.noOfStaff == RightRef.noOfStaff && LeftRef.noOfEquipments == RightRef.noOfEquipments && LeftRef.ownerName.equals(RightRef.ownerName)){
                System.out.println("Hospital:-Both references are same when compared with properties");
                return  true;
                }

                else{
                    System.err.println("Hospital:-Both references are not same");
                }
            }
        }
        else{
            System.err.println("Object not present");
        }
        return false;
    }
}
