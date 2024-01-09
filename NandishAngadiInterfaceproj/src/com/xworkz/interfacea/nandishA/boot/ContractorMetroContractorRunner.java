package com.xworkz.interfacea.nandishA.boot;

import com.xworkz.interfacea.nandishA.interfaceMultipleInheritance.Contractor;
import com.xworkz.interfacea.nandishA.interfaceMultipleInheritance.MetroContractor;

public class ContractorMetroContractorRunner {
    public static void main(String[] args) {
        System.out.println("Starting main in ContractorMetroContractorRunner");

        Contractor contractor = new Contractor();
        contractor.areaDeveloped();
        contractor.cleaningContractor();
        contractor.cityDevelopment();
        contractor.developmentOfficer();
        contractor.inchargeOfficer();
        contractor.investigationOfficer();
        contractor.sewageCleaningTruck();
        contractor.investigated();


        MetroContractor metroContractor = new MetroContractor();
        metroContractor.garbageCollected();
        metroContractor.cleaningContractor();
        metroContractor.areaDeveloped();
        metroContractor.cityDevelopment();
        metroContractor.inchargeOfficer();
        metroContractor.developmentOfficer();
        metroContractor.garbageSeparation();
        metroContractor.investigated();
        metroContractor.investigationOfficer();
        metroContractor.sewageCleaningTruck();
    }
}
