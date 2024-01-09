package com.xworkz.interfacea.nandishA.collectionJ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Statue {
    public static void main(String[] args) {
        Collection<String> statue = new ArrayList<>();
        statue.add("Statue of Unity");
        statue.add("Statue of Liberty");
        statue.add("Statue of Prosperity");
        statue.add("Statue of Aman");
        statue.add("Statue of AmarJawan");
        statue.add("Statue of Julius CeasoR");
        statue.add("Statue of Augustus Ceasor");
        statue.add("Statue of Shree Ram");
        statue.add("Statue of Hanuman");
        statue.add("Statue of Subhash Chandra Bose");
        statue.add("Statue of Baghat Singh");
        statue.add("Statue of Sukdev");
        statue.add("Statue of RajGuru");
        statue.add("Statue of ChandraShekarAzad");
        statue.add("Statue of Savarkar");
        statue.add("Statue of Lala Lajpat Roy");
        statue.add("Statue of Jyothi Bhaii Pule");
        statue.add("Statue of FM Kariyappa");
        statue.add("Statue of Ambedkar");
        statue.add("Statue of Bharat Mata");
        statue.add("Statue of Ganesh");
        statue.add("Statue of Garuda");
        statue.add("Statue of Peace");
        statue.add("Statue of Love");
        statue.add("Statue of Harbhajan Singh Baba");
        statue.add("Statue of Krishna");
        statue.add("Statue of Kaveri");
        statue.add("Statue of Bal Gangadhar Tilak");
        statue.add("Statue of Nathuram Godse");
        statue.add("Statue of FM Manekshaw");
        statue.add("Statue of KargilVijayotsav");
        statue.add("Statue of Dhayanchand");
        statue.add("Statue of Sunil Chetri");
        statue.add("Statue of Abdul Kalam");
        statue.add("Statue of Surya");
        statue.add("Statue of Chandra");
        statue.add("Statue of First Rocket");
        statue.add("Statue of Mangalayan Rocket");
        statue.add("Statue of Vigneshwar");
        statue.add("Statue of RamHanuman");
        statue.add("Statue of Gommateshwara");

        Iterator<String> Itr = statue.iterator();
        while (Itr.hasNext()){
            String stat = Itr.next();
            if (stat.endsWith("r")){
                System.out.println("The statue name ending with r: "+stat);
            }
        }
    }
}
