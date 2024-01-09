package com.xworkz.interfacea.nandishA.aman;

public class HospitalImpl implements HospitalRule {
    private String inchargeName;
    private  boolean executed;
    private  String chiefDoctorName;
    @Override
    public void hospitalCleanlinessRules(String inchargeName, boolean executed) {
        this.inchargeName=inchargeName;
        this.executed=executed;
        System.out.println("Cleanliness is must to maintain hygiene");
        System.out.println("Cleanliness Incharge Name:"+inchargeName+ ",Cleaning Work done:"+executed);
    }

    @Override
    public void hospitalPatientTreatmentRules(String chiefDoctorName) {
        this.chiefDoctorName=chiefDoctorName;
        System.out.println("ChiefDoctor Name:"+chiefDoctorName);
        System.out.println("Patients are treated according to hospital rules");
    }

    @Override
    public boolean cctvInstalled() {
        return true;
    }

    @Override
    public void ambulanceRules() {

    }
}
