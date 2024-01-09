package com.xworkz.interfacea.nandishA.boot;

import com.xworkz.interfacea.nandishA.aman.HospitalRule;
import com.xworkz.interfacea.nandishA.aman.HospitalImpl;

public class HospitalRunner {
    public static void main(String[] args) {
        HospitalRule hospital= new HospitalImpl();
        hospital.hospitalCleanlinessRules("Raman",true);
        hospital.hospitalPatientTreatmentRules("Dr.Vijayshankar");
        hospital.ambulanceRules();
        hospital.cctvInstalled();
        HospitalImpl hospital1= new HospitalImpl();
        hospital1.ambulanceRules();
        hospital1.hospitalCleanlinessRules("Vikram",false);
        hospital1.hospitalPatientTreatmentRules("Dr.Raguv");
        hospital1.cctvInstalled();
    }
}
