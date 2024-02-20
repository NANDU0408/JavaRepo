package com.xworkz.nandish.comparable.stream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class Medicine {
    public static void main(String[] args) {

//        MedicineDTO medicineDTO = new MedicineDTO(1,"Advil","Pfizer", LocalDate.of(2021,12,11),LocalDate.of(2023,12,11),56, new String[]{"Ibuprofen", "Calcium stearate"," Colloidal silicon dioxide", "Croscarmellose sodium", "Microcrystalline cellulose","Microcrystalline cellulose"});
//        MedicineDTO medicineDTO1 = new MedicineDTO(2,"Tylenol","Johnson & Johnson", LocalDate.of(2005,2,11),LocalDate.of(2007,2,11),75, new String[]{"Acetaminophen, Croscarmellose sodium, Povidone, Pregelatinized starch, Stearic acid"});
//        MedicineDTO medicineDTO2 = new MedicineDTO(3,"Zyrtec","Johnson & Johnson", LocalDate.of(2021,11,1),LocalDate.of(2022,11,1),36, new String[]{"Cetirizine hydrochloride, Colloidal silicon dioxide, Lactose monohydrate, Magnesium stearate, Microcrystalline cellulose"});
//        MedicineDTO medicineDTO3 = new MedicineDTO(4,"Claritin","Bayer", LocalDate.of(2023,11,11),LocalDate.of(2025,12,11),66, new String[]{"Loratadine, Calcium phosphate, Lactose monohydrate, Magnesium stearate, Pregelatinized starch"});
//        MedicineDTO medicineDTO4 = new MedicineDTO(5,"Aspirin","Bayer", LocalDate.of(2024,11,11),LocalDate.of(2026,11,11),67, new String[]{" Acetylsalicylic acid, Corn starch, Hypromellose, Powdered cellulose, Triacetin"});
//        MedicineDTO medicineDTO5 = new MedicineDTO(6,"Lipitor","Pfizer", LocalDate.of(2024,1,1),LocalDate.of(2026,1,1),57, new String[]{"Atorvastatin calcium, Calcium carbonate, Croscarmellose sodium, Lactose monohydrate, Microcrystalline cellulose"});
//        MedicineDTO medicineDTO6 = new MedicineDTO(7, "Nexium", "AstraZeneca", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 1, 1), 52, new String[]{"Esomeprazole magnesium, Corn starch, Crospovidone, Hyprolose, Magnesium stearate"});
//        MedicineDTO medicineDTO7 = new MedicineDTO(8, "Ventolin", "GlaxoSmithKline", LocalDate.of(2022, 2, 2), LocalDate.of(2023, 2, 2), 54, new String[]{"Albuterol sulfate, Anhydrous lactose, Microcrystalline cellulose, Oleic acid"});
//        MedicineDTO medicineDTO8 = new MedicineDTO(9, "Cymbalta", "Eli Lilly", LocalDate.of(2022, 3, 3), LocalDate.of(2023, 3, 3), 53, new String[]{"Duloxetine hydrochloride, FD&C Blue No. 2, Gelatin, Hypromellose, Titanium dioxide"});
//        MedicineDTO medicineDTO9 = new MedicineDTO(10, "Synthroid", "AbbVie", LocalDate.of(2022, 4, 4), LocalDate.of(2023, 4, 4), 59, new String[]{"Levothyroxine sodium, Colloidal silicon dioxide, Dibasic calcium phosphate dihydrate, Lactose monohydrate, Magnesium stearate"});
//        MedicineDTO medicineDTO10 = new MedicineDTO(11, "Plavix", "Bristol Myers Squibb", LocalDate.of(2022, 5, 5), LocalDate.of(2023, 5, 5), 41, new String[]{"Clopidogrel bisulfate, Hydrogenated castor oil, Hypromellose, Microcrystalline cellulose, Polyethylene glycol"});
//        MedicineDTO medicineDTO11 = new MedicineDTO(12, "Prozac", "Eli Lilly", LocalDate.of(2022, 6, 6), LocalDate.of(2023, 6, 6), 44, new String[]{"Fluoxetine hydrochloride, Colloidal silicon dioxide, FD&C Blue No. 1, FD&C Yellow No. 6, Gelatin"});
//        MedicineDTO medicineDTO12 = new MedicineDTO(13, "Celebrex", "Pfizer", LocalDate.of(2022, 7, 7), LocalDate.of(2023, 7, 7), 46, new String[]{"Celecoxib, Calcium phosphate, Croscarmellose sodium, Lactose monohydrate, Magnesium stearate"});
//        MedicineDTO medicineDTO13 = new MedicineDTO(14, "Singulair", "Merck", LocalDate.of(2022, 8, 8), LocalDate.of(2023, 8, 8), 47, new String[]{"Montelukast sodium, Croscarmellose sodium, Hydroxypropyl cellulose, Lactose monohydrate, and Magnesium stearate"});
//        MedicineDTO medicineDTO14 = new MedicineDTO(15, "Zoloft", "Pfizer", LocalDate.of(2022, 9, 9), LocalDate.of(2023, 9, 9), 57, new String[]{"Sertraline hydrochloride, Calcium phosphate, FD&C Blue No. 2, Hypromellose, and Magnesium stearate"});
//        MedicineDTO medicineDTO15 = new MedicineDTO(16, "Metformin", "Various(generic)", LocalDate.of(2022, 10, 10), LocalDate.of(2023, 10, 10), 51, new String[]{"Metformin hydrochloride, Hypromellose, Magnesium stearate, Polyethylene glycol, and Povidone"});
//        MedicineDTO medicineDTO16 = new MedicineDTO(17, "Ritalin", "Novartis", LocalDate.of(2022, 11, 11), LocalDate.of(2023, 11, 11), 71, new String[]{"Methylphenidate hydrochloride, Colloidal silicon dioxide, Lactose monohydrate, Pregelatinized starch, and Stearic acid"});
//        MedicineDTO medicineDTO17 = new MedicineDTO(18, "OxyContin", "Purdue Pharma", LocalDate.of(2022, 12, 12), LocalDate.of(2023, 12, 12), 74, new String[]{"Oxycodone hydrochloride, Ethylcellulose, Hydroxypropyl cellulose, Polyethylene glycol, and Povidone"});
//        MedicineDTO medicineDTO18 = new MedicineDTO(19, "Xanax", "Pfizer", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 1, 1), 25, new String[]{"Alprazolam, Colloidal silicon dioxide, Corn starch, Docusate sodium, and Lactose monohydrate"});
//        MedicineDTO medicineDTO19 = new MedicineDTO(20, "Benadryl", "Johnson & Johnson", LocalDate.of(2023, 2, 2), LocalDate.of(2024, 2, 2), 21, new String[]{"Diphenhydramine hydrochloride, Carnauba wax, Crospovidone, FD&C Blue No. 1, and Magnesium stearate"});

        MedicineDTO medicineDTO = new MedicineDTO(1, "Advil", "Pfizer", LocalDate.of(2021, 12, 11), LocalDate.of(2023, 12, 11), 56, new String[]{"Ibuprofen", "Calcium stearate", "Colloidal silicon dioxide", "Croscarmellose sodium", "Microcrystalline cellulose","Microcrystalline cellulose"});
        MedicineDTO medicineDTO1 = new MedicineDTO(2, "Tylenol", "Johnson & Johnson", LocalDate.of(2005, 2, 11), LocalDate.of(2007, 2, 11), 75, new String[]{"Acetaminophen", "Croscarmellose sodium", "Povidone", "Pregelatinized starch", "Stearic acid"});
        MedicineDTO medicineDTO2 = new MedicineDTO(3, "Zyrtec", "Johnson & Johnson", LocalDate.of(2021, 11, 1), LocalDate.of(2022, 11, 1), 36, new String[]{"Cetirizine hydrochloride", "Colloidal silicon dioxide", "Lactose monohydrate", "Magnesium stearate", "Microcrystalline cellulose"});
        MedicineDTO medicineDTO3 = new MedicineDTO(4, "Claritin", "Bayer", LocalDate.of(2023, 11, 11), LocalDate.of(2025, 12, 11), 66, new String[]{"Loratadine", "Calcium phosphate", "Lactose monohydrate", "Magnesium stearate", "Pregelatinized starch"});
        MedicineDTO medicineDTO4 = new MedicineDTO(5, "Aspirin", "Bayer", LocalDate.of(2024, 11, 11), LocalDate.of(2026, 11, 11), 67, new String[]{"Acetylsalicylic acid", "Corn starch", "Hypromellose", "Powdered cellulose", "Triacetin"});
        MedicineDTO medicineDTO5 = new MedicineDTO(6, "Lipitor", "Pfizer", LocalDate.of(2024, 1, 1), LocalDate.of(2026, 1, 1), 57, new String[]{"Atorvastatin calcium", "Calcium carbonate", "Croscarmellose sodium", "Lactose monohydrate", "Microcrystalline cellulose"});
        MedicineDTO medicineDTO6 = new MedicineDTO(7, "Nexium", "AstraZeneca", LocalDate.of(2022, 1, 1), LocalDate.of(2023, 1, 1), 52, new String[]{"Esomeprazole magnesium", "Corn starch", "Crospovidone", "Hyprolose", "Magnesium stearate"});
        MedicineDTO medicineDTO7 = new MedicineDTO(8, "Ventolin", "GlaxoSmithKline", LocalDate.of(2022, 2, 2), LocalDate.of(2023, 2, 2), 54, new String[]{"Albuterol sulfate", "Anhydrous lactose", "Microcrystalline cellulose", "Oleic acid"});
        MedicineDTO medicineDTO8 = new MedicineDTO(9, "Cymbalta", "Eli Lilly", LocalDate.of(2022, 3, 3), LocalDate.of(2023, 3, 3), 53, new String[]{"Duloxetine hydrochloride", "FD&C Blue No. 2", "Gelatin", "Hypromellose", "Titanium dioxide"});
        MedicineDTO medicineDTO9 = new MedicineDTO(10, "Synthroid", "AbbVie", LocalDate.of(2022, 4, 4), LocalDate.of(2023, 4, 4), 59, new String[]{"Levothyroxine sodium", "Colloidal silicon dioxide", "Dibasic calcium phosphate dihydrate", "Lactose monohydrate", "Magnesium stearate"});
        MedicineDTO medicineDTO10 = new MedicineDTO(11, "Plavix", "Bristol Myers Squibb", LocalDate.of(2022, 5, 5), LocalDate.of(2023, 5, 5), 41, new String[]{"Clopidogrel bisulfate", "Hydrogenated castor oil", "Hypromellose", "Microcrystalline cellulose", "Polyethylene glycol"});
        MedicineDTO medicineDTO11 = new MedicineDTO(12, "Prozac", "Eli Lilly", LocalDate.of(2022, 6, 6), LocalDate.of(2023, 6, 6), 44, new String[]{"Fluoxetine hydrochloride", "Colloidal silicon dioxide", "FD&C Blue No. 1", "FD&C Yellow No. 6", "Gelatin"});
        MedicineDTO medicineDTO12 = new MedicineDTO(13, "Celebrex", "Pfizer", LocalDate.of(2022, 7, 7), LocalDate.of(2023, 7, 7), 46, new String[]{"Celecoxib", "Calcium phosphate", "Croscarmellose sodium", "Lactose monohydrate", "Magnesium stearate"});
        MedicineDTO medicineDTO13 = new MedicineDTO(14, "Singulair", "Merck", LocalDate.of(2022, 8, 8), LocalDate.of(2023, 8, 8), 47, new String[]{"Montelukast sodium", "Croscarmellose sodium", "Hydroxypropyl cellulose", "Lactose monohydrate", "Magnesium stearate"});
        MedicineDTO medicineDTO14 = new MedicineDTO(15, "Zoloft", "Pfizer", LocalDate.of(2022, 9, 9), LocalDate.of(2023, 9, 9), 57, new String[]{"Sertraline hydrochloride", "Calcium phosphate", "FD&C Blue No. 2", "Hypromellose", "Magnesium stearate"});
        MedicineDTO medicineDTO15 = new MedicineDTO(16, "Metformin", "Various(generic)", LocalDate.of(2022, 10, 10), LocalDate.of(2023, 10, 10), 51, new String[]{"Metformin hydrochloride", "Hypromellose", "Magnesium stearate", "Polyethylene glycol", "Povidone"});
        MedicineDTO medicineDTO16 = new MedicineDTO(17, "Ritalin", "Novartis", LocalDate.of(2022, 11, 11), LocalDate.of(2023, 11, 11), 71, new String[]{"Methylphenidate hydrochloride", "Colloidal silicon dioxide", "Lactose monohydrate", "Pregelatinized starch", "Stearic acid"});
        MedicineDTO medicineDTO17 = new MedicineDTO(18, "OxyContin", "Purdue Pharma", LocalDate.of(2022, 12, 12), LocalDate.of(2023, 12, 12), 74, new String[]{"Oxycodone hydrochloride", "Ethylcellulose", "Hydroxypropyl cellulose", "Polyethylene glycol", "Povidone"});
        MedicineDTO medicineDTO18 = new MedicineDTO(19, "Xanax", "Pfizer", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 1, 1), 25, new String[]{"Alprazolam", "Colloidal silicon dioxide", "Corn starch", "Docusate sodium", "Lactose monohydrate"});
        MedicineDTO medicineDTO19 = new MedicineDTO(20, "Benadryl", "Johnson & Johnson", LocalDate.of(2023, 2, 2), LocalDate.of(2024, 2, 2), 21, new String[]{"Diphenhydramine hydrochloride", "Carnauba wax", "Crospovidone", "FD&C Blue No. 1", "Magnesium stearate"});


        List<MedicineDTO> medicine = new ArrayList<>();
        medicine.add(medicineDTO);
        medicine.add(medicineDTO1);
        medicine.add(medicineDTO2);
        medicine.add(medicineDTO3);
        medicine.add(medicineDTO4);
        medicine.add(medicineDTO5);
        medicine.add(medicineDTO6);
        medicine.add(medicineDTO7);
        medicine.add(medicineDTO8);
        medicine.add(medicineDTO9);
        medicine.add(medicineDTO10);
        medicine.add(medicineDTO11);
        medicine.add(medicineDTO12);
        medicine.add(medicineDTO13);
        medicine.add(medicineDTO14);
        medicine.add(medicineDTO15);
        medicine.add(medicineDTO16);
        medicine.add(medicineDTO17);
        medicine.add(medicineDTO18);
        medicine.add(medicineDTO19);

        System.out.println("Sorting by company name");
        medicine.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Sorting expiryDate in desc order");
        medicine.stream()
                .sorted((m1,m2) -> m2.getExpiryDate().compareTo(m1.getExpiryDate()))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Sorting by Cost in asc");
        medicine.stream()
                .sorted((m1,m2) -> Double.compare(m1.getCost(),m2.getCost()))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Collecting all elements where ingredients>5");
        medicine.stream()
                        .filter(m -> m.getIngredients().length > 5)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Collecting all ingredients");
        List<String> allIngredients = medicine.stream()
                .flatMap(m -> Arrays.stream(m.getIngredients())
                        .map(ingredient -> m.getName() + ": " + ingredient))
                .collect(Collectors.toList());

        System.out.println("All Ingredients from Medicine");
        allIngredients.forEach(System.out::println);

        System.out.println();
        System.out.println("Collecting only company name and sort by desc and print in upperCase");
        List<String> companyName = medicine.stream()
                .flatMap(m -> Arrays.stream(new String[]{m.getCompany()})
                        .map(company -> m.getName() + ": " + company.toUpperCase()))
                .collect(Collectors.toList());

        System.out.println("All Company from Medicine in upperCase");
        companyName.forEach(System.out::println);

        System.out.println();
        System.out.println("Sorting medicine name in desc order and printing in lowerCase");
        medicine.stream()
                .sorted((m1,m2) -> m2.getName().compareTo(m1.getName()))
                .flatMap(m->Arrays.stream(new String[]{m.getName()})
                        .map(name ->name.toLowerCase()))
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Collecting all elements where manufactureDate < 30");
        List<MedicineDTO> medicineDate = medicine.stream()
                .filter(m -> {
                    long days= m.getManufactureDate().toEpochDay()-LocalDate.now().toEpochDay();
                    return days<30;
                })
                .collect(Collectors.toList());
        medicineDate.forEach(System.out::println);

        System.out.println();
        System.out.println("Collecting all elements where manufactureDate > 30");
        List<MedicineDTO> medicineDate1 = medicine.stream()
                .filter(m -> {
                    long days= m.getManufactureDate().toEpochDay()-LocalDate.now().toEpochDay();
                    return days>30;
                })
                .collect(Collectors.toList());
        medicineDate1.forEach(System.out::println);

        System.out.println();
        System.out.println("Collecting all elements where expiryDate < 30");
        List<MedicineDTO> medicineDate2 = medicine.stream()
                .filter(m -> {
                    long days= m.getExpiryDate().toEpochDay()-LocalDate.now().toEpochDay();
                    return days<30;
                })
                .collect(Collectors.toList());
        medicineDate2.forEach(System.out::println);

        System.out.println();
        System.out.println("Collecting all elements where expiryDate > 30");
        List<MedicineDTO> medicineDate3 = medicine.stream()
                .filter(m -> {
                    long days= m.getExpiryDate().toEpochDay()-LocalDate.now().toEpochDay();
                    return days>30;
                })
                .collect(Collectors.toList());
        medicineDate3.forEach(System.out::println);
    }
}
