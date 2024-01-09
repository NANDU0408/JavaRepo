package com.xworkz.interfacea.nandishA.aman;

public interface HospitalRule {
    final String name="Vikrant Hospital";
    final String type="Heart Hospital";

    void hospitalCleanlinessRules(String inchargeName,boolean executed);
    void hospitalPatientTreatmentRules(String chiefDoctorName);
    boolean cctvInstalled();
    void ambulanceRules();
}
