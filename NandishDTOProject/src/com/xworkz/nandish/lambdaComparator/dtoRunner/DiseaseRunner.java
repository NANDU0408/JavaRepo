package com.xworkz.nandish.lambdaComparator.dtoRunner;

import com.xworkz.nandish.lambdaComparator.dto.DiseaseDTO;

import java.util.ArrayList;
import java.util.List;

public class DiseaseRunner {
    public static void main(String[] args) {

        DiseaseDTO diseaseDTO1 = new DiseaseDTO("Influenza", "Viral", "Fever, cough, fatigue", 3);
        DiseaseDTO diseaseDTO2 = new DiseaseDTO("Hypertension", "Chronic", "High blood pressure", 5);
        DiseaseDTO diseaseDTO3 = new DiseaseDTO("Diabetes", "Metabolic", "Increased blood sugar levels", 4);
        DiseaseDTO diseaseDTO4 = new DiseaseDTO("Common Cold", "Viral", "Runny nose, sneezing", 2);
        DiseaseDTO diseaseDTO5 = new DiseaseDTO("Migraine", "Neurological", "Severe headache, nausea", 4);

        List<DiseaseDTO> diseaseList = new ArrayList<>();
        diseaseList.add(diseaseDTO1);
        diseaseList.add(diseaseDTO2);
        diseaseList.add(diseaseDTO3);
        diseaseList.add(diseaseDTO4);
        diseaseList.add(diseaseDTO5);

        // Name Comparator
        diseaseList.sort((d1, d2) -> d1.getName().compareTo(d2.getName()));
        System.out.println("Name Ascending Order");
        diseaseList.forEach(System.out::println);

        System.out.println();

        diseaseList.sort((d1, d2) -> d2.getName().compareTo(d1.getName()));
        System.out.println("Name Descending Order");
        diseaseList.forEach(System.out::println);

        System.out.println();

        // Type Comparator
        diseaseList.sort((d1, d2) -> d1.getType().compareTo(d2.getType()));
        System.out.println("Type Ascending Order");
        diseaseList.forEach(System.out::println);
        System.out.println();

        diseaseList.sort((d1, d2) -> d2.getType().compareTo(d1.getType()));
        System.out.println("Type Descending Order");
        diseaseList.forEach(System.out::println);
        System.out.println();

        // Symptoms Comparator
        diseaseList.sort((d1, d2) -> d1.getSymptoms().compareTo(d2.getSymptoms()));
        System.out.println("Symptoms Ascending Order");
        diseaseList.forEach(System.out::println);
        System.out.println();

        diseaseList.sort((d1, d2) -> d2.getSymptoms().compareTo(d1.getSymptoms()));
        System.out.println("Symptoms Descending Order");
        diseaseList.forEach(System.out::println);
        System.out.println();

        // Severity Level Comparator
        diseaseList.sort((d1, d2) -> Integer.compare(d1.getSeverityLevel(), d2.getSeverityLevel()));
        System.out.println("Severity Level Ascending Order");
        diseaseList.forEach(System.out::println);
        System.out.println();

        diseaseList.sort((d1, d2) -> Integer.compare(d2.getSeverityLevel(), d1.getSeverityLevel()));
        System.out.println("Severity Level Descending Order");
        diseaseList.forEach(System.out::println);
        System.out.println();
    }
}