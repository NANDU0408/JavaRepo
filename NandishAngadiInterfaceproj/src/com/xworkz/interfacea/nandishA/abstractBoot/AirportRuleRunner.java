package com.xworkz.interfacea.nandishA.abstractBoot;

import com.xworkz.interfacea.nandishA.abstracti.AirPortRule;
import com.xworkz.interfacea.nandishA.abstracti.ChiefAdmin;
import com.xworkz.interfacea.nandishA.abstracti.Traveller;

public class AirportRuleRunner {
    public static void main(String[] args) {
        AirPortRule airPortRule = new Traveller();
        ChiefAdmin chiefAdmin = new ChiefAdmin(airPortRule);
        chiefAdmin.check();
    }
}
