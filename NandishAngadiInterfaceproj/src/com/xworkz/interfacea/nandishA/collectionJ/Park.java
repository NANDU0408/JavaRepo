package com.xworkz.interfacea.nandishA.collectionJ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Park {
    public static void main(String[] args) {
        Collection<String> park = new ArrayList<>();
        park.add("Park of Unity");
        park.add("Park of Liberty");
        park.add("Park of Prosperity");
        park.add("Park of Aman");
        park.add("Park of AmarJawan");
        park.add("Park of Julius CeasoR");
        park.add("Park of Augustus Ceasor");
        park.add("Park of Shree Ram");
        park.add("Park of Hanuman");
        park.add("Park of Subhash Chandra Bose");
        park.add("Park of Baghat Singh");
        park.add("Park of Sukdev");
        park.add("Park of RajGuru");
        park.add("Park of ChandraShekarAzad");
        park.add("Park of Savarkar");
        park.add("Park of Lala Lajpat Roy");
        park.add("Park of Jyothi Bhaii Pule");
        park.add("Park of FM Kariyappa");
        park.add("Park of Ambedkar");
        park.add("Park of Bharat Mata");
        park.add("Park of Ganesh");
        park.add("Park of Garuda");
        park.add("Park of Peace");
        park.add("Park of Love");
        park.add("Park of Boutanical Garden");
        park.add("Park of Krishna");
        park.add("Park of Kaveri");
        park.add("Park of Bal Gangadhar Tilak");
        park.add("Park of Rose Garden");
        park.add("Park of FM Manekshaw");
        park.add("Park of KargilVijayotsav");
        park.add("Park of Cubbon");
        park.add("Park of LalBhagh");
        park.add("Park of Abdul Kalam");
        park.add("Park of Vilson Garden");
        park.add("Park of Chandra");
        park.add("Park of First Rocket");
        park.add("Park of Mangalayan Rocket");
        park.add("Park of Vigneshwar");
        park.add("Park of RamHanuman");
        park.add("Park of Gommateshwara");
        park.add("Park of Janardhar");
        park.add("Park of Udupi");
        park.add("Park of Kittur Rani Chennamma");
        park.add("Park of Rani Lakshmi Bhaii");
        park.add("Park of Vishwajeet");
        park.add("Park of Jantar Mantar");
        park.add("Park of VikasWadi");
        park.add("Park of Freedom");
        park.add("Park of RajTheerth");
        park.add("Park of Halowen");
        park.add("Park of Hola");
        park.add("Park of Yashwardhan");
        park.add("Park of Lok");
        park.add("Park of Trilok");
        park.add("Park of Trishanku");
        park.add("Park of Padmavibhushan");
        park.add("Park of Bharat");
        park.add("Park of Geeta");
        park.add("Park of Vedha");
        park.add("Park of Rajarajendra");

        Iterator<String> Itr = park.iterator();
        while (Itr.hasNext()){
            String pa = Itr.next();
            if (pa.startsWith("b") || pa.endsWith("k")){
                System.out.println("The park name starting with b or ending with k: "+pa);
            }

        }    }
}
