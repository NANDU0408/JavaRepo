package com.xworkz.nandish.comparable.set.setRunner;

import com.xworkz.nandish.comparable.set.setDTO.carlicenceDTO.CarDTO;
import com.xworkz.nandish.comparable.set.setDTO.carlicenceDTO.ManufacturerDTO;
import com.xworkz.nandish.comparable.set.setDTO.productvendorDTO.ProductDTO;
import com.xworkz.nandish.comparable.set.setDTO.productvendorDTO.VendorDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarDriverRunner {
    public static void main(String[] args) {
        CarDTO car1 = new CarDTO("Toyota", "Camry", 2022);
        CarDTO car2 = new CarDTO("Honda", "Civic", 2021);
        CarDTO car3 = new CarDTO("Ford", "Mustang", 2023);
        CarDTO car4 = new CarDTO("Chevrolet", "Malibu", 2020);
        CarDTO car5 = new CarDTO("BMW", "X5", 2022);

        ManufacturerDTO manufacturer1 = new ManufacturerDTO("Toyota Motor Corporation", "Japan",5);
        ManufacturerDTO manufacturer2 = new ManufacturerDTO("Honda Motor Co., Ltd.", "Japan",4);
        ManufacturerDTO manufacturer3 = new ManufacturerDTO("Ford Motor Company", "United States",4);
        ManufacturerDTO manufacturer4 = new ManufacturerDTO("General Motors", "United States",3);
        ManufacturerDTO manufacturer5 = new ManufacturerDTO("Bayerische Motoren Werke AG (BMW)", "Germany",2);



        Map<CarDTO, ManufacturerDTO> carManufacturerMap = new HashMap<>();
        carManufacturerMap.put(car1, manufacturer1);
        carManufacturerMap.put(car2, manufacturer2);
        carManufacturerMap.put(car3, manufacturer3);
        carManufacturerMap.put(car4, manufacturer4);
        carManufacturerMap.put(car5, manufacturer5);


        CarDTO car6 = new CarDTO("Mercedes", "E-Class", 2021);
        ManufacturerDTO manufacturer6 = new ManufacturerDTO("Mercedes-Benz", "Germany",2);

        System.out.println("Car6 is existing: " + carManufacturerMap.containsKey(car6));
        System.out.println();

        carManufacturerMap.put(car6, manufacturer6);

        carManufacturerMap.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println();
        System.out.println("Printing both key and value");
        Set<Map.Entry<CarDTO, ManufacturerDTO>> entrySet = carManufacturerMap.entrySet();
        for (Map.Entry<CarDTO, ManufacturerDTO> entry : entrySet) {
            CarDTO key1 = entry.getKey();
            ManufacturerDTO value1 = entry.getValue();
            System.out.println("Car: " + key1 + ", Manufacturer: " + value1);
        }
    }
}
