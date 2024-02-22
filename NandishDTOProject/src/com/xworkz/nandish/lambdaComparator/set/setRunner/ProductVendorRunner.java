package com.xworkz.nandish.comparable.set.setRunner;

import com.xworkz.nandish.comparable.set.setDTO.productvendorDTO.ProductDTO;
import com.xworkz.nandish.comparable.set.setDTO.productvendorDTO.VendorDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProductVendorRunner {
    public static void main(String[] args) {
        ProductDTO product1 = new ProductDTO("Laptop", 1200.0, 10);
        ProductDTO product2 = new ProductDTO("AndroidPhone", 600.0, 20);
        ProductDTO product3 = new ProductDTO("IPhone", 300.0, 15);
        ProductDTO product4 = new ProductDTO("System", 300.0, 15);
        ProductDTO product5 = new ProductDTO("SoundSystem", 300.0, 15);

        VendorDTO vendor1 = new VendorDTO("TechMart", "CityA", "123-456-7890");
        VendorDTO vendor2 = new VendorDTO("ElectroCo", "CityB", "987-654-3210");
        VendorDTO vendor3 = new VendorDTO("HeloCo", "CityC", "987-654-5765");
        VendorDTO vendor4 = new VendorDTO("VeloCo", "CityD", "564-654-7769");
        VendorDTO vendor5 = new VendorDTO("YeloCo", "CityE", "987-565-4646");

        Map<ProductDTO, VendorDTO> productVendorMap = new HashMap<>();
        productVendorMap.put(product1, vendor1);
        productVendorMap.put(product2, vendor2);
        productVendorMap.put(product3, vendor3);
        productVendorMap.put(product4, vendor4);
        productVendorMap.put(product5, vendor5);


        ProductDTO product6 = new ProductDTO("Laptop", 250.0, 8);
        VendorDTO vendor6 = new VendorDTO("PrintPal", "CityD", "789-012-3456");


        System.out.println("Product6 is existing: " + productVendorMap.containsKey(product6));
        System.out.println();

        productVendorMap.put(product6, vendor6);

        productVendorMap.forEach((k, v) -> System.out.println(k + " : " + v));

        System.out.println("===================");

        System.out.println();
        System.out.println("Printing both key and value");
        Set<Map.Entry<ProductDTO, VendorDTO>> entrySet = productVendorMap.entrySet();
        for (Map.Entry<ProductDTO, VendorDTO> entry : entrySet) {
            ProductDTO key1 = entry.getKey();
            VendorDTO value1 = entry.getValue();
            System.out.println("Product: " + key1 + ", Vendor: " + value1);
        }
    }
}
