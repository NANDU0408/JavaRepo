package com.Xworkz.nandish_intelji.DTO.Runner;

import com.Xworkz.nandish_intelji.DTO.genCls.*;

public class DTORunner {
    public static void main(String[] nnn){
        System.out.println("Starting main in DTORunner");
        System.out.println(" ");
        System.out.println("Hospital");
        System.out.println("======================================================");
        Hospital hospital= new Hospital("MNR","RAM","BTM", 119,28397847, 54, 50, 24, 18,"Vikas");
        Hospital hospital1= new Hospital("MNR","RAM","BTM", 119,28397847, 54, 50, 24, 18,"Vikas");
        System.out.println("======================================================");
        hospital.setHospital("MNR","RAM","BTM", 119,28397847, 54, 50, 24, 18,"Vikas");
        hospital1.setHospital("MNR","RAM","BTM", 119,28397847, 54, 50, 24, 18,"Vikas");
        System.out.println("Hospital Info:"+hospital);
        System.out.println("======================================================");
        System.out.println("Hospital Info:"+hospital1);
        System.out.println("======================================================");
        boolean man =hospital.equals(hospital1);
        System.out.println("Hospital comparison = " + man);
        System.out.println("======================================================");
        System.out.println(" ");


        System.out.println("Patient");
        System.out.println("======================================================");
        Patient patient= new Patient("Vikas","Cancer","NoAllergies", "Weakness","BP_Medicines", 54, 500000, 1, 5,"Krishnagiri");
        Patient patient1= new Patient("Rani","Cancer","Cucumber", "Weakness","NoMedications", 54, 500000, 1, 5,"Krishnagiri");
        patient.setPatientName("Raj");
        patient.setPtDisease("Nimonia");
        patient.setPtAllergies("Cabbage");
        patient.setPtSymptoms("Continuous Fever");
        patient.setPtMedications("SugarTab");
        patient.setPtAge(46);
        patient.setMedicationCost(56000);
        patient.setNoOfSurgeries(2);
        patient.setNoOfBloodRequired(4);
        patient.setPtLocation("Ramnagar");

        patient1.setPatientName("Mansi");
        patient1.setPtDisease("Nimonia");
        patient1.setPtAllergies("Cabbage");
        patient1.setPtSymptoms("Continuous Fever");
        patient1.setPtMedications("NoMedications");
        patient1.setPtAge(46);
        patient1.setMedicationCost(56000);
        patient1.setNoOfSurgeries(1);
        patient1.setNoOfBloodRequired(4);
        patient1.setPtLocation("Ramnagar");

        System.out.println("======================================================");
        System.out.println("Patient Info:"+patient);
        System.out.println("======================================================");
        System.out.println("Patient Info:"+patient1);
        System.out.println("======================================================");
        boolean man1 =patient.equals(patient1);
        System.out.println("Patient comparison = " + man1);
        System.out.println("======================================================");

        System.out.println(" ");
        System.out.println("Nurse");
        System.out.println("======================================================");
        Nurse nurse= new Nurse("Anu","SeniorNurse","ICU", "operation","MNC_Hospital", 41, 50000, 1, 8,"Krishnagiri");
        Nurse nurse1= new Nurse("Anu","SeniorNurse","ICU", "operation","MNC_Hospital", 41, 50000, 1, 8,"Krishnagiri");
        nurse.setName("Anu");
        nurse.setDesignation("SeniorNurse");
        nurse.setDutyWardName("ICU");
        nurse.setSpecializedIn("Operation");
        nurse.setHospitalName("MNC_Hospital");
        nurse.setAge(41);
        nurse.setSalary(50000);
        nurse.setWardNo(1);
        nurse.setDutyHours(8);
        nurse.setLocation("Ramnagar");

        nurse1.setName("Anu");
        nurse1.setDesignation("SeniorNurse");
        nurse1.setDutyWardName("ICU");
        nurse1.setSpecializedIn("Operation");
        nurse1.setHospitalName("MNC_Hospital");
        nurse1.setAge(41);
        nurse1.setSalary(50000);
        nurse1.setWardNo(1);
        nurse1.setDutyHours(8);
        nurse1.setLocation("Ramnagar");

        System.out.println("======================================================");
        System.out.println("Nurse Info:"+nurse);
        System.out.println("======================================================");
        System.out.println("Nurse Info:"+nurse1);
        System.out.println("======================================================");
        boolean man2 =nurse.equals(nurse1);
        System.out.println("Nurse comparison= " + man2);
        System.out.println("======================================================");

        System.out.println(" ");
        System.out.println("MedicalStore");
        System.out.println("======================================================");
        MedicalStore medicalStore= new MedicalStore("Shiv Medical Stores","Vidhyarthi","Mohan", "Shiv Homeyopathic Medical Stores Co. Ltd(Regd)","Homeyopathic", 5, 500000, 10, 7000,"Vijaynagar");
        MedicalStore medicalStore1= new MedicalStore("Shiv Medical Stores","Vidhyarthi","Mohan", "Shiv Homeyopathic Medical Stores Co. Ltd(Regd)","Homeyopathic", 5, 500000, 10, 7000,"Vijaynagar");
        medicalStore.setStoreName("Shiv Medical Stores");
        medicalStore.setOwnerName("Vidhyarthi");
        medicalStore.setManagerName("Vijay");
        medicalStore.setStoreRegisteredName("Shiv Homeyopathic Medical Stores Co. Ltd(Regd)");
        medicalStore.setTypeOfMedications("Homeyopathic");
        medicalStore.setNoOfStaff(5);
        medicalStore.setIncome(500000);
        medicalStore.setDistance(10);
        medicalStore.setNoOfMedications(7000);
        medicalStore.setStoreLocation("Vijaynagar");

        medicalStore1.setStoreName("Shiv Medical Stores");
        medicalStore1.setOwnerName("Vidhyarthi");
        medicalStore1.setManagerName("Mohan");
        medicalStore1.setStoreRegisteredName("Shiv Homeyopathic Medical Stores Co. Ltd(Regd)");
        medicalStore1.setTypeOfMedications("Homeyopathic");
        medicalStore1.setNoOfStaff(5);
        medicalStore1.setIncome(500000);
        medicalStore1.setDistance(10);
        medicalStore1.setNoOfMedications(7000);
        medicalStore1.setStoreLocation("Vijaynagar");

        System.out.println("======================================================");
        System.out.println("MedicalStore Info:"+medicalStore);
        System.out.println("======================================================");
        System.out.println("MedicalStore Info:"+medicalStore1);
        System.out.println("======================================================");
        boolean man3 =medicalStore.equals(medicalStore1);
        System.out.println("MedicalStore comparison= " + man3);
        System.out.println("======================================================");

        System.out.println(" ");
        System.out.println("Bloodgroup");
        System.out.println("======================================================");
        BloodGroup bloodGroup= new BloodGroup("Vijay","Vijet",true, false,"AB+", 4, 50, 35, 34,"Vijaynagar");
        BloodGroup bloodGroup1= new BloodGroup("Vijay","Vijet",true, false,"AB+", 4, 50, 35, 34,"Vijaynagar");
        bloodGroup.setDonorName("Vijay");
        bloodGroup.setReceiverName("Vijet");
        bloodGroup.setSugar(true);
        bloodGroup.setBloodPressure(false);
        bloodGroup.setBloodGroup("AB+");
        bloodGroup.setNoOfUnits(4);
        bloodGroup.setNoOfStoredUnits(50);
        bloodGroup.setDonorAge(35);
        bloodGroup.setReceiverAge(34);
        bloodGroup.setLocation("Vijaynagar");

        bloodGroup1.setDonorName("Vijay");
        bloodGroup1.setReceiverName("Vijet");
        bloodGroup1.setSugar(true);
        bloodGroup1.setBloodPressure(false);
        bloodGroup1.setBloodGroup("AB+");
        bloodGroup1.setNoOfUnits(4);
        bloodGroup1.setNoOfStoredUnits(50);
        bloodGroup1.setDonorAge(35);
        bloodGroup1.setReceiverAge(34);
        bloodGroup1.setLocation("Vijaynagar");

        System.out.println("======================================================");
        System.out.println("BloodGroup Info:"+bloodGroup);
        System.out.println("======================================================");
        System.out.println("BloodGroup Info:"+bloodGroup1);
        System.out.println("======================================================");
        boolean man4 =bloodGroup.equals(bloodGroup1);
        System.out.println("BloodGroup comparison= " + man4);
        System.out.println("======================================================");

        System.out.println(" ");
        System.out.println("Medicine");
        System.out.println("======================================================");
        Medicine medicine= new Medicine("Montair FX","montelukast and fexofenadine",false, true,"Cipla", 10, 25, 18, 100,"Bangalore");
        Medicine medicine1= new Medicine("Montair FX","montelukast and fexofenadine",false, true,"Cipla", 10, 25, 18, 100,"Bangalore");
        medicine.setMedicineName("Montair FX");
        medicine.setMedicineMedicalName("montelukast and fexofenadine");
        medicine.setSideEffect(false);
        medicine.setSleepingDrug(true);
        medicine.setCompanyName("Cipla");
        medicine.setNoOfTabInStrip(10);
        medicine.setAmountOfSleepingDrug(25);
        medicine.setConsumableAge(18);
        medicine.setNoOfDozePrescribed(100);
        medicine.setProductionLocation("Bangalore");

        medicine1.setMedicineName("Montair FX");
        medicine1.setMedicineMedicalName("montelukast and fexofenadine");
        medicine1.setSideEffect(false);
        medicine1.setSleepingDrug(true);
        medicine1.setCompanyName("Cipla");
        medicine1.setNoOfTabInStrip(10);
        medicine1.setAmountOfSleepingDrug(25);
        medicine1.setConsumableAge(18);
        medicine1.setNoOfDozePrescribed(100);
        medicine1.setProductionLocation("Bangalore");

        System.out.println("======================================================");
        System.out.println("Medicine Info:"+medicine);
        System.out.println("======================================================");
        System.out.println("Medicine Info:"+medicine1);
        System.out.println("======================================================");
        boolean man5 =medicine.equals(medicine1);
        System.out.println("Medicine comparison= " + man5);
        System.out.println("======================================================");

        System.out.println("Ending main in DTORunner");
        System.out.println("======================================================");

    }
}
