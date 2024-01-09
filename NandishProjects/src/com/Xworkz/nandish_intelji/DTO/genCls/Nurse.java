package com.Xworkz.nandish_intelji.DTO.genCls;

public class Nurse {
    String name;
    String designation;
    String dutyWardName;
    String specializedIn;
    String hospitalName;
    double age;
    double salary;
    double wardNo;
    double dutyHours;
    String location;

    public Nurse(){
        System.out.println("Nurse Running");
    }

    public Nurse(String name, String designation, String dutyWardName, String specializedIn, String hospitalName, double age, double salary, double wardNo, double dutyHours, String location){
        this.name=name;
        this.designation=designation;
        this.dutyWardName=dutyWardName;
        this.specializedIn=specializedIn;
        this.hospitalName=hospitalName;
        this.age=age;
        this.salary=salary;
        this.wardNo=wardNo;
        this.dutyHours=dutyHours;
        this.location=location;
        System.out.println("Nurse Running");
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDutyWardName() {
        return dutyWardName;
    }

    public String getSpecializedIn() {
        return specializedIn;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public double getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public double getWardNo() {
        return wardNo;
    }

    public double getDutyHours() {
        return dutyHours;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDutyWardName(String dutyWardName) {
        this.dutyWardName = dutyWardName;
    }

    public void setSpecializedIn(String specializedIn) {
        this.specializedIn = specializedIn;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWardNo(double wardNo) {
        this.wardNo = wardNo;
    }

    public void setDutyHours(double dutyHours) {
        this.dutyHours = dutyHours;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Nurse{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", dutyWardName='" + dutyWardName + '\'' +
                ", specializedIn='" + specializedIn + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", wardNo=" + wardNo +
                ", dutyHours=" + dutyHours +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Nurse LeftRef=this;
        if (obj!=null){
            if (obj instanceof Nurse){
                Nurse RightRef =(Nurse) obj;
                if (LeftRef.name.equals(RightRef.name) && LeftRef.designation.equals(RightRef.designation) && LeftRef.dutyWardName.equals(RightRef.dutyWardName) && LeftRef.specializedIn.equals(RightRef.specializedIn) && LeftRef.hospitalName.equals(RightRef.hospitalName) && LeftRef.age==RightRef.age && LeftRef.salary==RightRef.salary && LeftRef.wardNo==RightRef.wardNo && LeftRef.dutyHours==RightRef.dutyHours && LeftRef.location.equals(RightRef.location)){
                    System.out.println("Nurse:-Both references are same when compared with properties");
                return true;
                }
                else {
                    System.err.println("Nurse:-Both references are not same when compared");
                }
            }
        }
        else {
            System.err.println("Object not found");
        }
        return false;
    }
}
